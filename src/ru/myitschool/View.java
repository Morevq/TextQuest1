package ru.myitschool;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    UserChoiceListener ucl;
    View(Game ucl){
        this.ucl=ucl;
    }
    void showLocation(Location location){
        System.out.println(location.getText());
        Action[] actions = location.getActions();
        for(int i=0;i<actions.length;++i){
            System.out.print(i + 1 + ") " + actions[i].getText()+"  ");
        }
        System.out.println();
        int ans = in.nextInt();
        ucl.userChoice(ans-1);
    }
}

/*
View("экран"):
    void show(Location location)
 */