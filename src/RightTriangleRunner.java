public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle tri1 = new RightTriangle(5, 12);
        double hyp1 = tri1.hypotenuse();
        RightTriangle tri2 = new RightTriangle(2.5, 5.5);
        double hyp2 = tri2.hypotenuse();

        System.out.println(hyp1);
        System.out.println(hyp2);
    }
}
