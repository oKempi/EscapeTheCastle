package Enviroment.Rooms;
import Core.World;
import Enviroment.Item;
import Enviroment.Items.Coin;
import Enviroment.Items.Gold;
import Enviroment.Items.MercuryBottle;
import Enviroment.Room;
import UI.CLI;
import java.util.ArrayList;
import java.util.List;

public class Laboratory extends Room {
    private int id = 6;
    private String name = "Secret laboratory";
    private String description = "The laboratory is quite small but equipped very well with an alchemy table in the middle of the room.";
    private final int optionNum = 4;

    public void printOptions(){
        CLI.print("[1] Go back to the secret corridor");
        CLI.print("[2] Look around the room");
        CLI.print("[3] Interact with the alchemy table");
    }
    public void act(int option){
        if(option == 1){
            World.movePlayer(5);
            return;
        }
        if(option == 2){
            World.addItem(new MercuryBottle());
            CLI.print("You found a heavy, relative to its size, bottle of some metallic, silver coloured liquid.");
            return;
        }
        if (option == 3){
            List<Item> putIn = new ArrayList<>();
            CLI.print("Alchemy table:");
            CLI.print("You have exactly 2 spots in which you can put any of your items.");
            if(!World.items.isEmpty()){
                CLI.print("[1] Stop interacting with the alchemy table");
                for(int i = 2; i < World.items.size(); i++){
                    CLI.print("[" + i + "]" + World.items.get(i - 2));
                }
                for(int i = 0; i < 3; i++){
                    int choice = CLI.getInput();//TODO check if option is viable (continue [use it]) else(call the method again)
                    if(choice < 0 || choice - 1 > World.items.size()){ //maybe use "do while" instead
                        return;
                    }
                    else if (putIn.contains(World.items.get(choice - 1))){
                        CLI.print("Item was already used");
                    }
                    else{putIn.add(World.items.get(choice - 1)); CLI.print("Added: " + World.items.get(choice - 1));}
					//to here
                }
                int success = 0;
                for (Item item : putIn) {
                    if(item instanceof MercuryBottle || item instanceof Coin && World.hasBook) {
                        success++;
                    }
                    if(success == 2){
                        World.addItem(new Gold());
                    }
                }
            }else{CLI.print("You unfortunately don't have any items.");}
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
