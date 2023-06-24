package co.develhope.introduction.encapsulation;

import java.util.Arrays;

public class Tester {
 public static void main(String[] args) {

  String [] residents = {"Luca", "Marco", "Paolo"};


  House house = new House();
 house.setAddress("Viale Roma,1");
 house.setFloorsNumber(4);
 house.setResidentNames(residents);

 String formatted = String.format("The house in %s and has %d floors and is habitated by %s", house.getAddress(), house.getFloorsNumber(),
          String.join(", ", house.getResidentNames()));

 System.out.println(formatted);


  }
}