package ua.denicon.rpgbot;

import ua.denicon.rpgbot.gameobjects.Quest;
import ua.denicon.rpgbot.gameobjects.inventory.Item;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Item> items;
    public static ArrayList<Quest> quests;


    public static void main(String[] args) throws InterruptedException {
        FilesLoader.getInstance().load();
        items = FilesLoader.getInstance().loadItems();
        quests = FilesLoader.getInstance().loadQuests();
    }

    public static Item getItemByName(String name) {
        for (Item item : items
             ) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}
