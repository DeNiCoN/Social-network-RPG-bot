package ua.denicon.rpgbot;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import ua.denicon.rpgbot.gameobjects.Quest;
import ua.denicon.rpgbot.gameobjects.inventory.Item;

import java.util.ArrayList;
import java.util.logging.Level;

public class Main {

    public static ArrayList<Item> items;
    public static ArrayList<Quest> quests;


    public static void main(String[] args) throws InterruptedException {
        FilesLoader.getInstance().load();
        items = FilesLoader.getInstance().loadItems();
        quests = FilesLoader.getInstance().loadQuests();
        final TS3Config config = new TS3Config();
        config.setHost("91.210.178.107");
        config.setQueryPort(9987);
        config.setDebugLevel(Level.ALL);
        final TS3Query query = new TS3Query(config);
        query.connect();
        final TS3Api api = query.getApi();
        api.selectVirtualServerById(1);
        api.setNickname("DeNiCoNBot");
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
