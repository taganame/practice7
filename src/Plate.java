public class Plate extends Dish{
    private int radius;
    Plate(){}
    Plate(int radius){
        this.radius=radius;
    }
    Plate(int radius,int weight){
        super(weight);
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                ", " + super.toString();
    }
}
