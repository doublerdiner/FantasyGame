package character;

import item.Item;

import java.util.ArrayList;

public abstract class Character {
    private String name;
    private int hp;
    private int inventorySize;
    private ArrayList<Item> inventory;
    public Character(String name, int hp, int inventorySize){
        this.name = name;
        this.hp = hp;
        this.inventorySize = inventorySize;
        this.inventory = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public int getInventorySize() {
        return inventorySize;
    }
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void heal(int num){
        this.hp += num;
    }
    public void bleed(int num){
        this.hp -= num;
    }
    public Item drop(Item item){
        this.inventory.remove(item);
        return item;
    }
    public void pickup(Item item){
        this.inventory.add(item);
    }
}
