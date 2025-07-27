package Core;
import Enviroment.Item;
import Enviroment.Room;
import UI.CLI;
import java.util.ArrayList;

public class World {
    private static ArrayList<Room> rooms = new ArrayList<>();
    public static Boolean gameEnded = false; //eg. win
    public static Boolean gameOver = false; //eg. death
    public static String cause = null; //multipurpose for both game over AND winning

    //player
    private static int currentRoom = 0; //so that the player always starts here and can move from there
    private static ArrayList<Item> items = new ArrayList<>();
    private static Boolean hasSword = false;

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
        Room room = rooms.get(currentRoom);
        printOptions(); //TODO what if it printed after room.act()? (and also after showing inventory <- the reason xD)
        if(option >= 0 && option < 4){
            if(option == 0){
                CLI.print("Inventory:");
                for(int i = 1; i < items.size() + 1; i++){
                    CLI.print("[" + i + "] " + items.get(i-1).toString());
                }
                actOptions(Integer.parseInt(CLI.getInput()));
            }
            room.act(option);
        }else{CLI.err("The number is out of range!");actOptions(Integer.parseInt(CLI.getInput()));}
    }

    public static void addRooms(ArrayList<Room> r){
        rooms = r;
    }
    public static void movePlayer(int roomID){
        if(roomID == 0){
            cause = "You opened the door to go and calm the angry mob down. Instead they they immediately pierced you with pitchforks and other farming equipment...";
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
}
