import java.util.Scanner;

public class minMaxOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 0, max = 0;
        System.out.println("Kaç sayı gireceksiniz : ");
        int tSayi = input.nextInt();
        for(int i = 1; i <= tSayi ; i++){
            System.out.println("sayı yazınız");
            int sayi = input.nextInt();
            if(i==1){
                min=sayi ;
                max=sayi;

            }else{
                if(sayi>max){
                    max=sayi;
                }
                if (sayi<min){
                    min=sayi;
                }

            }
        }
        System.out.println("En büyük sayı : "+max);
        System.out.println("En küçük sayı : "+min );
    }
}
