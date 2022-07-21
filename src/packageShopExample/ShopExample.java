package packageShopExample;

import java.io.*;
import java.util.Scanner;


public class ShopExample {

    int supplyFinal = 0;
    int buyFinal = 0;
    int result = 0;


    public static void main(String[] args) throws IOException {

        ShopExample newObject = new ShopExample();
        newObject.methodGivesResult();
        newObject.writingToFile();
    }




    public void methodGivesResult() throws IOException {

        File exampleCsv = new File("ItemX.csv");
        Scanner scanner = new Scanner(exampleCsv);



        while (scanner.hasNextLine()) {

            String linesFromCsvFile = scanner.nextLine();
            String[] fieldsAfterSpliting = linesFromCsvFile.split(",");

            if (fieldsAfterSpliting[0].compareTo("supply") == 0) {
                int supply = Integer.parseInt(fieldsAfterSpliting[1]);
                supplyFinal += supply;
            } else {
                int buy = Integer.parseInt(fieldsAfterSpliting[1]);
                buyFinal += buy;
            }
        }

        scanner.close();
        result = supplyFinal - buyFinal;

    }



    public void writingToFile() throws IOException {

        FileWriter newCsv = new FileWriter("report.csv");


        newCsv.write("supply");
        newCsv.write(",");
        String supplyString = Integer.toString(supplyFinal);
        newCsv.write(supplyString);

        newCsv.write("\n");

        newCsv.write("buy");
        newCsv.write(",");
        String buyString = Integer.toString(buyFinal);
        newCsv.write(buyString);

        newCsv.write("\n");

        newCsv.write("result");
        newCsv.write(",");
        String resultString = Integer.toString(result);
        newCsv.write(resultString);


        newCsv.flush();
        newCsv.close();

    }
}