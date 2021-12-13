package ru.myitschool;

public class Game implements UserChoiceListener{
    private int n = 0;
    private Storage storage;
    private View view;
    private Location currentLocation;


    public Game(Storage storage) {
        this.storage = storage;
        this.view = new View(this);
    }

    public void start(int start){
        currentLocation = storage.getLocation(0);
        view.showLocation(currentLocation);
    }

    public void userChoice(int actionIndex){
        int idLocation = currentLocation.getActions()[actionIndex].getIdNextLocationId();
        currentLocation = storage.getLocation(idLocation);
        if(idLocation!=-1){
            view.showLocation(currentLocation);
        }
    }
}
