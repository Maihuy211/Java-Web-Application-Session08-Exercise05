package com.example.bai5.controller;

import com.example.bai5.dto.TourDto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TourController {

    @GetMapping("/tour/create")
    public String showForm(Model model) {
        model.addAttribute("tour", new TourDto());
        return "create-tour";
    }

    @PostMapping("/tour/create")
    public String save(
            @Valid @ModelAttribute("tour") TourDto tour,
            BindingResult result) {

        if (result.hasErrors()) {
            return "create-tour";
        }

        return "redirect:/tour/success";
    }
}