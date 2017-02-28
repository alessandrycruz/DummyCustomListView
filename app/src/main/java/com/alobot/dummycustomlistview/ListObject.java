package com.alobot.dummycustomlistview;

public class ListObject {
    private String thumbnail_1;
    private String itemNumber;
    private String description;
    private String price;
    private String quantity;
    private String thumbnail_2;

    public ListObject(String thumbnail_1, String itemNumber, String description, String price, String quantity, String thumbnail_2) {
        this.thumbnail_1 = thumbnail_1;
        this.itemNumber = itemNumber;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.thumbnail_2 = thumbnail_2;
    }

    public String getThumbnail_1() {
        return thumbnail_1;
    }

    public void setThumbnail_1(String thumbnail_1) {
        this.thumbnail_1 = thumbnail_1;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getThumbnail_2() {
        return thumbnail_2;
    }

    public void setThumbnail_2(String thumbnail_2) {
        this.thumbnail_2 = thumbnail_2;
    }
}
