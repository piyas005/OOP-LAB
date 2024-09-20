package oopd7.vehicle;

public class Motorcycle extends Vehicle {
    private String type;
    private int cc;
    public Motorcycle(String brand, String model, double price, String color, String type, int cc) {
        super(brand, model, price, color);
        this.type = type;
        this.cc = cc;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
    @Override
    public String toString() {
        return super.toString() + "\nType: " + type + "\nCC: " + cc;
    }
    
}
