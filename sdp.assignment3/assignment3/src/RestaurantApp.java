public class RestaurantApp {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Morning specials");
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Afternoon specials");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Evening specials");

        MenuComponent pancake = new MenuItem("Pancake", "Fluffy pancake with syrup", 5.99);
        MenuComponent burger = new MenuItem("Burger", "Beef burger with fries", 9.99);
        MenuComponent steak = new MenuItem("Steak", "Grilled steak with sides", 15.99);

        breakfastMenu.add(pancake);
        lunchMenu.add(burger);
        dinnerMenu.add(steak);

        MenuComponent allMenus = new Menu("All Menus", "All available menus");

        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);

        allMenus.print();
    }
}
