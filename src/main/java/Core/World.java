package Core;
import Enviroment.Item;
import Enviroment.Room;
import UI.CLI;
import java.util.ArrayList;

public class World {
    private static ArrayList<Room> rooms = new ArrayList<>();
    public static Boolean gameEnded = false; //eg. win
    public static Boolean gameOver = false; //eg. death
    public static String cause = null; //multipurpose for both game over && winning
    private static Boolean fireplaceOpen = false;

    //player
    private static int currentRoom = 0; //so that the player always starts here and can move from there
    public static ArrayList<Item> items = new ArrayList<>(); //public so that rooms can easily check if player has certain item
    public static Boolean hasSword = false;
    public static Boolean hasBook = false;
    public static Boolean hasGold = false;
    public static Boolean hasMeat = false;
    public static Boolean hasSalt = false;

    public static void aboutRoom(){
        rooms.get(currentRoom).print();
    }
    public static void printOptions(){
        Room room = rooms.get(currentRoom);
        CLI.print("You can:");
        CLI.print("[0] Show inventory");
        room.printOptions();
    }
    public static void actOptions(int option){
        if(option >= 0 && option < rooms.get(currentRoom).getOptionNum()){
            if(option == 0){
                if(!items.isEmpty()){
                    CLI.print("Inventory:");
                    for(int i = 1; i < items.size() + 1; i++){
                        CLI.print("[" + i + "] " + items.get(i-1).toString());
                    }
                }else{CLI.print("Your inventory is empty");}
                printOptions();
                actOptions(CLI.getInput());
            }
            rooms.get(currentRoom).act(option);
        }else{CLI.err("The number is out of range! Try again");actOptions(CLI.getInput());}
    }

    public static void addRooms(ArrayList<Room> r){
        rooms = r;
    }
    public static void movePlayer(int roomID){
        if(roomID == -1){
            gameOver = true;
            return;
        }
        currentRoom = roomID;
    }
    public static void addItem(Item item){
        if(items.contains(item)){
            return;
        }
        items.add(item);
    }
    public static void removeItem(Item item){
        if(items.contains(item)){
            items.remove(item);
        }
        else {CLI.err("Item does not exist!");}
    }
    public static void openFireplace(){
        fireplaceOpen = true;
    }
    public static Boolean isFireplaceOpen(){
        return fireplaceOpen;
    }
}
