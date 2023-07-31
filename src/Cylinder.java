public class Cylinder  extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }

    private void setHeight(double height) {
        this.height = Math.max(0, height);

    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
       return  super.getArea()  *  height ;
    }
}
