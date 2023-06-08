package co.develhope.introduction;

public class Booleanoperators {
    public static void main (String[] args){
        boolean statementA = 2 <= 2 && !true; //false
        boolean statementB = !false && 3 > 2;  //true
        boolean t = true;
        boolean f = false;
        boolean statementC = !(!t || f);  //true
        boolean statementD = 6 > 6 ^ !(true && true); //false


        if (statementA) {
            System.out.println("The statement A is true");
        } else System.out.println("The statement A is false");

        if (statementB){
            System.out.println("The statement B is true");
        } else System.out.println("The statement A is false");

        if (statementC){
            System.out.println("The statement C is true");
        } else System.out.println("The statement C is false");

        if (statementD){
            System.out.println("The statement D is true");
        } else System.out.println("The statement D is false");



        }
    }


