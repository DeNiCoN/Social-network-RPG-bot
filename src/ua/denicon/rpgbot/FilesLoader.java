package ua.denicon.rpgbot;

import org.yaml.snakeyaml.Yaml;
import ua.denicon.rpgbot.gameobjects.Quest;
import ua.denicon.rpgbot.gameobjects.inventory.Inventory;
import ua.denicon.rpgbot.gameobjects.inventory.Item;
import ua.denicon.rpgbot.gameobjects.inventory.ItemRarity;
import ua.denicon.rpgbot.gameobjects.inventory.Slot;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesLoader {

    private static FilesLoader instance;

    public static FilesLoader getInstance() {
        if (instance != null) {
            return instance;
        }
        return instance = new FilesLoader();
    }

    private FilesLoader() {
    }

    public void load() {
        if (Files.notExists(Paths.get(File.separator + "Rpgconfig"))) {
            try {
                System.out.println("Creating directory: " + File.separator + "Rpgconfig" + File.separator +"Items");
                Files.createDirectories(Paths.get(File.separator + "Rpgconfig" + File.separator +"Items"));
                System.out.println("Creating directory: " + File.separator + "Rpgconfig" + File.separator +"Texts");
                Files.createDirectories(Paths.get(File.separator + "Rpgconfig" + File.separator +"Texts"));
                System.out.println("Creating directory: " + File.separator + "Rpgconfig" + File.separator +"Quests");
                Files.createDirectories(Paths.get(File.separator + "Rpgconfig" + File.separator +"Quests"));
                System.out.println("Creating directory: " + File.separator + "Rpgconfig" + File.separator +"Players");
                Files.createDirectories(Paths.get(File.separator + "Rpgconfig" + File.separator +"Players"));
                System.out.println("Creating : " + File.separator + "Rpgconfig" + File.separator +"config.yml");
                Files.createFile(Paths.get(File.separator + "Rpgconfig" + File.separator +"config.yml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Item> loadItems() {
        ArrayList<Item> items = new ArrayList<>();
        Stream<Path> paths = null;
        try {
            paths = Files.walk(Paths.get(File.separator + "Rpgconfig" + File.separator +"Items" + File.separator));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (paths != null) {
            for (Path path: paths.collect(Collectors.toList())
                 ) {
                if (!path.toString().equalsIgnoreCase(File.separator + "Rpgconfig" + File.separator +"Items")) {
                    System.out.println("Loading " + path);
                    items.add((Item) loadYaml(path, Item.class));
                }
            }
        }
        return items;
    }

    public ArrayList<Quest> loadQuests() {
        ArrayList<Quest> quests = new ArrayList<>();
        Stream<Path> paths = null;
        try {
            paths = Files.walk(Paths.get(File.separator + "Rpgconfig" + File.separator +"Quests" + File.separator));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (paths != null) {
            for (Path path: paths.collect(Collectors.toList())
                    ) {
                if (!path.toString().equalsIgnoreCase(File.separator + "Rpgconfig" + File.separator +"Quests")) {
                    System.out.println("Loading " + path);
                    quests.add((Quest) loadYaml(path, Quest.class));
                }
            }
        }
        return quests;
    }

    public Object loadYaml(Path path, Class objectClass) {
        Yaml yaml = new Yaml();
        Object object = null;
        try {
            object = yaml.loadAs(Files.newInputStream(path), objectClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }
}
