package ru.myitschool;

public class Storage {
    private Location[] locations = new Location[3];
    public Storage() {
        locations[0] = new Location(0, "You are on start. What to do?",
                new Action[]{
                        new Action("Forward", 1),
                        new Action("Backward", 2)
                });

        locations[1] = new Location(1, "You are on forest. What to do?",
                new Action[]{
                        new Action("Forward", 2),
                        new Action("Backward", 0)
                });
        locations[2] = new Location(2, "You are on river. What to do?",
                new Action[]{
                        new Action("Left", 1),
                        new Action("Right", 0)
                });
    }
    Location getLocation(int id){
        return locations[id];
    }
}
/*
Storage(список локаций):
    Location getLocation(int id)
 */