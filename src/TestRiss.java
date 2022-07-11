import java.util.Scanner;

public class TestRiss {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("введите число");
        Integer l=n.nextInt();


        String row = "";
        piramida(row, l);
    }

    public static void piramida(String row,int l) {


        for (int i = 0; i < l; i++) {

            row = row + "*";

        }
        System.out.print(row);
    }
}
