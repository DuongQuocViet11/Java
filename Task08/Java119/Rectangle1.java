package Task08.Java119;

public class Rectangle1 implements Shape1{
    private int length, width;

    public Rectangle1(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString(){
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }

    @Override
    public double getArea(){
        return length * width;
    }
}
