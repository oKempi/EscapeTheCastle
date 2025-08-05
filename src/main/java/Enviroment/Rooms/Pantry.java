package Enviroment.Rooms;
import Core.World;
import Enviroment.Item;
import Enviroment.Items.Meat;
import Enviroment.Items.Salt;
import Enviroment.Items.Seeds;
import Enviroment.Items.Steak;
import Enviroment.Room;
import UI.CLI;

public class Pantry extends Room {
    private int id = 7;
    private String name = "Kitchen";
    private String description = "The room is one of the biggest you've seen in this castle. There is a stove, some ancient machine and other things you'd find in a kitchen.";
    private final int optionNum = 5;

    public void printOptions(){
        CLI.print("[1] Go to the dining room");
        CLI.print("[2] Go the big knight's hall");
        CLI.print("[3] Go to the pantry");
        CLI.print("[4] Interact with the machine");
    }
    public void act(int option){
        if (option == 1){
            World.movePlayer(9);
        }
        else if (option == 2){
            World.movePlayer(4);
        }
        else if (option == 3){
            World.movePlayer(11);
        }
        else if (option == 4){
            for (Item i : World.items){
                if (i instanceof Coin){
                    World.removeItem(i);
                    World.addItem(new Seeds());
                }
            }
        }
    }
    public void print(){
        CLI.print("You are in " + name);
        CLI.print(description);
    }
    public int getOptionNum(){
        return optionNum;
    }
}
