package co.develhope.introduction.encapsulation;

public class House {
 private int floorsNumber;
 private String address;
 private String[] residentNames;



 public void setAddress(String address){
  this.address = address;
 }
 public String getAddress() {
  return address;
 }
 public void setFloorsNumber(int floorsNumber){
  this.floorsNumber = floorsNumber;
 }
 public int getFloorsNumber() {
  return floorsNumber;
 }
 public void setResidentNames (String [] residentNames){
  this.residentNames = residentNames;
 }
 public String[] getResidentNames() {
  return residentNames;
 }



}
