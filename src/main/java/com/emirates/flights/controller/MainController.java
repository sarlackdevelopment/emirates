package com.emirates.flights.controller;

import com.emirates.flights.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  CalculateService calculateService;

  @GetMapping("/")
  public String startPage(Model model) {
    return "main";
  }

  @GetMapping("/flight")
  public String resultsPage() {
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

  @PostMapping("/calculatePrice")
  public String calculatePrice(@RequestParam("flightNumber") String flightNumber, Model model) {
    String price = calculateService.calculatePrice(flightNumber);
    model.addAttribute("price", price);
    return "calculate";
  }

}
