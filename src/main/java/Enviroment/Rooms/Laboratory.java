package Enviroment.Rooms;
import Core.World;
import Enviroment.Items.MercuryBottle;
import Enviroment.Room;
import UI.CLI;

public class Laboratory extends Room {
    private int id = 6;
    private String name = "Secret laboratory";
    private String description = "The laboratory is quite small but equipped very well with a alchemy table in the middle of the room.";
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
        if(option == 3){ //TODO complete the menu
            CLI.print("Alchemy table:");
            CLI.print("You have exactly 3 spots in which you can put any of your items.");
            if(!World.items.isEmpty()){
                for(int i = 1; i < World.items.size(); i++){
                    CLI.print("[" + i + "]" + World.items.get(i - 1));
                }
                String choice = CLI.getInput();
                if(choice.equalsIgnoreCase("0")){
                    return;
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
