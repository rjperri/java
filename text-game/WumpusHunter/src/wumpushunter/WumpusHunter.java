
package wumpushunter;

import java.util.Scanner;


/**
 *
 * @author rjperri
 */
public class WumpusHunter {

    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Verb[] language = { new Take(), new Take("grab"), new Take("get"), 
                            new Move(), new Move("go"), new Move("walk"),
                            new Exit(), new Exit("quit"), new Exit("leave") };
        
        String input;
        boolean gameRunning = true;
        
        do {
            System.out.print("Type something: ");
            input = scanner.nextLine();
            
            Verb playerAction = null;
            for (Verb verb: language) {
                if (verb.getName().equals(input)) {
                    playerAction = verb;
                    break;
                } 
            }
            
            if (playerAction == null) {
                System.out.println("I do not know how to \'" + input + "\'");
            } else {
                playerAction.performAction();
                if (playerAction instanceof Exit) {
                    gameRunning = false;
                }
            }
            
        } while (gameRunning);
        
    }
    
}
