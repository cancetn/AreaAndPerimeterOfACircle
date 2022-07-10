
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.
        //if else dongu kullanilmadan yapilmasi istenmektedir.

        int r;

        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.println("Pi degerini giriniz = ");

        r = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;


        System.out.println("Cevre degeri = "+alan);
        System.out.println("Alan degeri = "+cevre);

        int a;

        Scanner inp1 = new Scanner(System.in);

        System.out.println("Alfa/Merkez Aci degerini giriniz = ");

        a = inp1.nextInt();

        double merkezAci = (pi * (r * r ) * a )/360;

        System.out.println("Girilen merkez aci olculu dairenin alani = "+merkezAci);





    }
}
