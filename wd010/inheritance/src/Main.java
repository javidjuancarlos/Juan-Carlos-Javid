public class Main {
    public static void main(String[] args) {

        Point point1 = new Point (1, 2);
        System.out.println("point:"+point1.toString());

        Point3d point3d1 = new Point3d (5, 5, 5);
        System.out.println(point3d1.toString());

        Point3d point3d2 = new Point3d (point1, 5);
        System.out.println(point3d2.toString());

        System.out.println(point1.introduce());
        System.out.println(point3d2.introduce());

        Point point2 = (Point)point3d2;
        System.out.println(point2.introduce());












    }
}
