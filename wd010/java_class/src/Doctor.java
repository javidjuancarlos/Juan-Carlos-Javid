public class Doctor extends Professional {
//    private String name;
//    private int age;
//    private int yoxp;
//    private String powork;

    public Doctor () {};

    public Doctor (String name, int age, int yoxp, String powork) {
        super(name, age, yoxp, powork);    }

    public String toString() {
        return "Doctor: "
                +super.toString();
    }

    public String doYourJob() {
        return "healing...";
    }





}
