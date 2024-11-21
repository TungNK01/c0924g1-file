import java.io.*;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static final String FILE_NAME = "/Users/admin/Documents/CODEGYM/java-core/document/product.csv";
    public static final String COMMA = ",";
    public static void main(String[] args) {

        // File

        // Write Product
        /*Product product1 = new Product(1,"Samsung", 200);
        Product product2 = new Product(2,"Iphone", 300);
        Product product3 = new Product(3,"OPPO", 300);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        String line = null;
        for (Product product: productList) {
            line = product.getId()+COMMA+product.getName()+COMMA+product.getPrice();
            try {
                FileWriter fileWriter = new FileWriter(FILE_NAME, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }*/

        //Read Product
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                list.add(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


        // Write File
        /*try {
            FileWriter fileWriter = new FileWriter("/Users/admin/Documents/CODEGYM/java-core/document/c0924g1.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("bye");
            bufferedWriter.newLine();
            bufferedWriter.write("nhe");
            bufferedWriter.newLine();

            bufferedWriter.close();


        }catch (IOException e){
            e.printStackTrace();
        }*/

        //Read File
        /*List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("/Users/admin/Documents/CODEGYM/java-core/document/c0924g1.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                list.add(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }*/


        /*try {
            File file = new File("/Users/admin/Documents/CODEGYM/java-core/document/demo3.txt");
            String[] fileName = file.list();
            System.out.println(fileName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/

        //Exception
        /*int[] arr = {23, 12, 89, 65, 48, 99, 20};

        try {
            getElement(arr, 1, 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }*/
    }

    /*public static int getElement(int[] arr, int i, int d) {
        if (i < 0 || i >= arr.length)
            throw new ArrayIndexOutOfBoundsException("Exception 01: Array index out of bounds........");
        int e = arr[i];
        if (d == 0) throw new ArithmeticException("Exception 02: Division by zero........");
        int kq = e / d;

        return kq;
    }*/
}
