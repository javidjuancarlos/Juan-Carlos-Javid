public class Book {

    public int num;
    public String title;
    public Author objectAuthor;
    public String genre;
    public String subtitle;

    public Book (int num, String title, Author objectAuthor, String genre, String subtitle) {
        this.num = num;
        this.title = title;
        this.objectAuthor = objectAuthor;
        this.genre = genre;
        this.subtitle = subtitle;
    }

    public String toString() {
        return "\t\t\tBook: " +this.num
                +"\n\t\t\t\ttitle: "+this.title
                +"\n\t\t\t\tobjectAuthor: "  +this.objectAuthor
                +"\n\t\t\t\tgenre: "+this.genre
                +"\n\t\t\t\tsubtitle: "+this.subtitle;
    }







}
