package giftshop.giftModel;

public class Gift {
    private int id;
    private String name;
    private double price;
    private int qty;

    public Gift(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Gift(){
        id = 0;
        name = "";
        price = 0;
        qty = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return String.format("%-30d%-30s%-30s%-30d%-30d%-30d%-30d%-30.2f%-30s%-30s\n", id, name, price, qty);
    }
}
