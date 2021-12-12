package com.decathlon.competition.controller;

import com.decathlon.competition.service.CalculateSerice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @Autowired
  CalculateSerice calculateSerice;

  @GetMapping("/")
  public String startPage(Model model) {
    return "main";
  }

  @GetMapping("/results")
  public String resultsPage(Model model) {
    model.addAttribute("results", calculateSerice.resultsMap());
    model.addAttribute("disciplines", calculateSerice.disciplinesList());
    return "results";
  }

  @GetMapping("/weights")
  public String weightsPage(Model model) {
    model.addAttribute("weights", calculateSerice.weights());
    model.addAttribute("disciplines", calculateSerice.disciplinesList());
    return "weights";
  }

  @GetMapping("/calculate")
  public String calculatePage() {
    return "calculate";
  }

  @PostMapping("/calculate")
  public String calculate(Model model) {
    List<String> places = calculateSerice.calculatePlaces(calculateSerice.resultsMap());
    model.addAttribute("firstPlace", places.get(2));
    model.addAttribute("secondPlace", places.get(1));
    model.addAttribute("thridPlace", places.get(0));
    return "calculate";
  }

}
