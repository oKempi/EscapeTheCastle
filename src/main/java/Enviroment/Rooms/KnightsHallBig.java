package Enviroment.Rooms;
import Core.World;
import Enviroment.Room;
import UI.CLI;

import java.util.Random;

public class KnightsHallBig extends Room { //here, you can move the sword
    private int id = 4;
    private final String name = "Big knight's hall";
    private final String description = "The hall is really spacious with many, fully equipped, armour stands and big, fancy chandeliers.";
    private final String pullText = "As you were looking around the hall, you accidentally stumbled over one of the knight's sword.\nYou hear distant sound of something moving.";
    private Boolean swordPulled = false;
    private final int optionNum = 4;

    public void printOptions(){
        CLI.print("[1] Go to the main hall");
        CLI.print("[2] Go to the kitchen");
        CLI.print("[3] Examine the room");
    }
    public void act(int option){
        if(option == 1){
            World.movePlayer(0);
        }
        if(option == 2){
            World.movePlayer(7);//not made yet!
        }
        if(option == 3){
            int chance = new Random().nextInt(6);
            if(chance == 3){
                World.openFireplace();
                CLI.print(pullText);
            }else{CLI.print("You haven't found anything interesting.");}
        }
    }
    public void print(){
        CLI.print("You are at the " + name);
        CLI.print(description);
    }
    public int getOptionNum(){
        return optionNum;
    }
}
