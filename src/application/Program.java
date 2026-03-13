package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.time.format.DateTimeFormatter.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) throws ParseException {

        List<Product> products = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.print("Enter the number of products: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i): ");
            String type = sc.next();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();


            if(type.equals("c")) {
                products.add(new Product(name, price));
            }

            else if (type.equals("i")){
                System.out.print("Customs fee: ");
                double customsfee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsfee));
                }

            else {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
               products.add(new UsedProduct(manufactureDate, name, price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");

        for (Product p : products){
            System.out.println(p.toString());
        }


        sc.close();
    }
}