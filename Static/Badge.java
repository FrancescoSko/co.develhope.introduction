package co.develhope.introduction.Static;

import java.util.Random;

public class Badge {
  private static int totalNumberOfEmployees;
  private String badgeId;
  public Employee employee;


  private static void keepTrackOfEmployeesNumber() {
    totalNumberOfEmployees++;
  }

  private String generateBadgeIdCode(Employee employee) {
    String prefix = generateRandomString(3);
    String suffix = generateRandomString(3);
    return prefix + employee.name + employee.surname + suffix;

  }
  private String generateRandomString(int length) {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Random random = new Random();
    StringBuilder randomString = new StringBuilder();

    for (int i = 0; i < length; i++) {
      char randomChar = alphabet.charAt(random.nextInt(alphabet.length()));
      randomString.append(randomChar);
    } return randomString.toString();
  }

  public void showBadgeDetails() {
    System.out.println("Total number of employees tracked by badges: " + totalNumberOfEmployees);
    System.out.println("Employee details: " + employee.getEmployeeDetails());
    System.out.println("BadgeId code: " + badgeId);
  }


  public Badge(Employee employeeThatNeedsBadge) {
    keepTrackOfEmployeesNumber();
    employee = employeeThatNeedsBadge;
    badgeId= generateBadgeIdCode(employee);
  }




}




