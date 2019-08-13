public class Teacher extends Professional {
//    private String name;
//    private int age;
//    private int yoxp;
//    private String powork;

    public Teacher () {};

    public Teacher (String name, int age, int yoxp, String powork) {
//        this.name = name;
//        this.age = age;
//        this.yoxp = yoxp;
//        this.powork = powork;
        super(name, age, yoxp, powork);
    }

    public String toString() {
        return "Teacher: "
                +super.toString();
    }

    public String doYourJob () {
        return "teaching...";
    }





}
