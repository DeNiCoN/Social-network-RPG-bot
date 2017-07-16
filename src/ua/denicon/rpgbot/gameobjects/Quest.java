package ua.denicon.rpgbot.gameobjects;

public class Quest {
    private String name, lore;
    private int level, exp, time, commonChange, uncommonChange, rareChange, epicChange, legendaryChange;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCommonChange() {
        return commonChange;
    }

    public void setCommonChange(int commonChange) {
        this.commonChange = commonChange;
    }

    public int getUncommonChange() {
        return uncommonChange;
    }

    public void setUncommonChange(int uncommonChange) {
        this.uncommonChange = uncommonChange;
    }

    public int getRareChange() {
        return rareChange;
    }

    public void setRareChange(int rareChange) {
        this.rareChange = rareChange;
    }

    public int getEpicChange() {
        return epicChange;
    }

    public void setEpicChange(int epicChange) {
        this.epicChange = epicChange;
    }

    public int getLegendaryChange() {
        return legendaryChange;
    }

    public void setLegendaryChange(int legendaryChange) {
        this.legendaryChange = legendaryChange;
    }

    @Override
    public String toString() {
        return "Quest{" +
                "name='" + name + '\'' +
                ", lore='" + lore + '\'' +
                ", level=" + level +
                ", exp=" + exp +
                ", time=" + time +
                ", commonChange=" + commonChange +
                ", uncommonChange=" + uncommonChange +
                ", rareChange=" + rareChange +
                ", epicChange=" + epicChange +
                ", legendaryChange=" + legendaryChange +
                '}';
    }
}
