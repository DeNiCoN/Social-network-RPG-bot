package ua.denicon.rpgbot.gameobjects.inventory;

public class Item {
    private String name, lore, slotName;
    private ItemRarity rarity;
    private int level;

    private float health, armor, attack, critMultipler, critChange, blockChange, doubleAttackChange;


    public String getName() {
        return name;
    }

    public String getLore() {
        return lore;
    }

    public String getSlotName() {
        return slotName;
    }

    public float getHealth() {
        return health;
    }

    public float getArmor() {
        return armor;
    }

    public float getAttack() {
        return attack;
    }

    public float getCritMultipler() {
        return critMultipler;
    }

    public float getCritChange() {
        return critChange;
    }

    public float getBlockChange() {
        return blockChange;
    }

    public int getLevel() {
        return level;
    }

    public float getDoubleAttackChange() {
        return doubleAttackChange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public void setAttack(float attack) {
        this.attack = attack;
    }

    public void setCritMultipler(float critMultipler) {
        this.critMultipler = critMultipler;
    }

    public void setCritChange(float critChange) {
        this.critChange = critChange;
    }

    public void setBlockChange(float blockChange) {
        this.blockChange = blockChange;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setDoubleAttackChange(float doubleAttackChange) {
        this.doubleAttackChange = doubleAttackChange;
    }

    public ItemRarity getRarity() {
        return rarity;
    }

    public void setRarity(ItemRarity rarity) {
        this.rarity = rarity;
    }

    public void setStats(float health, float armor, float attack, float critMultipler, float critChange, float blockChange, int level, float doubleAttackChange) {
        this.health = health;
        this.armor = armor;
        this.attack = attack;
        this.critMultipler = critMultipler;
        this.critChange = critChange;
        this.blockChange = blockChange;
        this.level = level;
        this.doubleAttackChange = doubleAttackChange;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", lore='" + lore + '\'' +
                ", slotName='" + slotName + '\'' +
                ", rarity=" + rarity +
                ", level=" + level +
                ", health=" + health +
                ", armor=" + armor +
                ", attack=" + attack +
                ", critMultipler=" + critMultipler +
                ", critChange=" + critChange +
                ", blockChange=" + blockChange +
                ", doubleAttackChange=" + doubleAttackChange +
                '}';
    }
}
