package ua.denicon.rpgbot.gameobjects.inventory;

public class Slot {
    private String name;
    private String itemName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItem() {
        return itemName;
    }

    public void setItem(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "name='" + name + '\'' +
                ", item=" + itemName +
                '}';
    }
}
