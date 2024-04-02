package HW10;

public class Main {
    public static void main(String[] args) {
        Person vasea = new Person("Vasea", 5, 170);
        vasea.printPersonInfo();

        Person stas = new Person();

        stas.setName("Stas");
        stas.setAge(15);
        stas.setHeight(185);
        stas.printPersonInfo();
    }
}
