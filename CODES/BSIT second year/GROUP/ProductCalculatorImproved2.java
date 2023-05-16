import java.text.NumberFormat;
import java.util.*;

public class ProductCalculatorImproved2 {

    final static Scanner scanner = new Scanner(System.in);
    final static Locale philippinePeso = new Locale("en", "PH");
    final static NumberFormat formatter = NumberFormat.getCurrencyInstance(philippinePeso);

    public static void main (String [] args) {

        int arraySize = 9999;
        String[] productName = new String[arraySize];
        String[] productCode = new String[arraySize];
        String[] productDescription = new String[arraySize];
        double[] unitPrice = new double[arraySize];
        int[] productQuantity = new int[arraySize];

        userInput(productName, productCode, productDescription, unitPrice, productQuantity, arraySize);

    }

    public static void userInput(String[] productName, String[] productCode, String[] productDescription, double[] unitPrice, int[] productQuantity, int arraySize) {

        short choice = 0;
        short searchChoice = 0;
        int container = 0;

        boolean validInput = false;
        while(!validInput) {

            try {
                do {
                    System.out.println("\n[ Choice (1) Add Item ]");
                    System.out.println("[ Choice (2) Display All Data ]");
                    System.out.println("[ Choice (3) Clear Items ]");
                    System.out.println("[ Choice (4) Search Item Data ]");
                    System.out.println("[ Choice (5) Sort Items]");
                    System.out.println("[ Choice (0) Exit ]\n");
                    System.out.print("Input here: ");
                    choice = scanner.nextShort();
                    scanner.nextLine();

                    System.out.println();

                    if (choice == 1) {
                        container = data(productName, productCode, productDescription, unitPrice, productQuantity, container);
                        System.out.println();
                    } else if (choice == 2) {
                        display(productName, productCode, productDescription, unitPrice, productQuantity, container);
                        System.out.println();
                    } else if (choice == 3) {
                        while (true) {
                            System.out.println("Enter (Y) to confirm\nEnter (N) to cancel");
                            System.out.print("Select: ");
                            String confirmation = scanner.nextLine().trim().toUpperCase();
                            if (confirmation.equals("Y")) {
                                System.out.println("Items Cleared...");
                                Arrays.fill(productName, productName[0]);
                                Arrays.fill(productCode, productCode[0]);
                                Arrays.fill(productDescription, productDescription[0]);
                                Arrays.fill(productQuantity, productQuantity[0]);
                                Arrays.fill(unitPrice, unitPrice[0]);
                                container = 0;
                                break;
                            } else if (confirmation.equals("N")) {
                                System.out.println("Canceled...");
                                break;
                            }
                        }

                    } else if (choice == 4) {

                        System.out.println("Select (1) to search Product Name\nSelect (2) to search for Product Code\nSelect (3) to search for Product Description");
                        System.out.print("Select: ");
                        searchChoice = scanner.nextShort();
                        scanner.nextLine();

                        searchItemStrings(productName,productCode,productDescription,unitPrice,productQuantity, searchChoice);

                    } else if (choice == 5) {
                        System.out.println("Select (1) to sort alphabet order\nSelect (2) to sort by product code\nSelect (3) to sort by item description\nSelect (4) to sort prices in ascending form\nSelect (5) to sort prices in descending form");
                        System.out.print("Select: ");
                        searchChoice = scanner.nextShort();
                        scanner.nextLine();

                        sort(productName,productCode,productDescription,productQuantity,unitPrice,container,searchChoice);

                    } else if (choice == 0) {
                        System.out.println("Program Terminated...");
                    }

                } while (choice != 0);

                validInput = true;

            } catch (InputMismatchException e) {
                scanner.next();
            }
        }
    }

