package com.ua.senera.controller;

import java.util.ArrayList;
import java.util.List;

import com.ua.senera.model.ReviewForm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ua.senera.model.Review;

@Controller
public class MainController {
    private static List<Review> reviews = new ArrayList<Review>();

    static {
        reviews.add(new Review("Валера", "Одеса", "Крем дуже допоміг"));
        reviews.add(new Review("Андрій", "Київ", "Давно шукав щось подібне"));

    }

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("reviews", reviews);


        return "index";
    }

    @RequestMapping(value = { "/addReview" }, method = RequestMethod.POST)
    public String saveReview(Model model, //
                            @ModelAttribute("reviewForm") ReviewForm reviewForm) {

        String name = reviewForm.getName();
        String city = reviewForm.getCity();
        String text = reviewForm.getText();

        Review newReview = new Review(name, city, text);
        reviews.add(newReview);

        return "redirect:/index";
    }


}
