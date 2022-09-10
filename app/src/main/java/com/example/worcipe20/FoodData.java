package com.example.worcipe20;

public class FoodData {

    private String itemRating;
    private String itemName;
    private String itemDescription;
    private int itemImage;

    public FoodData(String itemName, String itemRating, String itemDescription, int itemImage) {
        this.itemName = itemName;
        this.itemRating = itemRating;
        this.itemDescription = itemDescription;
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemRating() {
        return itemRating;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public int getItemImage() {
        return itemImage;
    }
}
