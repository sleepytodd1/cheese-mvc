package org.launchcode.models;

import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class CheeseData {

    //creates arraylist called cheeses
    static ArrayList<Cheese> cheeses = new ArrayList<>();

    // creates arraylist of Cheese object called getAll that returns cheeses
    public static ArrayList<Cheese> getAll() {
        return cheeses;
    }

    // creates add method from Cheese object called newCheese
    // that adds newCheese to cheeses
    public static void add(Cheese newCheese) {
        cheeses.add(newCheese);
    }

    // creates remove method based on id that is int
    // Cheese object called cheeseToRemove that retrieves id
    // removes cheese from cheeses by calling cheeseToRemove
    public static void remove(int id) {
        Cheese cheeseToRemove = getById(id);
        cheeses.remove(cheeseToRemove);
    }

    // creates Cheese object method getById that is int type
    // creates Cheese object called theCheese that is null value

    public static Cheese getById(int id) {

        Cheese theCheese = null;

        // creates for loop with Cheese object iterator called candidateCheese that loops over cheeses
        // if the id of candidateCheeses matches id in the list
        // theCheese null value is replaced with the id found through looping
        for (Cheese candidateCheese : cheeses) {
            if (candidateCheese.getCheeseId() == id) {
                theCheese = candidateCheese;
            }
        }
        // either null or found id is returned
        return theCheese;
    }

}
