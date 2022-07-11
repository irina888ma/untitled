import java.util.Scanner;
// Вчемпионатепофутболукомандезавыигрышдается 3 очка, запроигрыш — 0, заничью — 1. Известноколичествоочков, полученныхкомандойзаигру. Определитьсловесныйрезультатигры (выигрыш, проигрышилиничья).
public class Test3 {
    public static void main(String args[]) {
       System.out.println("введите число очков");
        Scanner result = new Scanner(System.in);
        Integer nam = result.nextInt ();
        //System.out.println("Введено число: " + nam);
result.close();
switch (nam){
    case (0) :
        System.out.println("ПРОИГРАЛИ");
        break;
    case (1) :
        System.out.println("ничья");
        break;
    case (3) :
        System.out.println("выиграли");
        break;
    default:
        System.out.println("Такого значения нет");
        break;
}

    }
}