package Enviroment.Rooms;
import Core.World;
import Enviroment.Item;
import Enviroment.Items.Key;
import Enviroment.Items.Steak;
import Enviroment.Room;
import UI.CLI;

import javax.swing.text.StyledEditorKit;

public class RoyalBedroom extends Room {
    private int id = 8;
    private String name = "Royal bedroom";
    private String description = "There is a giant bed on the far side of the room with doors leading somewhere next to it. There is also a dog, it seems there might be something under it!";
    private final int optionNum = 5;

    public void printOptions(){
        CLI.print("[1] Go through the doors");
        CLI.print("[2] Go to the small knight's hall");
        CLI.print("[3] Try giving the dog something to eat");
        CLI.print("[4] Go to dining hall");
    }

    public void act(int option){
        if(option == 1){
            World.movePlayer(10);
        }
        else if(option == 2){
            World.movePlayer(3);
        }
        else if(option == 3){
            boolean x = false;
            for (Item i : World.items){
                if (i instanceof Steak){
                    World.removeItem(i);
                    World.addItem(new Key());
                }
                else{x = true;}
                if(x){
                    CLI.print("The dog wasn't interested in anything you had");
                }
            }
        }
        else if(option == 4){
            World.movePlayer(9);
        }
    }

    public void print(){
        CLI.print("You are in the " + name);
        CLI.print(description);
    }

    public int getOptionNum(){
        return optionNum;
    }
}