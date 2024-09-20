package oopd7.vehicle;

public class Vehicle {
    private String brand;
    private String model;
    private double price;
    private String color;
    public Vehicle(String brand, String model, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Brand: " + brand + "\nModel: " + model + "\nPrice: " + price + "\nColor: " + color;
    }
}
