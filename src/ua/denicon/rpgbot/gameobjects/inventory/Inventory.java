package ua.denicon.rpgbot.gameobjects.inventory;


import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private Slot head, body, legs, boots, firstAccesory, secondAssecory, thirdAssecory, leftArm, rightArm;
    private Slot[] slots = {head, body, legs, boots, firstAccesory, secondAssecory, thirdAssecory, leftArm, rightArm};

    public Inventory(Slot head, Slot body, Slot legs, Slot boots, Slot firstAccesory, Slot secondAssecory, Slot thirdAssecory, Slot leftArm, Slot rightArm) {
        this.head = head;
        this.body = body;
        this.legs = legs;
        this.boots = boots;
        this.firstAccesory = firstAccesory;
        this.secondAssecory = secondAssecory;
        this.thirdAssecory = thirdAssecory;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
    }

    public Inventory() {
    }

    public Slot[] getSlots() {
        return slots;
    }

    public Slot getHead() {
        return head;
    }

    public Slot getBody() {
        return body;
    }

    public Slot getLegs() {
        return legs;
    }

    public Slot getBoots() {
        return boots;
    }

    public Slot getFirstAccesory() {
        return firstAccesory;
    }

    public Slot getSecondAssecory() {
        return secondAssecory;
    }

    public Slot getThirdAssecory() {
        return thirdAssecory;
    }

    public Slot getLeftArm() {
        return leftArm;
    }

    public Slot getRightArm() {
        return rightArm;
    }

    public void setHead(Slot head) {
        this.head = head;
    }

    public void setBody(Slot body) {
        this.body = body;
    }

    public void setLegs(Slot legs) {
        this.legs = legs;
    }

    public void setBoots(Slot boots) {
        this.boots = boots;
    }

    public void setFirstAccesory(Slot firstAccesory) {
        this.firstAccesory = firstAccesory;
    }

    public void setSecondAssecory(Slot secondAssecory) {
        this.secondAssecory = secondAssecory;
    }

    public void setThirdAssecory(Slot thirdAssecory) {
        this.thirdAssecory = thirdAssecory;
    }

    public void setLeftArm(Slot leftArm) {
        this.leftArm = leftArm;
    }

    public void setRightArm(Slot rightArm) {
        this.rightArm = rightArm;
    }
}
