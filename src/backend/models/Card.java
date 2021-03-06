package backend.models;

import javafx.scene.paint.Color;

public class Card {
    public String cardType;

    public String name;
    public int cardFreq;
    public int age;
    public Cost cost;
    public String imagePath;
    public String iconPath;
    public String backPath;
    public String chain1, chain2;

    public Card(String name, int cardFreq, int age, Cost cost, String imagePath,
                String iconPath, String backPath, String chain1, String chain2){
        this.name = name;
        this.age= age;
        this.cost = cost;
        this.imagePath = imagePath;
        this.iconPath = iconPath;
        this.backPath = backPath;
        this.cardFreq = cardFreq;
        this.chain1 = chain1;
        this.chain2 = chain2;
    }

    //this initializer is for ui testing
    public Card(String name, Cost cost, String imagePath,
                String iconPath, String backPath){
        this.name = name;
        this.cost = cost;
        this.imagePath = imagePath;
        this.iconPath = iconPath;
        this.backPath = backPath;
    }

    public Cost getCost() {
        return cost;
    }

    public boolean isResource(){ return false; }

    public boolean isMilitary(){
        return false;
    }

    public boolean isScience(){
        return false;
    }

    public boolean isCivic(){
        return false;
    }

    public boolean isCommerce(){
        return false;
    }

    public boolean isCrisis(){
        return false;
    }

}
