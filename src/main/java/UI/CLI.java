package UI;

import java.util.Scanner;

public class CLI {
    private static final Scanner scanner = new Scanner(System.in);
    public static void print(String text){
        System.out.println(text);
    }
    public static int getInput(){
        return Integer.parseInt(scanner.nextLine());
    } //TODO return int instead of String
    public static void err(String message){
        print("[!]Error: " + message);
    }
}
