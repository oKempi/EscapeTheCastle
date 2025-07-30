package Enviroment.Rooms;
import Core.World;
import Enviroment.Items.MysteriousPaper;
import Enviroment.Room;
import UI.CLI;

public class SecretCorridor extends Room {
    private int id = 5;
    private String name = "Secret corridor";
    private String description = "A secret corridor connecting the small knight's hall fireplace and laboratory.";
    private final int optionNum = 4;

    public void printOptions(){
        CLI.print("[1] Go back through the fireplace back to the small knight's hall");
        CLI.print("[2] Continue to the laboratory");
        CLI.print("[3] Take a mysterious paper from the ground");
    }
    public void act(int option){
        if(option == 1){
            World.movePlayer(3);
            return;
        }
        if(option == 2){
            World.movePlayer(6);
            return;
        }
        if(option == 3){
            World.addItem(new MysteriousPaper());
            CLI.print("You took the paper from the ground.");
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
