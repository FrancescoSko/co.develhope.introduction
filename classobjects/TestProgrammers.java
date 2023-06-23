package co.develhope.introduction.classobjects;

public class TestProgrammers {
  public static void main (String [] args){

        Programmer programmer1 = new Programmer();
        Programmer programmer2 = new Programmer();

            programmer1.name = "Francesco";
            programmer1.age = 22;
            programmer1.wearsGlasses = true;

            programmer2.name = "Marcello";
            programmer2.age = 31;
            programmer2.wearsGlasses = false;

            programmer1.drinkCoffe();
            programmer1.printDetails();

            programmer2.hasGlasses();

        }

    }
