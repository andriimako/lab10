public class Parallelogram implements Figure{

    double baseSide;
    double side;
    double height;

    public Parallelogram(double baseSide, double side, double height){
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }

    @Override
    public String getType() {
        String Type = "Circle";
        return Type;
    }

    @Override
    public double getArea() {
        double pArea = baseSide * height;
        return pArea;
    }

    @Override
    public double getPerimeter() {
        double perimeter = baseSide * 2 + side * 2;
        return perimeter;
    }




}
