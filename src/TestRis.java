public class TestRis {
    public static void main(String[] args) {
        String row = "";
        piramida(row);
    }

    public static void piramida(String row) {

        for (int i = 0; i < 10; i++) {

            row = row + "*";

        }
        System.out.print(row);
    }
}
