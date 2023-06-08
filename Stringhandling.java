package co.develhope.introduction;

import java.util.Arrays;

public class Stringhandling {
    public static void main (String [] args) {
        String string1 = "Hello";
        String string2 = "How are you?";

     if (string1.length() > 1 && string2.length() > 1) {
         char c1 = string1.charAt(0);
         char c2 = string1.charAt(1);
         char c3 = string2.charAt(string2.length() - 2);
         char c4 = string2.charAt(string2.length() - 1);

         char[] charArray = {c1, c2, c3, c4};
         System.out.println(charArray);
     } else System.out.print("the string is less than 2 characters");



      //  char c1 = string1.charAt(0);
     //   char c2 = string1.charAt(1);
      //  char c3 = string2.charAt(string2.length()-2);
       // char c4 = string2.charAt(string2.length()-1);

       // char [] charArray = {c1, c2, c3, c4};
        //System.out.print(charArray);



        //System.out.println(c3);

        //Take the first 2 characters of string 2 and combine the 4 chars into a dedicated array called
        // charArray , print CharArray
      // String substring1 = string1.substring(0, 2);
      // String substring2 = string2.substring(10, 12);




    }
}
