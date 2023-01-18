package Transport;

public class Сar {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String numberCar;
    private final int numberSits;
    private String tires;

    public String getBrand(){return this.brand;}
    public String getModel(){return this.model;}
    public int getYear(){return this.year;}
    public String getCountry(){return this.country;}
    public String getBodyType(){return this.bodyType;}
    public int getNumberSits(){return this.numberSits;}
    public double getEngineVolume(){return this.engineVolume;}
    public void setEngineVolume(double engineVolume){this.engineVolume = engineVolume;}
    public String getColor(){return this.color;}
    public void setColor(String color){this.color = color;}
    public String getTransmission(){return this.transmission;}
    public void setTransmission(String transmission){this.transmission = transmission;}
    public String getNumberCar(){return this.numberCar;}
    public void setNumberCar(String numberCar){this.numberCar = numberCar;}
    public String getTires(){return this.tires;}
    public void setTires(String tires){this.tires = tires;}
    public Сar(String brand, String model, Integer year, String country, String color, Object engineVolume, String transmission, String bodyType, String numberCar, Object numberSits, String tires) {
        if (brand == null || brand.isBlank()) brand = "default";
        if (model == null ||model.isBlank()) model = "default";
        if (country == null ||country.isBlank()) country = "default";
        if (color == null ||color.isBlank()) color = "белый";
        if (engineVolume <= 0) engineVolume = 1.5;
        if (year <= 0) year = 2000;
        if (transmission == null || transmission.isBlank()) {
            transmission = "default";
        }
        if (bodyType == null || bodyType.isEmpty()) bodyType = "default";
        if (numberCar == null || numberCar.isEmpty()) {
            numberCar = "default";
        }
        if (numberSits <= 0) {
            numberSits = 1;
        }
        if (tires == null || tires.isEmpty()) {
            tires = "default";
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.numberCar = numberCar;
        this.numberSits = numberSits;
        this.tires = tires;

    }

    public String toString(){
        return this.brand + " " + this.model + ", " + this.year + " год выпуска, сборка в " + this.country + ", " + this.color + " цвет кузова, объем двигателя - " + this.engineVolume + " л., коробка передач " + transmission + ", кузов машина - " + ", номер машины " + numberCar + ", количество мест " + numberSits + ", резина " + tires;
    }
}

