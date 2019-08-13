public class Main {
    public static void main(String[] args) {

        System.out.println("****************************************************************************************");
        Author a1 = new Author("J.R.R. Tolkien", "January 3, 1892", "Bloemfontein, South Africa", "Master");
        Book b1 = new Book(1,"The Silmarillion", a1, "Fantasy - Fiction", "Prequel to the LOTR");
//        System.out.println(a1.toString());
        System.out.println(b1.toString());






    }
}
