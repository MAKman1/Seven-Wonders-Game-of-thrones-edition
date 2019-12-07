package backend.models;

import javafx.scene.paint.Color;

public class Resource extends Card {
    private int[] resourcesList;
    private String[] type;

    public Resource(String name, int[] cardFreq, int age, Cost cost,
                    Color color, String imagePath, int[] resourcesList, String[] type){
        super(name, cardFreq, age, cost, color, imagePath);

        this.resourcesList = new int[resourcesList.length];
        for( int i = 0; i < resourcesList.length; i++)
            this.resourcesList[i] = resourcesList[i];

        this.type = new String[type.length];
        for( int i = 0; i < type.length; i++)
            this.type[i] = type[i];
    }
}