    public static void display (String[] productName, String[] productCode, String[] productDescription, double[] unitPrice, int[] productQuantity, int counter) {

        double overallTotalPrice = 0;
        int overallTotalQuantity = 0;

        System.out.println(String.format("\n%-10s", "-------") + String.format("%-20s", "------------") + String.format("%-20s", "------------") + String.format("%-60s", "------------------------------------------------") + String.format("%-15s", "--------") + String.format("%10s", "----------") + String.format("%16s", "-----------"));
        System.out.println(String.format("%-10s", "ITEM #") +String.format("%-20s", "PRODUCT NAME") + String.format("%-20s", "PRODUCT CODE") + String.format("%-60s", "               PRODUCT DESCRIPTION              ") + String.format("%-15s", "QUANTITY") + String.format("%10s", "ITEM PRICE") + String.format("%16s", "TOTAL PRICE"));
        System.out.println(String.format("%-10s", "-------") + String.format("%-20s", "------------") + String.format("%-20s", "------------") + String.format("%-60s", "------------------------------------------------") + String.format("%-15s", "--------") + String.format("%10s", "----------") + String.format("%16s", "-----------"));


        for (int i = 0; i < counter; i++){

            System.out.println(String.format("%-10s", (i+1)) + String.format("%-20s", productName[i]) + String.format("%-20s", productCode[i]) + String.format("%-60s", productDescription[i]) + String.format("%-15s", productQuantity[i]) + String.format("%10s", formatter.format(unitPrice[i])) + String.format("%16s", formatter.format(compute(productQuantity[i], unitPrice[i]))));

            overallTotalPrice += compute(productQuantity[i], unitPrice[i]);
            overallTotalQuantity += productQuantity[i];
        }

        System.out.println(String.format("%135s", "---------------------") + String.format("%16s", "--------------"));
        System.out.println(String.format("%137s","OVERALL TOTAL ITEMS: ") + overallTotalQuantity);
        System.out.println(String.format("%137s","OVERALL TOTAL PRICE: ") + formatter.format(overallTotalPrice));

    }

    public static int data(String[] productName, String[] productCode, String[] productDescription, double[] unitPrice, int[] productQuantity, int counter) {

        boolean validInput = false;

        System.out.print("Enter Product Name #"+(counter+1)+": ");
        productName[counter] = scanner.nextLine().trim().toUpperCase();
        while (true) {
            if (checkDuplicate(productName, productName[counter], counter) || Objects.equals(productName[counter], "") || Objects.equals(productCode[counter], "")) {
                System.out.println("Product Name already used or blank...");
                productName[counter] = "";
                System.out.print("Enter Product Name #"+(counter+1)+": ");
                productName[counter] = scanner.nextLine().trim().toUpperCase();
            } else {
                break;
            }
        }
        System.out.print("Enter Product Code of "+productName[counter]+": ");
        productCode[counter] = scanner.nextLine().trim().toUpperCase();
        while (true) {
            if (checkDuplicate(productCode, productCode[counter], counter) || Objects.equals(productName[counter], "") || Objects.equals(productCode[counter], "")) {
                System.out.println("Product Code already used or blank...");
                productCode[counter] = "";
                System.out.print("Enter Product Code of "+productCode[counter]+": ");
                productCode[counter] = scanner.nextLine().trim().toUpperCase();
            } else {
                break;
            }
        }
        System.out.print("Enter Product Description of "+productName[counter]+": ");
        productDescription[counter] = scanner.nextLine().trim().toUpperCase();
        while(!validInput) {
            try {
                System.out.print("Enter Product Unit Price of "+productName[counter]+": ");
                unitPrice[counter] = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                scanner.next();
            }
        }
        validInput = false;
        while(!validInput) {
            try {
                System.out.print("Enter Product Quantity of "+productName[counter]+": ");
                productQuantity[counter] = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                scanner.next();
            }
        }
        counter++;
        return counter;
    }

