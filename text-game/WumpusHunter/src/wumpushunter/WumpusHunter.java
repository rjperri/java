package wumpushunter;

import wumpushunter.language.Verb;
import java.util.Scanner;
import wumpushunter.language.ExamineAction;
import wumpushunter.language.ExitAction;
import wumpushunter.language.LookAction;
import wumpushunter.language.MoveAction;
import wumpushunter.language.Noun;
import wumpushunter.language.TakeAction;


/**
 *
 * @author rjperri
 */
public class WumpusHunter {

    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Verb[] language = { new Verb("move", new MoveAction()), new Verb("go", new MoveAction()), new Verb("head", new MoveAction()), new Verb("walk", new MoveAction()),
                            new Verb("take", new TakeAction()), new Verb("grab", new TakeAction()), new Verb("gimme", new TakeAction()),
                            new Verb("exit", new ExitAction()), new Verb("quit", new ExitAction()),
                            new Verb("look", new LookAction()), new Verb("examine", new ExamineAction())};
        
        String input;
        boolean gameRunning = true;
        
        do {
            System.out.print("Type something: ");
            input = scanner.nextLine();
            
            String[] command = input.split("\\s+");
            Verb playerAction = null;
            for (Verb verb: language) {
                if (verb.getIdentity().equalsIgnoreCase(command[0])) {
                    playerAction = verb;
                    break;
                } 
            }
            
            if (playerAction == null) {
                System.out.println("I do not know how to \'" + input + "\'");
            } else {
                playerAction.performAction(new Noun(command.length > 1 ? command[1] : ""));
                if (playerAction.getAction() instanceof ExitAction) {
                    gameRunning = false;
                }
            }
            
        } while (gameRunning);
        
    }
    
}
