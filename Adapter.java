
public class Adapter extends Square {

    Circle circle;

    public Adapter(Circle circle) {
        this.circle = circle;
    }

    public double getSquareArea() {
        return circle.getCircleArea();
    }

    public String toString() {
        return "side=" + circle.getRadius() * 2 + ", area= " + getSquareArea();
    }

}
