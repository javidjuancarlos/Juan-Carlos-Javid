public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0);
        Rectangle r1 = new Rectangle(2.0, 3.0);
        r1.setLength(1000);
        Square s1 = new Square(2.0);
        s1.setSquareSide(3.0);
        Triangle t1 = new Triangle(2.0);
        t1.setTriangleSides(100);

        Shape[] shapes = {
                (Shape)c1,
                (Shape)r1,
                (Shape)s1,
                (Shape)t1
        };

        for(Shape s: shapes) {
            System.out.println("\n" +s.toString());
        }
    }
}

