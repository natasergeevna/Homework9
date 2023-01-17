public class Сar {
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

    public Сar(String brand, String model, int year, String country, String color, double engineVolume) {
        if (brand == null || brand.isBlank()) brand = "default";
        if (model == null ||model.isBlank()) model = "default";
        if (country == null ||country.isBlank()) country = "default";
        if (color == null ||color.isBlank()) color = "белый";
        if (engineVolume <= 0) engineVolume = 1.5;
        if (year <= 0) year = 2000;
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;

    }

    public String toString(){
        return this.brand + " " + this.model + ", " + this.year + " год выпуска, сборка в " + this.country + ", " + this.color + " цвет кузова, объем двигателя - " + this.engineVolume + " л.";
    }
}

