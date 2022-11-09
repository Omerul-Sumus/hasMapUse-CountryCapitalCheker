package exampleMapUse;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class CapitalChecker {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease Enter A Country: ");
        String country = scanner.nextLine().toLowerCase(Locale.ROOT);

        String capital = CountriesWithCapitals.findCapital(country);

        if (capital != null){
            System.out.println("Capital of " + country.toUpperCase(Locale.ROOT) + " is " + capital.toUpperCase(Locale.ROOT));
        }else{
            System.out.println("Country of " + country + " does not exist!!");
        }




    }


}
