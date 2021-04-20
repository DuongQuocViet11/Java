package Task07;

public class TestTriangle {
    public static void main(String[] args) {

        Point p1 = new Point(2,3);
        Point p2 = new Point(3,4);
        Point p3 = new Point(5,4);
        Triangle t1 = new Triangle(p1,p2,p3);
        if(((t1.getAb()+t1.getBc())>t1.getAc())&&((t1.getAb()+t1.getAc())>t1.getBc())&&((t1.getAc()+t1.getBc())>t1.getAb())){
            System.out.println("A"+p1);
            System.out.println("B"+p2);
            System.out.println("c"+p3);
            System.out.println("Perimeter: "+t1.getPerimeter());
        }else {
            System.out.println("Is not Triangle!");
            System.out.println("Please try again!");
        }
    }
}
