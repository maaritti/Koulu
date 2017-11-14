/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author maaritemilia
 */
public class Card {
    public final static int SPADES = 0;   // Codes for the 4 suits, plus Joker.
    public final static int HEARTS = 1;
    public final static int DIAMONDS = 2;
    public final static int CLUBS = 3;

    public final static int ACE = 1;      // Codes for the non-numeric cards.
    public final static int JACK = 10;    //   Cards 2 through 10 have their 
    public final static int QUEEN = 10;   //   numerical values for their codes.
    public final static int KING = 10;

      private final int suit;
    
      private final int value;

    public Card(int theSuit, int theValue) {
           if (theSuit != SPADES && theSuit != HEARTS && theSuit != DIAMONDS
                && theSuit != CLUBS) {
            throw new IllegalArgumentException("Illegal playing card suit");
        }
        if ((theValue < 1 || theValue > 13)) {
            throw new IllegalArgumentException("Illegal playing card value");
        }
        value = theValue;
        suit = theSuit;
    }

    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
         public String getSuitAsString() {
        switch (suit) {
            case SPADES:
                return "Spades";
            case HEARTS:
                return "Hearts";
            case DIAMONDS:
                return "Diamonds";
            case CLUBS:
                return "Clubs";
            default:
                return "Joker";
        }
    
        
    }  
         
          public String getValueAsString() {
        switch (value) {
                case 1:
                    return "Ace";
                case 2:
                    return "2";
                case 3:
                    return "3";
                case 4:
                    return "4";
                case 5:
                    return "5";
                case 6:
                    return "6";
                case 7:
                    return "7";
                case 8:
                    return "8";
                case 9:
                    return "9";
                case 10:
                    return "10";
                case 11:
                    return "Jack";
                case 12:
                    return "Queen";
                default:
                    return "King";
            }
}
          
          public String toString() {
              return getValueAsString() + "of" + getSuitAsString();
          }
}