import Transport.Сar;

public class Main {
    //task
    public static void main(String[] args) {
        Сar Lada = new Сar(null, "Granta", 2015, "России", "жёлтый", -1.7, "", null, "", 2, "");
        Сar Audi = new Сar("Audi", "A8 50L TDI quattro", 2020, "Германии", "чёрный", 3.0, "", "", "", 2, "");
        Сar Bmw = new Сar("BMW", null, 2021, " ", null, 3.0, "", " ", "", 2, "");
        Сar Kia = new Сar("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красный", 2.4, "", "", "", 2, "");
        Сar Hyundai = new Сar("Hyundai", "", 0, "Южной Корее", "оранжевый", 1.6, "", "", "", 2, "");
        System.out.println(Lada);
        System.out.println(Audi);
        System.out.println(Bmw);
        System.out.println(Kia);
        System.out.println(Hyundai);
    }
}