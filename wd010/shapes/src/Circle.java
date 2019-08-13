public class Circle extends Shape {

    private double radius;

    public Circle () {};
    public Circle (double radius) {

        this.radius = radius;

    };

    public double getRadius () {

        return this.radius;
    }

    public void setRadius (double radius) {

        this.radius = radius;

    }

    public double getPerimeter() {
        return (2*Math.PI*radius);
    }

    public double getArea() {
        return (Math.PI*(Math.pow(radius, 2)));
    }

    public String toString() {
        return "Circle: "
                +"\n\t radius: " +(String.format("%.2f",getRadius())) +"m"
                +"\n\t perimeter: " +(String.format("%.2f",getPerimeter())) +"m"
                +"\n\t area: " +(String.format("%.2f",getArea())) +"m²";
    }




}
