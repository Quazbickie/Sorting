import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Create ArrayList for Shapes
        ArrayList<Shapes> shapeList = new ArrayList<>();

        boolean keepGoing = true;

        //User Input loop
        while(keepGoing){

            Scanner myScanner = new Scanner(System.in);

            System.out.println("What would you like to do?\n" +
                    "1) Create Circle\n" +
                    "2) Create Rectangle\n" +
                    "3) See largest shape\n" +
                    "4) Exit (Serialize and Deserialize)\n");

            int userChoice = myScanner.nextInt();

            //Create Circle from user input
            if(userChoice == 1){
                System.out.println("Please enter radius size for new Circle");
                double radius = myScanner.nextDouble();
                shapeList.add(new Circle(radius));
                shapeList.get(shapeList.size()-1).calculateArea();
            }

            //Create Rectangle from user input
            else if (userChoice == 2) {
                System.out.println("Please enter length of Rectangle");
                double length = myScanner.nextDouble();
                System.out.println("Please enter width of Rectangle");
                double width = myScanner.nextDouble();
                shapeList.add(new Rectangle(length,width));
                shapeList.get(shapeList.size()-1).calculateArea();
            }

            //Return and print the largest shape in the list
            else if (userChoice == 3) {
                System.out.println("The largest shape in the list is:\n" + largestShape(shapeList).toString());
            }

            //Exit program, serialize and deserialize the data
            else if (userChoice == 4) {
                keepGoing = false;
                serializeList(shapeList);
                deserializeList();
                System.out.println("Program Terminated");
            }

        }

    }

    //Step through list to find and return the largest shape by area
    public static Shapes largestShape(List<Shapes> list){
        Shapes largest = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).compareShapes(largest) == 1){
                largest = list.get(i);
            }
        }
        return largest;
    }

    //Method to Serialize list and store it in output.dat file
    public static void serializeList(List<Shapes> list){

        //Create file output stream in order to write raw byte data to output.dat
        //Create object output stream that can write primitive Java data types to
        //our previously created output stream. Write our list object to the stream,
        //and then close both streams.
        try {
            FileOutputStream fileOut = new FileOutputStream("output.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(list);
            out.close();
            fileOut.close();

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    //Method to deserialize list from output.dat file
    public static void deserializeList() {

        //Create file input stream that will obtain input bytes from file.
        //Object input stream recovers objects that were previously serialized.
        //Store the data in listIn and print each element. Close both data streams.
        try {
            FileInputStream fileIn = new FileInputStream("output.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<Shapes> listIn = (ArrayList<Shapes>) in.readObject();
            System.out.println("\nReading data from output.dat");
            for(Shapes i : listIn){
                System.out.println(i.toString());
            }
            in.close();
            fileIn.close();
        } catch(IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
