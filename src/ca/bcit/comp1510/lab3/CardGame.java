/**
 * 
 */
package ca.bcit.comp1510.lab3;
import java.util.Random;

/**
 * This is a card game.
 * 
 * @author manan
 * @version 1.0
 *
 */
public class CardGame {
    /**
     * Enumeration type stating the different cards.
     * @author nirajanmanandhar
     * @version 1.0
     *
     */
    enum Rank {
        
        /**Card name Ace.**/
        ACE, 
        
        /**Card name Two.**/
        TWO, 
        
        /**Card name Three.**/
        THREE, 
        
        /**Card name Four.**/
        FOUR, 
        
        /**Card name Five.**/
        FIVE, 
        
        /**Card name Six.**/
        SIX, 
        
        /**Card name Seven.**/
        SEVEN,
        
        /**Card name Eight.**/
        EIGHT, 
        
        /**Card name Nine.**/
        NINE, 
        
        /**Card name Ten.**/
        TEN, 
        
        /**Card name Jack.**/
        JACK, 
        
        /**Card name Queen.**/
        QUEEN, 
        
        /**Card name King.**/
        KING;
    }
    
    /**
     * Enumeration type that states the different suits.
     * @author nirajanmanandhar
     * @version 1.0
     *
     */
    enum Suit {
        
        /**Suit name hearts.**/
        HEARTS, 
        
        /**Suit name diamonds.**/
        DIAMONDS, 
        
        /**Suit name clubs.**/
        CLUBS, 
        
        /**Suit name spades.**/
        SPADES;
    }

    /**
     * Drives the program.
     * 
     * @param args
     *            unused
     */
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int randomRankChoice = random.nextInt(Rank.values().length);
        Rank randomRank = Rank.values()[randomRankChoice];

        System.out.println("The chosen Rank is: " + randomRank);
        
        int randomSuitChoice = random.nextInt(Suit.values().length);
        Suit randomSuit = Suit.values()[randomSuitChoice];

        System.out.println("The chosen Suit is: " + randomSuit);
        
        System.out.println("The randomly chosen card is: the " 
        + randomRank + " of " + randomSuit + "!");
    }
    
 
}
