package UI;

import java.util.Scanner;

public class CLI {
    public static void print(String text){
        System.out.println(text);
    }
    public static void printRoom(String name, String description){ //might delete
        print("You are in " + name);
        print(description);
    }
    public static String getInput(){
        return new Scanner(System.in).nextLine();
    }
    public static void err(String message){
        print("[!]Error: " + message);
    }
}
