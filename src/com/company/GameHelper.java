package com.company;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> locationCells;
    public void setLocationCells (ArrayList<String> locs) {
        locationCells = locs;
    }
    public String checkYourself(String stringGuess) {
        String result = "Мимо";
        int index = locationCells.indexOf(stringGuess);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
package com.company;
import java.util.Arraylist;
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        int numofGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        ArrayList<String> locations = new ArrayList<>();
        locations.add(String.valueOf(randomNum));
        locations.add(String.valueOf(randomNum + 1));
        locations.add(String.valueOf(randomNum + 2));
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive) {
            String guess = helper.getUserInput()
        }

    }
}
