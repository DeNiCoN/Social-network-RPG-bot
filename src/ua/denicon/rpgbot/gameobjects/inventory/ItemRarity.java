package ua.denicon.rpgbot.gameobjects.inventory;


public enum ItemRarity {
    COMMON("common"), UNCOMMON("uncommon"), RARE("rare"), EPIC("epic"), LEGENDARY("legendary");

    private String name;

    ItemRarity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static ItemRarity getByName(String name) {
        for (ItemRarity rarity: ItemRarity.values()
             ) {
            if (rarity.getName().equalsIgnoreCase(name)) {
                return rarity;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ItemRarity{" +
                "name='" + name + '\'' +
                '}';
    }
}
