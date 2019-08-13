public class Point3d extends Point{


    private int z;

    public Point3d () {};

    public Point3d (int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Point3d (Point point,  int z) {
        super(point.getX(), point.getY());
        this.z = z;
    }

    public int getZ() {
        return z;
    }



    public String toString () {
        return "Point3d: "
                +"\t" +super.toString()
                +"\n\tz = " + this.z;
    }

    public String introduce () {
        return "3dpoint";
    }




}
