class Car {
    private int id;
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;
    private String registrationNumber;

    public Car(int id, String make, String model, int year, String color, double price, String registrationNumber) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return id + "," + make + "," + model + "," + year + "," + color + "," + price + "," + registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int getAge() {
        return 2024 - year;
    }
}
