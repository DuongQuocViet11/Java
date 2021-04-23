package Task08.Java119;

public class Triangle1 implements Shape1{
    private int base, height;

    public Triangle1(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString(){
        return "Triangle[base=" + base + ",height=" + height + "]";
    }

    @Override
    public double getArea(){
        return 0.5 * base * height;
    }
}
