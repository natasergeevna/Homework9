public class Main {
    //task
    public static void main(String[] args) {
        Сar Lada = new Сar("", "Granta", 2015, "России", "жёлтый", -1.7);
        Сar Audi = new Сar("Audi", "A8 50L TDI quattro", 2020, "Германии", "чёрный", 3.0);
        Сar Bmw = new Сar("BMW", " ", 2021, " ", "", 3.0);
        Сar Kia = new Сar("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красный", 2.4);
        Сar Hyundai = new Сar("Hyundai", "", 0, "Южной Корее", "оранжевый", 1.6);
        System.out.println(Lada);
        System.out.println(Audi);
        System.out.println(Bmw);
        System.out.println(Kia);
        System.out.println(Hyundai);
    }
}