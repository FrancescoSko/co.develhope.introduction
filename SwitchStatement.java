package co.develhope.introduction;

public class SwitchStatement {
    public static void main (String [] args){
        int number = 17;

       if (number >=1 && number <=10){
           String numberName = "";
           switch(number)   {
           case 1:
             numberName = "One";
           break;
           case 2:
             numberName = "Two";
           break;
           case 3:
             numberName = "Three";
           break;
           case 4:
             numberName = "Four";
           break;
           case 5:
             numberName = "Five";
           break;
           case 6:
             numberName = "Six";
           break;
           case 7:
             numberName = "Seven";
           case 8:
             numberName = "Eight";
           break;
           case 9:
             numberName = "Nine" ;
           break;
           case 10:
             numberName = "Ten";
           break;   }

           System.out.println("Your number name is: " + numberName);
    }      else {
           System.out.println("Cannot give you the name please enter a value from 1 to 10");
       }
    }
}
