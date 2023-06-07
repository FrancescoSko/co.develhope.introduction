package co.develhope.introduction;

public class NumberOperations {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;

        int b = a;
        b++;

       boolean statement1;
       boolean statement2;
       statement1 = (b%2 == 0);
       statement2 = (b * (b+1) % 3 == 0);

      if (statement1 && statement2 == true){
          System.out.println("Both statements are true");
      }  else System.out.println("Not both statements are true");

      if (statement1 != true){
          System.out.println("B is an odd number");
      }



    }
}