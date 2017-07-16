package ua.denicon.rpgbot.gameobjects;


import ua.denicon.rpgbot.Main;
import ua.denicon.rpgbot.gameobjects.inventory.Inventory;
import ua.denicon.rpgbot.gameobjects.inventory.Item;
import ua.denicon.rpgbot.gameobjects.inventory.Slot;

public class Character {
    private String name;
    private Inventory inventory;
    private int level, exp;

    public Character() {
    }

    public void mathStats() {
        //TODO
        float health = 0, armor = 0, attack = 0, critMultipler = 0, critChange = 0, blockChange = 0, doubleAttackChange = 0;
        for (Slot slot: inventory.getSlots()
             ) {
            Item item;
            if (slot.getItem() != null) {
                item = Main.getItemByName(slot.getItem());
                if (item != null) {
                    health += item.getHealth();
                    armor += item.getArmor();
                    attack += item.getAttack();
                    critMultipler += item.getCritMultipler();
                    critChange += item.getCritChange();
                    blockChange += item.getBlockChange();
                    doubleAttackChange += item.getDoubleAttackChange();
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public float getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
