public class BinaryTree {

    Node root;

    public void addNode(int key, String name){

        Node newNode = new Node(key, name);

        if(root == null){
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;

            while(true){
                parent = focusNode;

                if(key < focusNode.key){
                    focusNode = focusNode.leftChild;

                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;

                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }

            }
        }
    }


    public void inOrderTraversal(Node focusNode){
        if(focusNode == null){
            return;
        }

        inOrderTraversal(focusNode.leftChild);
        System.out.println(focusNode);
        inOrderTraversal(focusNode.rightChild);
    }

    public void preOrderTraversal(Node focusNode){
        if(focusNode == null){
            return;
        }
        System.out.println(focusNode);
        preOrderTraversal(focusNode.leftChild);
        preOrderTraversal(focusNode.rightChild);
    }

    public void postOrderTraversal(Node focusNode){
        if(focusNode==null){
            return;
        }

        postOrderTraversal(focusNode.leftChild);
        postOrderTraversal(focusNode.rightChild);
        System.out.println(focusNode);
    }

    public Node findNode(int key){
        Node focusNode = root;

        while(focusNode.key != key){
            if(key < focusNode.key){
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
            if(focusNode == null){
                return null;
            }
        }

        return focusNode;
    }

    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();
        theTree.addNode(12, "A");
        theTree.addNode(4, "B");
        theTree.addNode(44, "C");
        theTree.addNode(23, "D");
        theTree.addNode(1, "E");
        theTree.addNode(88, "F");
        theTree.addNode(76, "G");

        theTree.inOrderTraversal(theTree.root);
        System.out.println("____+++____+++___");
        theTree.preOrderTraversal(theTree.root);
        System.out.println("____+++____+++___");
        theTree.postOrderTraversal(theTree.root);
        System.out.println("____+++____+++___");
        System.out.println("____+++____+++___");
        System.out.println(theTree.findNode(4));
        System.out.println(theTree.findNode(88));




    }



}


class Node {
    Node leftChild;
    Node rightChild;

    int key;
    String name;


    Node(int key, String name) {
        this.key = key;
        this.name = name;
    }


    public String toString(){
        return name + " has a key " + key;
    }
}