package Practice;

public class Flight {
    private int number;
    private String destination;

    public Flight(){}

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDestination() {
        return this.destination;
    }

    public void display(){
        System.out.println("Thong tin chyen bay:");
        System.out.println("So hieu chuyen bay: " + number);
        System.out.println("Diem den: " + destination);
    }
}
