

public class Main {

    public static void main(String[] args) {
        Item clothes = new Item("clothes", 1);
        Item makeup = new Item("makeup", 2);
        Item pillow = new Item("pillow", 3);
        Item shoes = new Item("shoes", 2);
        
        Suitcase suitcase1 = new Suitcase(7);
        Suitcase suitcase2 = new Suitcase(10);
        
        Hold hold = new Hold(20);
        
        suitcase1.addItem(shoes);
        suitcase1.addItem(clothes);
        suitcase1.addItem(clothes);
        suitcase1.addItem(clothes);
        suitcase1.addItem(pillow);
        
        suitcase2.addItem(makeup);
        suitcase2.addItem(makeup);
        suitcase2.addItem(pillow);
        suitcase2.addItem(makeup);
        suitcase2.addItem(makeup);
        
        hold.addSuitcase(suitcase1);
        hold.addSuitcase(suitcase2);
        
        suitcase1.printItems();
        System.out.println("-----------------------------");
        suitcase2.printItems();
        System.out.println("-----------------------------");
        hold.printItems();
        
    }

}
