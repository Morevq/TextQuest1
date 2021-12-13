package ru.myitschool;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        //View view = new View(); //должно быть в Game, хотя вроде нет
        Game game = new Game(storage);
        game.start(0);
    }
}

/*
Location(ситуация):
    //текст описания
    //событие
    //ссылки нас следующие локации
    String getText()
    Action[] getActions()
Action(действие):
    //текст
    //номер локации
    String getText()
    int getIdNextLocationId()
View("экран"):
    void show(Location location)
Storage(список локаций):
    location getLocation(int id)
Game(собственно игра) implements UserChoiceListener:
    //должен взаимодействовать с View
interface UserChoiceListener{
    void userChoice(int actionIndex); //номер выбранного действия
}
*/