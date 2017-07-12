package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by margareticloud on 7/11/17.
 */

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("/user/add")
    public String add(Model model){

        return"add";
    }

    @RequestMapping("/user/add", method = RequestMethod.POST)
    public String add(Model model, @ModelAttribute User user, String verify){

    }
}
