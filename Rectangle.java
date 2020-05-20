public class Rectangle implements Figure {

    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String getType() {
        String Type = "Rectangle";
        return Type;
    }

    @Override
    public double getArea() {
        double area = sideA * sideB;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideA * 2 + sideB * 2;
        return perimeter;
    }




}
