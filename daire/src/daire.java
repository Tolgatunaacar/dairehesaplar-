import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("R:");
        int r = input.nextInt();
        
        double pi = 3.14;
        double cevre = 2*pi*r;
        double alan = pi*r*r;

        System.out.println("Merkez açı girin:");
        double merkez_aci = input.nextDouble();
        double x = alan * (merkez_aci/360);

        System.out.println("Çevre:"+cevre);
        System.out.println("Alan:"+alan);
        System.out.println("Dilimin alanı:"+x);

    }
}
