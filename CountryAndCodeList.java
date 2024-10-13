import java.util.Scanner;

public class CountryAndCodeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int maximum_elements = 4;
        String[] country_names = new String[maximum_elements];
        String[] country_phone_call_codes = new String[maximum_elements];

        System.out.println("\nEnter " + maximum_elements + " countries names:");
        for (int i = 0; i < maximum_elements; i++) {
            System.out.print("Country " + (i + 1) + ": ");
            country_names[i] = scanner.nextLine();
        }

        System.out.println("\nEnter the respective phone codes for the above countries respectively:");
        for (int i = 0; i < maximum_elements; i++) {
            System.out.print("Phone call code for " + country_names[i] + ": ");
            country_phone_call_codes[i] = scanner.nextLine();
        }

        System.out.println("\nThe entered country names are:");
        for (String country : country_names) {
            System.out.println(country);
        }

        System.out.println("\nThe entered Phone Call Codes are:");
        for (String code : country_phone_call_codes) {
            System.out.println(code);
        }

        System.out.println("\nCountry and Code List:\n");
        System.out.println("|-----------------|------------|");
        System.out.printf("| %-15s | %-10s |\n", "Country", "Phone Code");
        System.out.println("|-----------------|------------|");

        for (int i = 0; i < maximum_elements; i++) {
            System.out.printf("| %-15s | %-10s |\n", country_names[i], country_phone_call_codes[i]);
        }
        System.out.println("|-----------------|------------|\n");

        scanner.close();
    }
}

