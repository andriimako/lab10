public class Circle implements Figure {

    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public String getType() {
        String Type = "Circle";
        return Type;
    }

    @Override
    public double getArea() {
        double area = 3.14 * ((radius) * (radius));
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * 3.14 * (radius);
        return perimeter;
    }

}