/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Jason
 */
import java.util.*;

public class Game {
    
    public static boolean nextStep(String choice) {
        return (choice.equals("left"));
    }
    
    public Game() {
        System.out.println("You walk down a foreboding hallway. Pick left or right: ");
        Scanner scanner = new Scanner(System.in);
        String firstChoice = scanner.nextLine();
        String regex = "left|right";
        while (!firstChoice.matches(regex)) {
            System.out.println("Invalid selection, please try again: ");
            firstChoice = scanner.nextLine();
        }
        System.out.println("You picked " + firstChoice + ".");
        String trueFalse = String.valueOf(nextStep(firstChoice));
        System.out.println("It would be " + trueFalse + " to say that you picked left.");
    }
    
    public static void main(String[] args) {
        Game game = new Game();
    }   

}
