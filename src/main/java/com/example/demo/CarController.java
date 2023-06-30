package com.example.demo;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
@RequestMapping(path="/cars") 
public class CarController {

    @Autowired 
    private CarRepository carRepository;
  
  @CrossOrigin
  @PostMapping(path="/add") 
  public @ResponseBody String addNewCar (
    @RequestParam String model,
    @RequestParam Integer tank
    ) {
   
        int totalPrice= 10 * tank;

    Car n = new Car();
    n.setModel(model);
    n.setTank(tank);
    n.setPrice(totalPrice);
    carRepository.save(n);
    return "Saved";
  }

  
  @CrossOrigin
  @GetMapping(path="/all")
  public @ResponseBody Iterable<Car> getAllCars() {
    return carRepository.findAll();
  }
    
}
