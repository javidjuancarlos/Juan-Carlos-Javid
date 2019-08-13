public class Author {
    public String name;
    public String dob;
    public String pob;
    public String penName;

    public Author (String arg1, String arg2, String arg3) {
        this.name = arg1;
        this.dob = arg2;
        this.pob = arg3;
    }

    public Author (String arg1, String arg2, String arg3, String arg4) {
        this.name = arg1;
        this.dob = arg2;
        this.pob = arg3;
        this.penName = arg4;
    }

    public String toString() {
        return "\n\t\t\t\t\t\t\tname: "+this.name
                +"\n\t\t\t\t\t\t\tdob: "+this.dob
                +"\n\t\t\t\t\t\t\tpob: "+this.pob
                +"\n\t\t\t\t\t\t\tpenName: "+this.penName;
    }







}


