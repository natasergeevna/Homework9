public class car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    public int getYear() {
        return this.year;
    }

    public String getCountry() {
        return this.country;
    }

    public String getColor() {
        return this.color;
    }

    public car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;

    }

    public String toString(){
        String nullString = null;
        String emptyString = "";
        String blankString = " ";
        if (brand == nullString || brand == emptyString || brand == blankString) brand = "default";
        if (model == nullString || model == emptyString || model == blankString) model = "default";
        if (country == nullString || country == emptyString || country == blankString) country = "default";
        if (color == nullString || color == emptyString || color == blankString) color = "белый";
        if (engineVolume <= 0) engineVolume = 1.5;
        if (year <= 0) year = 2000;

        return this.brand + " " + this.model + ", " + this.year + " год выпуска, сборка в " + this.country + ", " + this.color + " цвет кузова, объем двигателя - " + this.engineVolume + " л.";
    }
}

