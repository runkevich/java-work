import static java.lang.Math.sin;

public class Main {
    public static void main(String[] args) {
        String words = "Good morning";                              //задание №1
        int length_word = words.length();
        System.out.println(length_word);

        int l = length_word / 2;
        String word1 = words.substring(0, l);
        String word2 = words.substring(l, length_word);
        System.out.println(word1);
        System.out.println(word2);
        System.out.println("");

        int number = 3459;                                          //задание №2
        if (number % 10 == 7) {
            System.out.println("Последняя цифра - 7");
        } else System.out.println("Последняя цифра - не 7");
        System.out.println("");

        int a = 4;                                                  //задание №3
        int b = 2;
        int r = 5;
        double S1 = 2 * 3.14 * r;
        int S2 = a * b;
        if (S1 >= S2) {
            System.out.println("Круг полностью закрывает прямоугольник");
        } else System.out.println("Круг не закрывает прямоугольник");
        System.out.println("");

        int money = 291;                                             //задание №4
        switch (money % 10) {
            case 1:
                System.out.println(money + " рубль");
                break;
            case 2:
                System.out.println(money + " рубля");
                break;
            case 3:
                System.out.println(money + " рубля");
                break;
            case 4:
                System.out.println(money + " рубля");
                break;
            default:
                System.out.println(money + " рублей");
                break;
        }
        System.out.println("");

        String stroka = "Even#ing ?";                                   //задание №5
        String stroka1 = stroka.replace("?", "HELLO");
        String stroka2 = stroka1.replace("#", "");
        System.out.println(stroka2);
        System.out.println("");


        double t = 2;                                                    //задание №6
        double s = 3;

        double x = 2;
        double y1 = sin(Math.pow(x, t)) * sin(Math.pow(x, t));
        double y2 = y1 / (Math.pow((1 + Math.pow(x, s)), 1 / 2));
        System.out.println(y2);
    }
}
