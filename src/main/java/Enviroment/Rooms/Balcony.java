package Enviroment.Rooms;
import Core.World;
import Enviroment.Item;
import Enviroment.Items.Seeds;
import Enviroment.Room;
import UI.CLI;

public class Balcony extends Room {
    private int id = 2;
    private String name = "Balcony";
    private String description = "The balcony is surprisingly not as big as you would expect. From here, you can see the angry mob waiting at the main entrance.";
    private String condorText = "Unexpectedly you see a giant condor heading at you. You quickly try to go back inside before it can get you.\nBefore you do so the condor is sits on the rail, hungrily looks at you. Try and give it something.";
    private Boolean condor = false;
    private final int optionNum = 4;

    public void printOptions(){
        CLI.print("[1] Go back through the glass doors back into the library");
        CLI.print("[2] Try and jump down the balcony");
        CLI.print("[3] Try feeding the condor something");
    }
    public void act(int option){
        if(option == 1){
            World.movePlayer(1);
            return;
        }
        if(option == 2){
            World.movePlayer(3);
            return;
        }
        if(option == 3){
            if(World.items.stream().anyMatch(item -> item instanceof Seeds)){
                World.cause = "By feeding the condor seeds, it now has energy and as a sign of thank you it takes you somewhere far away.";
                World.gameEnded = true;
            }
            else{CLI.print("You do not have anything the condor would like. Try and find something!");}
        }
    }

    public void print(){
        if(!condor){
            CLI.print("You are at the " + name);
            CLI.print(description);
            CLI.print(condorText);
            condor =  true;
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