    public static void searchItemStrings(String[] productName, String[] productCode, String[] productDescription, double[] unitPrice, int[] productQuantity, int searchChoice) {

        boolean correction = false;

        if (searchChoice == 1){

            System.out.print("Product Name to search: ");
            String search = scanner.nextLine().trim().toUpperCase();

            System.out.print("\nRESULTS: ");

            for (int i = 0; i < productName.length; i++) {

                if (Objects.equals(productName[i], search)) {

                    correction = true;

                    ui(i, productName, productCode, productDescription, productQuantity, unitPrice);

                }
            }
            if (!correction) {
                System.out.println("Product Name does not exist...");
            }

        } else if (searchChoice == 2){

            System.out.print("Product Code to search: ");
            String search = scanner.nextLine().trim().toUpperCase();

            System.out.print("\nRESULTS: ");

            for (int i = 0; i < productCode.length; i++) {

                if (Objects.equals(productCode[i], search)) {

                    correction = true;

                    ui(i, productName, productCode, productDescription, productQuantity, unitPrice);

                }
            }
            if (!correction) {
                System.out.println("Product Code does not exist...");
            }
        } else if (searchChoice == 3){

            System.out.print("Product Description to search: ");
            String search = scanner.nextLine().trim().toUpperCase();

            System.out.print("\nRESULTS: ");

            for (int i = 0; i < productDescription.length; i++) {

                if (Objects.equals(productDescription[i], search)) {

                    correction = true;

                    ui(i, productName, productCode, productDescription, productQuantity, unitPrice);
                }
            }
            if (!correction) {
                System.out.println("Product Description does not exist...");
            }
        } else {
            System.out.println("Unknown Selection...");
        }
    }
    
    public static void sort(String[] productName, String[] productCode, String[] productDescription, int[] productQuantity, double[] unitPrice, int counter, short userChoice) {

        int i;
        int smlC;
        int j;
        int g;
        double tempUnitPrice;
        String temp;
        int smC;

        if (userChoice == 1) {
            for (i = 0; i < counter; i++){
                for (j = i+1; j< counter; j++){
                    if(productName[i].compareTo(productName[j]) > 0){
                        smC = j;
                        temp = productName[i];
                        productName[i]=productName[j];
                        productName[j]=temp;

                        String tempProductCode = productCode[smC];
                        productCode[smC] = productCode[i];
                        productCode[i] = tempProductCode;

                        String tempProductDescription = productDescription[smC];
                        productDescription[smC] = productDescription[i];
                        productDescription[i] = tempProductDescription;

                        g = productQuantity[smC];
                        productQuantity[smC] = productQuantity[i];
                        productQuantity[i] = g;

                        tempUnitPrice = unitPrice[smC];
                        unitPrice[smC] = unitPrice[i];
                        unitPrice[i] = tempUnitPrice;

                    }
                }
            }
            System.out.println("\nList sorted alphabetically...");
        } else if (userChoice == 2) {
            for (i = 0; i < counter; i++){
                for (j = i+1; j< counter; j++){
                    if(productCode[i].compareTo(productCode[j]) > 0){
                        smC = j;
                        temp = productCode[i];
                        productCode[i]=productCode[j];
                        productCode[j]=temp;

                        String tempProductName = productName[smC];
                        productName[smC] = productCode[i];
                        productName[i] = tempProductName;

                        String tempProductDescription = productDescription[smC];
                        productDescription[smC] = productDescription[i];
                        productDescription[i] = tempProductDescription;

                        g = productQuantity[smC];
                        productQuantity[smC] = productQuantity[i];
                        productQuantity[i] = g;

                        tempUnitPrice = unitPrice[smC];
                        unitPrice[smC] = unitPrice[i];
                        unitPrice[i] = tempUnitPrice;

                    }
                }
            }
            System.out.println("\nList sorted by product code...");
        } else if (userChoice == 3) {
            for (i = 0; i < counter; i++){
                for (j = i+1; j< counter; j++){
                    if(productDescription[i].compareTo(productDescription[j]) > 0){
                        smC = j;
                        temp = productDescription[i];
                        productDescription[i]=productDescription[j];
                        productDescription[j]=temp;

                        String tempProductCode = productCode[smC];
                        productCode[smC] = productCode[i];
                        productCode[i] = tempProductCode;

                        String tempProductName = productName[smC];
                        productName[smC] = productName[i];
                        productName[i] = tempProductName;

                        g = productQuantity[smC];
                        productQuantity[smC] = productQuantity[i];
                        productQuantity[i] = g;

                        tempUnitPrice = unitPrice[smC];
                        unitPrice[smC] = unitPrice[i];
                        unitPrice[i] = tempUnitPrice;

                    }
                }
            }
            System.out.println("\nList sorted by product description...");
        } else if (userChoice == 4) {
            for (i = 0; i < counter; i++) {
                smlC = i;
                for (j = i + 1; j < counter; j++ ){
                    if (unitPrice[smlC] > unitPrice[j]) {
                        smlC = j;

                        String tempProductName = productName[smlC];
                        productName[smlC] = productName[i];
                        productName[i] = tempProductName;

                        String tempProductCode = productCode[smlC];
                        productCode[smlC] = productCode[i];
                        productCode[i] = tempProductCode;

                        String tempProductDescription = productDescription[smlC];
                        productDescription[smlC] = productDescription[i];
                        productDescription[i] = tempProductDescription;

                        tempUnitPrice = unitPrice[smlC];
                        unitPrice[smlC] = unitPrice[i];
                        unitPrice[i] = tempUnitPrice;

                        g = productQuantity[smlC];
                        productQuantity[smlC] = productQuantity[i];
                        productQuantity[i] = g;
                    }
                }
            }
            System.out.println("\nPrice Sorted in ascending form...");
        } else if (userChoice == 5) {
            for (i = 0; i < counter; i++) {
                smlC = i;
                for (j = i + 1; j < counter; j++ ){
                    if (unitPrice[j] > unitPrice[smlC]) {
                        smlC = j;

                        String tempProductName = productName[smlC];
                        productName[smlC] = productName[i];
                        productName[i] = tempProductName;

                        String tempProductCode = productCode[smlC];
                        productCode[smlC] = productCode[i];
                        productCode[i] = tempProductCode;

                        String tempProductDescription = productDescription[smlC];
                        productDescription[smlC] = productDescription[i];
                        productDescription[i] = tempProductDescription;

                        tempUnitPrice = unitPrice[smlC];
                        unitPrice[smlC] = unitPrice[i];
                        unitPrice[i] = tempUnitPrice;

                        g = productQuantity[smlC];
                        productQuantity[smlC] = productQuantity[i];
                        productQuantity[i] = g;
                    }
                }
            }
            System.out.println("\nPrice Sorted in descending form...");
        } else {
            System.out.println("\nSorting unsuccessful...");

        }
    }

