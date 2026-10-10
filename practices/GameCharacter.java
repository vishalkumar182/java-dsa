

import java.util.Scanner;



public class GameCharacter {

    public static void main(String[] args) {
          // object creation 
    Game game = new Game();
    System.out.println("Player:" + game.name);
    System.out.println("Health:" + game.health);
    game.checkStatus();
    }
    
}

class Game {
    // variables(properties)
    String name = "vishal";
    int health = 100;

    // methods with if else logic (action)
    void checkStatus() {
        if (health > 0) {
            System.out.println(name + " is Alive and ready to fight ");

        } else {
            System.out.println(name + "has eliminated .. game");
        }
    }
}