public class veriTurleriVeOperatorler {
    public static void main(String[] args){

        //TEMEL İŞLEMLER

        //aritmetik operatörlerin kullanımı
        int a=12, b=5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("***********************");

        //atama opertaörlerinin kullanımı
        int i = 4;
        int var ;
        var = i;
        System.out.println("var :" + var);
        var += i;
        System.out.println("var :" + var);
        var *= i;
        System.out.println("var :" + var);
        System.out.println("***********************");


        //ilişkisel operatörler
        int x = 7, y = 11;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println("***********************");


        //mantıksal operatörler
        System.out.println((5 > 3) && (8 > 5));
        System.out.println((5 > 3) && (8 < 3));
        System.out.println(((5 < 3)) || (8 > 5));
        System.out.println((5 < 3) || (8 < 5));
        System.out.println((5 < 3) || (8 < 5));
        System.out.println(!(5 == 3));
        System.out.println(!(5 > 3));
        System.out.println("***********************");

        //arttırma azaltma operatörleri
        int k = 12, m = 12;
        int sonuc1, sonuc2;
        sonuc1 = ++k;
        System.out.println("k = " + sonuc1);
        sonuc2 = --m;
        System.out.println("m = " + sonuc2);
        System.out.println("***********************");

        int februaryDays = 29;
        String result;
        // ternary operator
        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);
        System.out.println("***********************");

    }

}
