public class CircleRunner {
    public static void main(String[] args) {
        Circle circ1 = new Circle(5.0);
        System.out.println(circ1.getInfo());
        circ1.setRadius(9.2);
        System.out.println(circ1.getInfo());
    }
}
