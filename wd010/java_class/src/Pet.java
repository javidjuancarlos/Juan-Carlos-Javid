//public class Pet {
//
//    public String name;
//    public String type;
//    public String breed;
//
//    //empty constructor para mag let na lang dun sa kabila kahit empty
//    public Pet () {}
//
//    //3 string constructors
//    public Pet (String arg1, String arg2, String arg3) {
//        this.name = arg1;
//        this.type = arg2;
//        this.breed = arg3;
//    }
//
//
//
//    public String toString() {
//        return "Pet:"
//                +"\n\tname: "+this.name
//                +"\n\ttype: "+this.type
//                +"\n\tbreed: "+this.breed;
//    }
//
//
//
//
//
//
//
//
//}
public class Pet {

    private String name;
    private String type;
    private String breed;

    //empty constructor para mag let na lang dun sa kabila kahit empty
    public Pet() {
    }

    //3 string constructors
    public Pet(String name, String type, String breed) {
        this.name = name;
        this.type = type;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }


    public String toString() {
        return "Pet:"
                + "\n\tname: " + this.name
                + "\n\ttype: " + this.type
                + "\n\tbreed: " + this.breed;
    }
}