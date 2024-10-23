public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza1 = new MargheritaPizza();
        pizza1 = new CheeseTopping(pizza1);
        pizza1 = new MushroomTopping(pizza1);

        System.out.println("Order 1: " + pizza1.getDescription());
        System.out.println("Cost: $" + pizza1.getCost());

        Pizza pizza2 = new VegetarianPizza();
        pizza2 = new CheeseTopping(pizza2);
        pizza2 = new MushroomTopping(pizza2);
        pizza2 = new PepperoniTopping(pizza2);

        System.out.println("\nOrder 2: " + pizza2.getDescription());
        System.out.println("Cost: $" + pizza2.getCost());
    }
}
