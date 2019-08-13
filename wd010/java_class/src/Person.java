//public class Person {
//    private String name;
//    private int age;
//    private Pet myPet;

//    step 1: para makagawa ng person na tatanggap ng arguments
//    public Person() {
//
//    }

//    step 2: may arguments na, pero need to specify yung type of data. String and int
//    public Person(String arg1, int arg2) {
//            this.name = arg1; pambato sa Main.java ni name
//            this.age = arg2; pambato sa Main.java ni age
//    }

//    public Person(String arg1, int arg2) {
//        this.name = arg1;
//        this.age = arg2;
//    }
//
//    //para pwede ka mag gawa ng person na walang values sa loob ng () dun sa main, na pwedeng mag let ka ng attributes sa baba niya
//    public Person() {
//
//    }
//
//    //pang string/name lang
//    public Person(String arg1) {
//        this.name = arg1;
//    }
//
//    //pang integer/age lang
//    public Person(int arg2) {
//        this.age = arg2;
//    }
//
//    public String sayHello() {
//        return "Hello";
//    }
//
//    public String saySomething(String arg1) {
//        return arg1;
//    }
//
//    public String greet(String arg1) {
//        return "Hi, " +arg1 +" I'm " +this.name +". Nice to meet you! :)";
//    }
//////////////////////////////////////////////////////////////////FOR MY PET START/////////////////////////////////////////////////////////
//    public Person(String arg1, int arg2) {
//        this.name = arg1;
//        this.age = arg2;
//    }
//    public String toString() {
//        return "Person:"
//                +"\n\tname: "+this.name
//                +"\n\tage: "+this.age
//                +"\n\tpet:\n "+this.myPet.toString();
//    }
//////////////////////////////////////////////////////////////////FOR MY PET END/////////////////////////////////////////////////////////

//}


////////////////////////////////////////////////////////////FOR SETTERS AND GETTERS START//////////////////////////////////////////////
public class Person {
    private String name;
    private int age;
    private Pet myPet;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setMyPet(Pet myPet) {
        this.myPet = myPet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }

    public Pet getMyPet() {
        return myPet;
    }

    public String sayHello() {
        return "Hello! My pet is "+this.myPet.getName();
    }

    public String toString() {
        return "Person:"
            +"\n\tname: "+this.name
            +"\n\tage: "+this.age
            +"\n\tpet:\n "+this.myPet.toString();
    }









}