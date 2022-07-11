public class Test6 {
    public static void main(String[] args) {
        String row = " ";
        piramida(row);
    }
    public static void piramida(String row) {

        for (int i = 0; i < 5; i++) {

            row = row + "5";
            System.out.println(row);
        }
    }


}
