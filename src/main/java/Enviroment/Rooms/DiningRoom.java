package Enviroment.Rooms;
import Core.World;
import Enviroment.Room;
import UI.CLI;

import java.util.Random;

public class DiningRoom extends Room {
    private int id = 9;
    private final String name = "Dining room";
    private final String description = "Just a ordinary dining room with tables and chairs.";
    private final int optionNum = 3;

    public void printOptions(){
        CLI.print("[1] Go to the royal bedroom");
        CLI.print("[2] Go to the kitchen");
    }
    public void act(int option){
        if(option == 1){
            World.movePlayer(8);
            return;
        }
        if(option == 2){
            World.movePlayer(7);
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
