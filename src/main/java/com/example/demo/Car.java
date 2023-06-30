package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
   
    
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String model;

  private Integer tank;

  private Integer price;

  
  
  
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Integer getTank() {
    return tank;
  }

  public void setTank(Integer tank) {
    this.tank = tank;
  }



public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

}
