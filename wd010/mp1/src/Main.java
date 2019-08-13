public class Main {
    public static void main(String[] args) {

    Node rootNode = new Node(6);

        rootNode.addNode(3);
        rootNode.addNode(4);
        rootNode.addNode(8);
        rootNode.addNode(5);
        rootNode.addNode(7);
        rootNode.addNode(9);

        System.out.println("should return ");rootNode.getValue();
        System.out.println("should return ");rootNode.getLeft().getValue();
    try{
      System.out.println("should return ");rootNode.getLeft().getLeft().getValue();
    } catch (NullPointerException e) {
        System.out.println("null");
    }
      System.out.println("should return ");rootNode.getLeft().getRight().getValue();
      System.out.println("should return ");rootNode.getRight().getValue();
      System.out.println("should return ");rootNode.getRight().getLeft().getValue();
      System.out.println("should return ");rootNode.getRight().getRight().getValue();



        System.out.println("\n" +"inOrder:" +"\n");
        rootNode.inOrder();

        System.out.println("\n" +"preOrder:");
        rootNode.preOrder();

        System.out.println("\n\n" +"postOrder: ");
        rootNode.postOrder();

        System.out.println("\n" +"findNode: ");
        rootNode.findNode(6);


    }
}
