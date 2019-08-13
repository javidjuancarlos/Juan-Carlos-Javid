public class Main {
    public static void main(String[] args) {

//        System.out.println("****************************************************************************************");
//        Person p1 = new Person();
//        p1.name = "For string/name & integer/age na blank";
//        p1.age = 3;
//        p1.age = ++p1.age;
//        System.out.println(p1.toString());
//        System.out.println(p1.name);
//        System.out.println(p1.age);
//        System.out.println(p1.sayHello());
//        System.out.println(p1.greet("Paps"));
//
//        System.out.println("****************************************************************************************");
//        //"For string/name & integer/age na sa loob ng parenthesis"
//        Person p2 = new Person(
//                "For string/name & integer/age na sa loob ng parenthesis",
//                3
//        );
//        System.out.println(p2.toString());
//        System.out.println(p2.name);
//        System.out.println(p2.age);
//
//        System.out.println("****************************************************************************************");
//        //"For string/name loob ng parenthesis",
//        Person p3 = new Person(
//                "For string/name loob ng parenthesis"
//        );
//        System.out.println(p3.toString());
//        System.out.println(p3.name);
//        System.out.println(p3.age);
//
//        System.out.println("****************************************************************************************");
//        //"For integer/age na sa loob ng parenthesis"
//        Person p4 = new Person(
//                3
//        );
//        System.out.println(p4.toString());
//        System.out.println(p4.name);
//        System.out.println(p4.age);

//        System.out.println("****************************************************************************************");
//        Person p1 = new Person("Tao", 29);
//        Pet pet1 = new Pet("Malou", "Dog" , "Askal");
//        p1.myPet = pet1;
//        System.out.println("****************************************************************************************");
//        System.out.println(p1.toString());
//        System.out.println("****************************************************************************************");
//        System.out.println(pet1.toString());
//        System.out.println("****************************************************************************************");
////        System.out.println(p1);

///////////////////////////////////////////////////////private start////////////////////////////////////////////////////////
//        Person p1 = new Person ("Zuitt", 3);
//        Pet pet1 = new Pet("Malou", "Dog", "Askal");
//        p1.setMyPet (pet1);
//        p1.setAge( p1.getAge() + 5);
//        System.out.println(p1);
//        System.out.println(p1.getName());
//        System.out.println(p1.getAge());
//        p1.setAge(99);
//        System.out.println(p1.getAge());
//        p1.setAge( (p1.getAge() + 1));
//        System.out.println(p1.getAge());
//        p1.setAge( (p1.getAge()));
//        System.out.println(p1.getAge());

        Teacher xp = new Teacher ("Experience", 19, 19, "Makati");
        System.out.println(xp.toString());
        System.out.println(xp.doYourJob());

        Doctor time = new Doctor ("Time", 20, 22, "Ortigas");
        System.out.println(time.toString());
        System.out.println(time.doYourJob());

        Doctor strange = new Doctor ("Strange", 30, 100, "Muntinlupa");
        System.out.println(time.toString());
        System.out.println(time.doYourJob());


        Professional p1 = (Professional)xp;
        Teacher p2 = (Teacher)p1;
        p2.doYourJob();
        System.out.println(p2.doYourJob());

        Professional[] professionals = {
          Professional p1 = (Professional)xp,
        };








    }
}
