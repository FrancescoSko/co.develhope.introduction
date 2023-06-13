package co.develhope.introduction;

public class WhileLoop {
    public static void main(String[] args) {

        int botHolding = 10000;
        int botSellingForDayPounds = 1000;
        int dayCounter = 0;

        for (int i = botSellingForDayPounds; i <= botHolding ; i += botSellingForDayPounds) {
            int botRemaining = botHolding - i;
            double  exchangeRatePoundsToEuros = 0;
            while (exchangeRatePoundsToEuros < 1.15) {
                exchangeRatePoundsToEuros = 1 + (Math.random() * 0.2);
                dayCounter++;
                System.out.println("The bot can't change the pounds because the exchange rate is too low!");
                System.out.println("Today is the day: " + dayCounter);
            }
            System.out.println("The bot is selling " + botSellingForDayPounds + " pounds for day, is the day number: "
                    + dayCounter);
               System.out.println(" The amount of last pounds is : " + botRemaining);
        }
                 System.out.println("The bot needed " + dayCounter + " days to sell all the pounds");
    }
}
