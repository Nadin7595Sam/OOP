class HotDrinkMachine {
    public Drink getProduct(String name, int volume) {
        return new Drink(name, volume);
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        return new HotDrink(name, volume, temperature);
    }
}