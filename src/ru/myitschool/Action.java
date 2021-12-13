package ru.myitschool;

public class Action {
    private String description;
    private int idNextLocation;
    public String getText(){
        return description;
    }
    public int getIdNextLocationId(){
        return idNextLocation;
    }
    public Action(String text, int idNextLocation) {
        this.description = text;
        this.idNextLocation = idNextLocation;
    }
}
/*
Action(действие):
    //текст
    //номер локации
    String getText()
    int getIdNextLocation()
 */