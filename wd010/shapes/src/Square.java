public class Square extends Rectangle {

    /*since type lang siya ng rectangle, mag bato lang siya ng dalawang sides kay super na same value lang yung sides
    dito sa unang parenthesis is yung value na kunin niya kay shape which nag extend yung rectangle tapos square extends
    to rectangle*/
    public Square (double squareSides) {

        super(squareSides, squareSides);
    }

    public double getSide() {

        return super.getLength();

    }

    public void setSquareSide (double squareSides) {

        super.setLength(squareSides);
        super.setWidth(squareSides);

    }

    public String toString() {
        return "Square: "
                +"\n\t Sides: " +(String.format("%.2f",this.getSide())) +"m"
                +"\n\t perimeter: " +(String.format("%.2f",super.getPerimeter())) +"m"
                +"\n\t area: " +(String.format("%.2f",super.getArea())) +"m²";
    }









}
