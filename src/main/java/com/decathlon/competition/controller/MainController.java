package com.decathlon.competition.controller;

import com.decathlon.competition.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class MainController {

  @Autowired
  CalculateService calculateService;

//  @GetMapping("/")
//  public String startPage(Model model) {
//    return "main";
//  }
//
//  @GetMapping("/flight")
//  public String flightInfo(Model model) {
////    Map<String, String> some = new HashMap<>();
////    some.put("1", "some1");
////    some.put("2", "some2");
////    some.put("3", "some3");
////    model.addAttribute("flight", "Hello!");
//    return "flight";
//  }

  @GetMapping("/")
  public String startPage(Model model) {
    return "main";
  }

  @GetMapping("/flight")
  public String resultsPage() {
    //model.addAttribute("some", some);
    //model.addAttribute("flight", calculateSerice.resultsMap());
    //model.addAttribute("disciplines", calculateSerice.disciplinesList());
    return "flight";
  }

  @PostMapping("/flightInfo")
  public String flightInfo(
          @RequestParam("flightDate") String flightDate,
          @RequestParam("departureCode") String departureCode,
          @RequestParam("arrivalCode") String arrivalCode,
          Model model) {
    String flightNumber = calculateService.flightNumber(flightDate, departureCode, arrivalCode);
    model.addAttribute("flightNumber", flightNumber);
    return "calculate";
  }

//  @GetMapping("/weights")
//  public String weightsPage(Model model) {
//    model.addAttribute("weights", calculateSerice.weights());
//    model.addAttribute("disciplines", calculateSerice.disciplinesList());
//    return "weights";
//  }
//
//  @GetMapping("/calculate")
//  public String calculatePage() {
//    return "calculate";
//  }
//
//  @PostMapping("/calculate")
//  public String calculate(Model model) {
//    List<String> places = calculateSerice.calculatePlaces(calculateSerice.resultsMap());
//    model.addAttribute("firstPlace", places.get(2));
//    model.addAttribute("secondPlace", places.get(1));
//    model.addAttribute("thridPlace", places.get(0));
//    return "calculate";
//  }

}
