
public class Main {

    public static void main(String[] args) {
        TripleTacoBox threeBox = new TripleTacoBox();
        CustomTacoBox box = new CustomTacoBox(5);
        
        threeBox.eat();
        System.out.println(threeBox.tacosRemaining());
        threeBox.eat();
        threeBox.eat();
        threeBox.eat();
        System.out.println(threeBox.tacosRemaining());
        
        System.out.println();
        
        box.eat();
        System.out.println(box.tacosRemaining());
        box.eat();
        box.eat();
        box.eat();
        System.out.println(box.tacosRemaining());
    }
}
