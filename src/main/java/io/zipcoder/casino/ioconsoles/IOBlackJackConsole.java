package io.zipcoder.casino.ioconsoles;

import io.zipcoder.casino.cardgames.Card;
import io.zipcoder.casino.utilities.Console;

import java.util.List;

public class IOBlackJackConsole extends IOConsole {
    Console blackJackConsole;
    String name;

    public IOBlackJackConsole(String name) {
        this.name = name;
        this.blackJackConsole = new Console(System.in, System.out);

    }

    public void blackJackWelcomeMessage(String name) {
        blackJackConsole.println("Welcome " + name + ", to the Black Jack room");
    }

    //This is if we implement a bet method that allows user to input amount
//    public void betMessage() {
//        blackJackConsole.println("How much are you betting?");
//    }
//
//    public void playerBetAmountMessage(String name, int betAmount) {
//        blackJackConsole.println(name + " is betting " + betAmount + " dollars.");
//    }

    public void dealtCardMessage() {
        blackJackConsole.println("The dealer has dealt the cards.");
    }

    public void playerHandMessage(List<Card> hand) {
        blackJackConsole.println("Player: ");
        for(int i = 0; i <hand.size(); i++) {
            String value = "";
            if(hand.get(i).getValue() == 1) {value = "A";}
            else if(hand.get(i).getValue() == 2) {value = "2";}
            else if(hand.get(i).getValue() == 3) {value = "3";}
            else if(hand.get(i).getValue() == 4) {value = "4";}
            else if(hand.get(i).getValue() == 5) {value = "5";}
            else if(hand.get(i).getValue() == 6) {value = "6";}
            else if(hand.get(i).getValue() == 7) {value = "7";}
            else if(hand.get(i).getValue() == 8) {value = "8";}
            else if(hand.get(i).getValue() == 9) {value = "9";}
            else if(hand.get(i).getValue() == 10) {value = "10";}
            else if(hand.get(i).getValue() == 11) {value = "J";}
            else if(hand.get(i).getValue() == 12) {value = "Q";}
            else if (hand.get(i).getValue() == 13) {value = "K";}
            blackJackConsole.print("["+value+"]");
        }
        blackJackConsole.print("\n");

    }

    public void dealerHandMessage(List<Card> hand) {
        blackJackConsole.println("Dealer: ");
        for(int i = 0; i <hand.size(); i++) {
            String value = "";
            if(hand.get(i).getValue() == 1) {value = "A";}
            else if(hand.get(i).getValue() == 2) {value = "2";}
            else if(hand.get(i).getValue() == 3) {value = "3";}
            else if(hand.get(i).getValue() == 4) {value = "4";}
            else if(hand.get(i).getValue() == 5) {value = "5";}
            else if(hand.get(i).getValue() == 6) {value = "6";}
            else if(hand.get(i).getValue() == 7) {value = "7";}
            else if(hand.get(i).getValue() == 8) {value = "8";}
            else if(hand.get(i).getValue() == 9) {value = "9";}
            else if(hand.get(i).getValue() == 10) {value = "10";}
            else if(hand.get(i).getValue() == 11) {value = "J";}
            else if(hand.get(i).getValue() == 12) {value = "Q";}
            else if (hand.get(i).getValue() == 13) {value = "K";}
            blackJackConsole.print("["+value+"]");
        }
        blackJackConsole.print("\n");

    }

    public void NeedMoreCards() {
        //A loop that will continue until the player decides to stop drawing.
        String input = blackJackConsole.getStringInput("Would you like to hit? Yes or No.").toLowerCase();
        if (input == "yes") {
            if (input == "yes") {
                blackJackConsole.println("You have drawn a [2]. Would you like to draw again?");
            } else if (input == "no") {
                blackJackConsole.println("Dealer's Turn.");
            } else {
                input = blackJackConsole.getStringInput("Please type in Yes or No");
            }
        }
    }

   /* public void dealerTurnMessage() {
        if (dealer.hand < 15) {
            blackJackConsole.println("The dealer have drawn a [5].");
        } else {
            blackJackConsole.println("Dealer stays");
        }
    }

    public void printResultMessage() {
        if (playerwin = true) {
            blackJackConsole.println("Player: [K][8][2]\nDealer:[Q][4][5]\nYou have won.");
        } else {
            blackJackConsole.println("Player: [K][8][2]\nDealer:[Q][4][7]\nYou Lose!");
        }
    }
*/
    public void tryAgainMessage() {
        blackJackConsole.println("Would you like to play again?");
    }

}
