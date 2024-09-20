package oopd7.shape;

public abstract class Shape {
    private String name;
    private String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
   
    @Override
    public String toString() {
        return "Name: " + name + "\nColor: " + color;
    }
}
