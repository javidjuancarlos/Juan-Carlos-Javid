public abstract class Professional {
    private String name;
    private int age;
    private int yoxp;
    private String powork;

    public Professional () {};

    public Professional (String name, int age, int yoxp, String powork) {
        this.name = name;
        this.age = age;
        this.yoxp = yoxp;
        this.powork = powork;
    }

    public String toString() {
        return  "\n\tname: " +this.name
                +"\n\tage: " +this.age
                +"\n\tyoxp: " +this.yoxp
                +"\n\tpowork: " +this.powork;
    }

    public abstract String doYourJob();








}
