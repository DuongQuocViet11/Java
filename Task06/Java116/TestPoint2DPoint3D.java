package Task06.Java116;

public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        Point2D p2a = new Point2D(1,2);
        System.out.println(p2a);
        Point2D p2b = new Point2D();
        System.out.println(p2b);

        //Test Setters and Getters
        p2a.setX(3);
        p2a.setY(4);
        System.out.println(p2a); // toString()
        System.out.println("x is: " + p2a.getX());
        System.out.println("y is: " + p2a.getY());

        //Test Point3D
        Point3D p3a = new Point3D(11, 12, 13);
        System.out.println(p3a);
        Point2D p3b = new Point3D();
        System.out.println(p3b);
        // Test Setters and Getters
        p3a.setX(21);
        p3a.setY(22);
        p3a.setZ(23);
        System.out.println(p3a);
        System.out.println("x is: " + p3a.getX());
        System.out.println("y is: " + p3a.getY());
        System.out.println("z is: " + p3a.getZ());
    }
}
