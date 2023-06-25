package co.develhope.introduction.Static;

public class Main {
    public static void main (String [] args){

 Employee  newEmployer1 = new Employee("Giovanni", "Rossi", "Viale della Liberazione, 12");
 Employee newEmployer2 = new Employee("Giuseppe", "Verdi", "Via dei Mille, 44");

Badge badge1 = new Badge(newEmployer1);
badge1.showBadgeDetails();
Badge badge2 = new Badge(newEmployer2);
badge2.showBadgeDetails();


    }
}
