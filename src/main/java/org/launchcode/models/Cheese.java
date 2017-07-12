package org.launchcode.models;

/**
 * Created by LaunchCode
 */
public class Cheese {

    private String name;
    private String description;
<<<<<<< Updated upstream
    private int cheeseId;
    private static int nextId = 1;
=======
>>>>>>> Stashed changes

    public Cheese(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
<<<<<<< Updated upstream
}
=======
>>>>>>> Stashed changes
