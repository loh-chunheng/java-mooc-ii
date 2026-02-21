import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        cards.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    @Override
    public int compareTo(Hand hand) {
        int thisSum = this.cards.stream().mapToInt(Card::getValue)
                .sum();
        int handSum = hand.cards.stream().mapToInt(Card::getValue)
                .sum();
        
        return thisSum - handSum;
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
