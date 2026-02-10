

public class Main {

    public static void main(String[] args) {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
        
        System.out.println();
        
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
        
        MisplacingBox mBox = new MisplacingBox();
        mBox.add(new Item("Saludo", 5));
        mBox.add(new Item("Pirkka", 5));

        System.out.println(mBox.isInBox(new Item("Saludo")));
        System.out.println(mBox.isInBox(new Item("Pirkka")));
    }
}
