package com.pharmacy.CRUD.controller;

import com.pharmacy.CRUD.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/")
    public String indexPage(Model model){
        Item item = new Item();
        model.addAttribute("item",item);
        return "items";
    }
}
