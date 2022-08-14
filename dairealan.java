import java.util.Scanner;

public class dairealan {
    static double pi=3.14;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("dairenin yarıçapını girin");
        int r =scanner.nextInt();
        System.out.print("dairenin merkez ölçüsü değerini girin");
        int a =scanner.nextInt();
        double alan=(pi*(r*r)*a)/360;
        System.out.print("dairenin alanı= "+alan);


    }
}