    public static void ui(int i, String[] productName, String[] productCode, String[] productDescription, int[] productQuantity, double[] unitPrice) {

        System.out.println(String.format("\n%-10s", "-------") + String.format("%-20s", "------------") + String.format("%-20s", "------------") + String.format("%-60s", "------------------------------------------------") + String.format("%-15s", "--------") + String.format("%10s", "----------") + String.format("%16s", "-----------"));
        System.out.println(String.format("%-10s", "ITEM #") +String.format("%-20s", "PRODUCT NAME") + String.format("%-20s", "PRODUCT CODE") + String.format("%-60s", "               PRODUCT DESCRIPTION              ") + String.format("%-15s", "QUANTITY") + String.format("%10s", "ITEM PRICE") + String.format("%16s", "TOTAL PRICE"));
        System.out.println(String.format("%-10s", "-------") + String.format("%-20s", "------------") + String.format("%-20s", "------------") + String.format("%-60s", "------------------------------------------------") + String.format("%-15s", "--------") + String.format("%10s", "----------") + String.format("%16s", "-----------"));

        System.out.println(String.format("%-10s", (i+1)) + String.format("%-20s", productName[i]) + String.format("%-20s", productCode[i]) + String.format("%-60s", productDescription[i]) + String.format("%-15s", productQuantity[i]) + String.format("%10s", formatter.format(unitPrice[i])) + String.format("%16s", formatter.format(compute(productQuantity[i], unitPrice[i]))));

    }

    public static double compute(int productQuantity, double unitPrice){

        return productQuantity * unitPrice;

    }

    public static boolean checkDuplicate (String [] product, String checking, int counter) {
        for (int i=0; i < counter; i++) {
            if (checking.equals(product[i]))
                return true;
        }
        return false;
    }
}
