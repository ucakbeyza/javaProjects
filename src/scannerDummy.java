import java.util.Scanner;

public class scannerDummy {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int yas = scanner.nextInt();

        scanner.nextLine(); //Dummy //enter değerini alması için(ilk veri girildikten sonra enter a basılıyor)

        String isim = scanner.nextLine();

        System.out.println("Yaş..:" + yas);

        System.out.println("İsim..:" + isim);


    }
}
