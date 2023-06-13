package co.develhope.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main (String [] args){
        List<String> cityNames = Arrays.asList("Roma", "Napoli", "Torino");
        //cityNames.add("Salerno");
        //Non si puo' aggiungere in quanto l'array e' non modificabile.

        cityNames.set(1, "Tegucigalpa");

        System.out.println(cityNames);

        ArrayList<String>  kingsOfRome= new ArrayList<>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Lucio Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Lucio Tarquinio Superbo");

        System.out.println(kingsOfRome);



        String [] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
         System.out.println(Arrays.toString(kingsOfRomeArray));







    }
}
