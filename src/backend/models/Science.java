package backend.models;

import javafx.scene.paint.Color;

public class Science extends Card{
    private String[] type;

    public Science(String name, int[] cardFreq, int age, Cost cost, Color color, String imagePath, String[] type){
        super(name, cardFreq, age, cost, color, imagePath);

        this.type = new String[type.length];
        for(int i = 0; i < type.length; i++)
            this.type[i] = type[i];
    }
}