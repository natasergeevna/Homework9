public class Main {
    //task
    public static void main(String[] args) {
        car Lada = new car(null, "Granta", 2015, "России", "жёлтый", -1.7);
        car Audi = new car("Audi", "A8 50L TDI quattro", 2020, "Германии", "чёрный", 3.0);
        car Bmw = new car("BMW", " ", 2021, null, "", 3.0);
        car Kia = new car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красный", 2.4);
        car Hyundai = new car("Hyundai", "", 0, "Южной Корее", "оранжевый", 1.6);
        System.out.println(Lada);
        System.out.println(Audi);
        System.out.println(Bmw);
        System.out.println(Kia);
        System.out.println(Hyundai);
    }
}