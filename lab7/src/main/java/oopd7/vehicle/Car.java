package oopd7.vehicle;

public class Car extends Vehicle {
    private int doors;
    private int seats;
    public Car(String brand, String model, double price, String color, int doors, int seats) {
        super(brand, model, price, color);
        this.doors = doors;
        this.seats = seats;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    @Override
    public String toString() {
        return super.toString() + "\nDoors: " + doors + "\nSeats: " + seats;
    }
}
