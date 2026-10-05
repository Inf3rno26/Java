// package getterandsetters;

public class Car {
    private String model; // wont be changed
    private String color;
    private int price;

    Car() {
    }

    String getModel() {
        return this.model;
    }

    String getcolor() {
        return this.color;
    }

    String getPrice() {
        return "$" + this.price;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        this.price = price;
    }
}