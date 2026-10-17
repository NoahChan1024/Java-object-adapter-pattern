
public class Main {
    public static void main(String[] args) {
        Square a = new Adapter(new Circle(10));
        ShowSquareInfo.printSquare(a);
    }
}
