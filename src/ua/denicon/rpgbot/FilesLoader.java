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
import java.util.HashMap;
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
                createDirectories(File.separator + "Rpgconfig");
                createConfigFile(Paths.get(File.separator + "Rpgconfig" + File.separator +"config.yml"));
                createTextConfigFile(Paths.get(File.separator + "Rpgconfig" + File.separator + "Texts" + File.separator + "textConfig.yml"));
                createCommandConfigFile(Paths.get(File.separator + "Rpgconfig" + File.separator +"commands.yml"));
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

    private void createTextConfigFile(Path pathToFile) throws IOException {
        System.out.println("Creating : " + pathToFile);
        Files.createFile(pathToFile);
        Yaml yaml = new Yaml();
        HashMap<String, String> map = new HashMap<>();
        map.put("help", "");
    }

    private void createConfigFile(Path pathToFile) throws IOException {
        System.out.println("Creating : " + pathToFile);
        Files.createFile(pathToFile);
        Yaml yaml = new Yaml();
        HashMap<String, String> map = new HashMap<>();
        map.put("commandStart", ".");
        map.put("host", "");
        map.put("port", "");
        yaml.dump(map, new FileWriter(pathToFile.toFile()));
    }

    private void createCommandConfigFile(Path pathToFile) throws IOException {
        System.out.println("Creating : " + pathToFile);
        Files.createFile(pathToFile);
    }

    private  void createDirectories(String pathToRootDirectory) throws IOException {
        System.out.println("Creating directory: " + pathToRootDirectory + File.separator +"Items");
        Files.createDirectories(Paths.get(pathToRootDirectory + File.separator +"Items"));
        System.out.println("Creating directory: " + pathToRootDirectory + File.separator +"Texts");
        Files.createDirectories(Paths.get(pathToRootDirectory + File.separator +"Texts"));
        System.out.println("Creating directory: " + pathToRootDirectory + File.separator +"Quests");
        Files.createDirectories(Paths.get(pathToRootDirectory + File.separator +"Quests"));
        System.out.println("Creating directory: " + pathToRootDirectory + File.separator +"Players");
        Files.createDirectories(Paths.get(pathToRootDirectory + File.separator +"Players"));
    }
}
