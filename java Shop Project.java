import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Develop {
    public static void main(String[] args) throws Exception {
        while (true) {
            try {
                System.out.println("Please enter the count of Customer : or For Exit Click the '0' ");
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(System.in)
                );
                Integer CountCustomer = Integer.valueOf(reader.readLine());
                if (CountCustomer == 0) {
                    System.out.println("Have Nice Day!!");
                    break;
                }
                double bestOperationSumPrice = 0;
                String bestOperationName = "";
                double ShopSumPrice = 0;
                for (int operIndex = 0; operIndex < CountCustomer; operIndex++) {
                    System.out.println("Please enter your FullName :" + (operIndex + 1));
                    String FullName = reader.readLine();
                    System.out.println("Please enter " + FullName + " InvoicCount :");
                    Integer invoicCount = Integer.valueOf(reader.readLine());
                    double sumPrice = 0;
                    for (int invIndex = 0; invIndex < invoicCount; invIndex++) {
                        System.out.println("Please enter " + FullName + " Price of Invoic : " + (invIndex + 1));
                        Double priceOfInvoic = Double.parseDouble(reader.readLine());
                        sumPrice += priceOfInvoic;
                        ShopSumPrice += priceOfInvoic;
                    }
                    double Average = sumPrice / invoicCount;
                    System.out.printf("the Summary Price is : %f\n", sumPrice);
                    System.out.printf("the Average Price is : %f\n", Average);
                    if (sumPrice <= 5000000) {
                        System.out.println(FullName + " Low Level\n");
                    } else if (sumPrice >= 5000000 && sumPrice <= 10000000) {
                        System.out.println(FullName + " Middle Level\n");
                    } else if (sumPrice >= 10000000) {
                        System.out.println(FullName + " High Level\n");
                    }
                    if (sumPrice > bestOperationSumPrice) {
                        bestOperationSumPrice += sumPrice;
                        bestOperationName += FullName;
                    }
                    System.out.println("the Remains count : " + (CountCustomer - operIndex - 1));
                    System.out.printf("the ShopSumPrice is : %f \n", ShopSumPrice);
                    System.out.printf("the bestOperation is : %f \n" , bestOperationSumPrice , " with " + bestOperationName);
                }
            } catch (Exception e){
                System.out.println("Error!!");
            }
        }
    }
}