public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle () {};
    public Rectangle (double length, double width) {

        this.length = length;
        this.width = width;

    };

    public double getLength () {

        return this.length;
    }

    public double getWidth () {

        return this.width;
    }

    public void setLength (double length) {
        this.length = length;
    }

    public void setWidth (double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return (2*(this.length + this.width));
    }

    public double getArea() {
        return (this.length * this.width);
    }

    public String toString() {
        return "Rectangle: "
                +"\n\t length: " +(String.format("%.2f",getLength())) +"m"
                +"\n\t width: " +(String.format("%.2f",getWidth())) +"m"
                +"\n\t perimeter: " +(String.format("%.2f",getPerimeter())) +"m"
                +"\n\t area: " +(String.format("%.2f",getArea())) +"m²";
    }

}
