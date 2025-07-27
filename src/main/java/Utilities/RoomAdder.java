package Utilities;

import Core.World;
import Enviroment.Room;
import Enviroment.Rooms.Library;
import Enviroment.Rooms.MainHall;

import java.util.ArrayList;

public class RoomAdder {//purely made for the purpose of adding rooms for the main code to not look messy
    private static ArrayList<Room> rooms = new ArrayList<>();

    public static void main(String[] args){
        rooms.add(new MainHall());
        rooms.add(new Library());
        //dumps them into World.java
        World.addRooms(rooms);
    }
}
