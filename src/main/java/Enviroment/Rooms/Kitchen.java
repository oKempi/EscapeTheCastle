package Enviroment.Rooms;
import Core.World;
import Enviroment.Item;
import Enviroment.Items.*;
import Enviroment.Room;
import UI.CLI;

public class Kitchen extends Room {
    private int id = 7;
    private String name = "Kitchen";
    private String description = "The room is one of the biggest you've seen in this castle. There is a stove, some ancient machine and other things you'd find in a kitchen.";
    private int optionNum = 5; //a LOT
    private int success = 0;

    public void printOptions(){
        CLI.print("[1] Go to the dining room");
        CLI.print("[2] Go the big knight's hall");
        CLI.print("[3] Go to the pantry");
        CLI.print("[4] Interact with the machine");
        for (Item i : World.items){
            if (i instanceof Meat || i instanceof Salt){
                success++;
            }
        }
        if (success == 2){
            optionNum = 6;
            CLI.print("[5] Try to cook something");
        }
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
                    CLI.print("The machine gave you seeds for a coin!");
                    return;
                }
            }
            CLI.print("You don't have anything that would fit in the machine.");
        }
        else if (option == 5 && success == 2){
            for (Item i : World.items){
                if (i instanceof Meat || i instanceof Salt){
                    World.removeItem(i);
                }
            }
            World.addItem(new Steak());
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
