package ru.myitschool;

public class Location {
    private String description;
    private Action[] actions;
    private int idNextLocation;
    public String getText(){
        return description;
    }
    Action[] getActions(){
        return actions;
    }
    public Location(int idNextLocation, String text, Action[] actions) {
        this.description = text;
        this.actions = actions;
        this.idNextLocation = idNextLocation;
    }
}
/*
Location(ситуация):
    //текст описания
    //событие
    //ссылки нас следующие локации
    public Location(int idNextLocation, String text, Action[] actions)
    String getText()
    Action[] getActions()
 */