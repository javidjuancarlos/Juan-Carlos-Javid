public class Node {

//    private Node rootNode;
//    private int num;
//    private Node left;
//    private Node right;
//
//    public Node () {};
//    public Node (int num) {
//        this.num = num;
//    }
//
//    public void getNode () {
//        System.out.println(this.num);
//        return;
//    };
//
//    public Node getLeft () {
//        System.out.println(this.num);
//        return this.left;
//    };
//
//    public Node getRight () {
//        System.out.println(this.num);
//        return this.right;
//    };
//
//    public int getValue () {
//        System.out.println(this.num);
//        return this.num;
//    };
//
//    public void addNode (int num) {
//
//        Node newNode = new Node (num);

//        if (rootNode == null){ //kung walang laman si root node at null siya
////            System.out.println("null");
//            rootNode = newNode; // rootnode is new node yung binigay mong bagong node
//        } else {
//            Node targetNode = rootNode; //kung hindi siya null, si targetNode na si rootNode, na may bagong left and right
//            Node parentTargetNode;  // gawa pa tayo isa pang class na parent node kasi di mo siya ma cacall kapag wala
//            while(true) { //kapag di pa din siya null at may laman siya, si parentTargetNode magiging si targetNode given the following conditions
//                parentTargetNode = targetNode;
//                if (num < targetNode.num) {
//                    targetNode = targetNode.left;
//                    if(targetNode == null) {
//                        parentTargetNode.left = newNode;
//                        return;
//                    }
//                } else {
//                    targetNode = targetNode.right;
//                    if(targetNode == null) {
//                        parentTargetNode.right = newNode;
//                        return;
//                    }
//                }
//            }
//        }

//    public void inOrder (Node targetNode) {
//        if(targetNode != null) { //gang di siya null mag traverse ka, Siya din lagi ang nasa dulo
//            inOrder(targetNode.left); //pakaliwa muna kasi siya pinakamaliit
//            System.out.println(targetNode.num); //kapag di siya null print mo na
//            inOrder(targetNode.right); // tapos si right naman, nasa dulo ka pa din kasi nasa loob ka nung hindi null na target
//
//        }
//    }
//
//    public void preOrder (Node targetNode) {
//        if(targetNode != null) { //gang di siya null mag traverse ka, Siya din lagi ang nasa dulo
//            System.out.println(targetNode.num); //kapag di siya null print mo na
//            preOrder(targetNode.left); //pakaliwa muna kasi siya pinakamaliit
//            preOrder(targetNode.right); // tapos si right naman, nasa dulo ka pa din kasi nasa loob ka nung hindi null na target
//
//        }
//    }
//
//    public void postOrder (Node targetNode) {
//        if(targetNode != null) { //gang di siya null mag traverse ka, Siya din lagi ang nasa dulo
//            postOrder(targetNode.left); //pakaliwa muna kasi siya pinakamaliit
//            postOrder(targetNode.right); // tapos si right naman, nasa dulo ka pa din kasi nasa loob ka nung hindi null na target
//            System.out.println(targetNode.num); //kapag di siya null print mo na
//
//        }
//    }
//
////    public Node findNode(int num) {
////        System.out.println("null");
////        while(num != this.num) { //habang di equal si num kay rootNode
////            if (num < this.num) { //recur tong function na to, tingin kay kaliwa
////                this.num = this.left;
////            } else {
////                rootNode = rootNode.right; //tingin kanan
////            } if (rootNode == null) //if null edi wala
////                return null;
////
////        }
////        System.out.println(rootNode.num);
////        return rootNode; //kapag equal na sila, return mo na si rootNode na hanap mo
////    }
//
//
//

        private int value;
        private Node left;
        private Node right;
//        private String orders="";

        public Node(){}
        public Node(int value) {
            this.value = value;
        }

        public void addNode(int value) {
            if(value < this.value) {
                if(this.left == null) {
                    this.left = new Node(value);
                } else this.left.addNode(value);
            }
            if(value > this.value) {
                if(this.right == null) {
                    this.right = new Node(value);
                } else this.right.addNode(value);
            }
        }
        public int getValue() {
            System.out.println(this.value);
            return this.value;
        }

        public Node getLeft() {
            return this.left;
        }

        public Node getRight() {
            return this.right;
        }

        public boolean findNode (int value){
            System.out.println(this.value);
        if(this.value == value) return true;
        if(this.value > value) {
            if(this.left == null) return false;
            return this.left.findNode(value);
        }else if(this.value < value) {
            if(this.right == null) return false;
            return this.right.findNode(value);
        }

            return false;

        }

        public void inOrder() {
            if(this.left != null) {
                this.left.inOrder();
            }
            System.out.println(this.value);
            if(this.right != null) {
                this.right.inOrder();
            }
        }

        public void preOrder() {
            System.out.print("\n" +this.value);
            if(this.left != null) {
                this.left.preOrder();
            }
            if(this.right != null) {
                this.right.preOrder();
            }
        }

        public void postOrder() {
            if(this.left != null) {
                this.left.postOrder();
            }
            if(this.right != null) {
                this.right.postOrder();
            }
            System.out.print("\n" +this.value);
        }



}


























