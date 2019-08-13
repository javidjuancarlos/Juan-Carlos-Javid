public class Triangle extends Shape {

    private double triangleSides;

    public Triangle() {
    }

    public Triangle(double triangleSides) {

        this.triangleSides = triangleSides;

    }

    public double getTriangleSides () {

        return this.triangleSides;
    }

    public void setTriangleSides (double triangleSides) {

        this.triangleSides = triangleSides;

    }

    public double getPerimeter() {
        return (3 * triangleSides);
    }

    public double getArea() {
        return ((Math.sqrt(3) / 4) * (Math.pow(triangleSides, 2)));
    }

    public String toString() {
        return "Triangle: "
                + "\n\t sides: " +(String.format("%.2f",getTriangleSides())) +"m"
                + "\n\t perimeter: " +(String.format("%.2f",getPerimeter())) +"m"
                + "\n\t area: " +(String.format("%.2f",getArea())) +"m²";
    }

}
