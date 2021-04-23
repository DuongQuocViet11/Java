package Task08.Java119;

public class TestShape1 {
    public static void main(String[] args) {
        Shape1 s1 = new Rectangle1(1, 2);
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());

        Shape1 s2 = new Triangle1(3, 4);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());
    }
}
