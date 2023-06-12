package co.develhope.introduction;
import java.util.Arrays;

public class ArrayExercise {
    public static  void main (String [] args){
        String [] carBrands = new String [4];
       carBrands[0] = "Mercedes";
       carBrands[1] = "Audi";
       carBrands[2] = "Porsche";
       carBrands[3] = "Maserati";

       System.out.println(carBrands[3]);

     int[] primeNumbers =new int [6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

       for (int i=0; i<primeNumbers.length; i++){
            System.out.println("The " + (i + 1)+ " prime number is: " + primeNumbers[i]);
}             //Oppure in modo piu semplice ma usando le utilities degli array
       System.out.println("The first 6 prime numbers are: " + Arrays.toString(primeNumbers));

    }
}