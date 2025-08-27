package Enviroment.Rooms;
import Core.World;
import Enviroment.Items.Meat;
import Enviroment.Room;
import UI.CLI;

public class DiningRoom extends Room {
    private int id = 9;
    private final String name = "Dining room";
    private final String description = "Just a ordinary dining room with tables and chairs.\nThe only thing out of the ordinary is a piece of meat lying on one of the tables.";
    private final int optionNum = 4;

    public void printOptions(){
        CLI.print("[1] Go to the royal bedroom");
        CLI.print("[2] Go to the kitchen");
        CLI.print("[3] Take the piece of meat");
    }
    public void act(int option){
        if(option == 1){
            World.movePlayer(8);
            return;
        }
        if(option == 2){
            World.movePlayer(7);
        }
        if(option == 3){
            World.addItem(new Meat());
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
