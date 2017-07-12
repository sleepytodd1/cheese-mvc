package org.launchcode.controllers;

import org.launchcode.models.Cheese;
import org.launchcode.models.CheeseData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
@Controller
//Sets all classes inside with the default path of /cheese
@RequestMapping("cheese")
public class CheeseController {

    static ArrayList<Cheese> cheeses = new ArrayList<>();

    // Request path: value="" means source path which here is /cheese
    // index Model model allows us to send to the view
    @RequestMapping(value = "")
    public String index(Model model) {

        //adds all CheeseData found to the view at cheese/index
        //adds the title "My Cheeses" to cheese/index
        // (attribute names can be anything you want unless previously named elsewhere)
        model.addAttribute("cheeses", CheeseData.getAll());
        model.addAttribute("title", "My Cheeses");

        //render cheese/index.html template
        return "cheese/index";
    }

    // value="add" says this happens at cheese/add and the method is a GET
    // dispalyAddCheese is using Model class/object so this will be sent to the view
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCheeseForm(Model model) {

        //adds the title "Add Cheese" at path cheese/add (cheese/add.html)
        model.addAttribute("title", "Add Cheese");
        return "cheese/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(@ModelAttribute Cheese newCheese) {
        CheeseData.add(newCheese);
        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveCheeseForm(Model model) {
        model.addAttribute("cheeses", CheeseData.getAll());
        model.addAttribute("title", "Remove Cheese");
        return "cheese/remove";
    }
    //@RequestParam tells spring to look for request parameter with the same name and if found,
    //insert it into the parameter ** must match the name="" field in the html file
    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveCheeseForm(@RequestParam int[] cheeseIds) {

        for (int cheeseId : cheeseIds) {
            CheeseData.remove(cheeseId);
        }
        //redirect without a specific route refers to the first route mentioned by the handler which
        //is /cheese in this case
        return "redirect:";
    }

}
