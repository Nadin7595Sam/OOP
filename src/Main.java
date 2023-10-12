public class Main {
    public static void main(String[] args) {
        Drink cupOfTea = new Drink("Tea", 200);
        HotDrink hotCoffee = new HotDrink("Coffee", 250, 90);

        HotDrinkMachine machine = new HotDrinkMachine();

        Drink cupOfCoffee = machine.getProduct("Coffee", 250);
        HotDrink cupOfTeaWithTemperature = machine.getProduct("Tea", 200, 80);

        System.out.println("__________________________________________________________________________________");
        System.out.println(cupOfTea.toString());
        System.out.println(hotCoffee.toString());
        System.out.println(cupOfCoffee.toString());
        System.out.println(cupOfTeaWithTemperature.toString());
        System.out.println("__________________________________________________________________________________");
    }
}