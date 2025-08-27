package Enviroment.Rooms;
import Core.World;
import Enviroment.Items.Sword;
import Enviroment.Room;
import UI.CLI;

public class KnightsHallSmall extends Room{
    private int id = 3;
    private final String name = "Small knight's hall";
    private final String description = "The hall is quite small with just a few armour stands with full armour and swords. There is also quite unexpectedly a fireplace.";
    private final String fireplaceText = "You notice a small hole inside the cold fireplace. There could be something behind it!";
    private int optionNum = 4;

    public void printOptions(){
        CLI.print("[1] Use the oak doors to go back into the library");
        CLI.print("[2] Go to the royal bedroom");
        CLI.print("[3] Take a sword from one of the armour stands");
        if(World.isFireplaceOpen()){
            optionNum = 5;
            CLI.print("[4] Inspect the fireplace");
        }
    }
    public void act(int option){
        if(option == 1){
            World.movePlayer(1);
            return;
        }
        if(option == 2){
            World.movePlayer(8);
            return;
        }
        if(option == 3){
            World.addItem(new Sword());
            World.hasSword = true;
            CLI.print("You now have a sword.");
            return;
        }
        if(option == 4 && World.isFireplaceOpen()){
            World.movePlayer(5);
        }
    }

    public void print(){
        if(World.isFireplaceOpen()){
            CLI.print("You are at the " + name);
            CLI.print(description);
            CLI.print(fireplaceText);
        }
        else {
            CLI.print("You are at the " + name);
            CLI.print(description);
        }
    }
    public int getOptionNum(){
        return optionNum;
    }
}
