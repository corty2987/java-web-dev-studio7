package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String title;
    private int storageCapacity;
    private String discType;
    private ArrayList<String> contents;

    public BaseDisc(String title, int storageCapacity, String discType) {
        this.title = title;
        this.storageCapacity = storageCapacity;
        this.discType = discType;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //add custom methods//
    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }
}

