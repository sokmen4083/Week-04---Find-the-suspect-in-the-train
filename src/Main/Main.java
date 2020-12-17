package Main;

import Train.Train;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lütfen tahmininizi giriniz");
        Scanner girilenDeger = new Scanner(System.in);
        int tahmin1 = girilenDeger.nextInt(10);
        for (int kalanhak = Train.toplamHak; kalanhak >= 0;kalanhak--){
            if (Train.saklanilanYer == tahmin1){
                System.out.println("Tebrikler kacagin 1. tahmininizde hangi vagonda oldugunu bildiniz");
                System.out.println(" Puaniniz " + 100 );
                break;
            }else if (Train.saklanilanYer > tahmin1){
                System.out.println("Daha buyuk bir deger giriniz. Cünkü kacak arka vagonlarda");
            }else{
                System.out.println("Daha kucuk bir deger giriniz. Cünkü kacak on vagonlarda");
            }
            int tahmin2 = girilenDeger.nextInt(10);
            if (Train.saklanilanYer == tahmin2){
                System.out.println("Tebrikler kacagin 2. tahmininizde hangi vagonda oldugunu bildiniz");
                System.out.println(" Puaniniz " + 75);
                break;
            }else if (Train.saklanilanYer > tahmin2){
                System.out.println("Daha buyuk bir deger giriniz. Cünkü kacak arka vagonlarda");
            }else{
                System.out.println("Daha kucuk bir deger giriniz. Cünkü kacak on vagonlarda");
            }
            int tahmin3 = girilenDeger.nextInt(10);
            if (Train.saklanilanYer == tahmin3){
                System.out.println("Tebrikler kacagin 3. tahmininizde hangi vagonda oldugunu bildiniz");
                System.out.println(" Puaniniz " + 50);
                break;
            }else if (Train.saklanilanYer > tahmin3){
                System.out.println("Daha buyuk bir deger giriniz. Cünkü kacak arka vagonlarda");
            }else{
                System.out.println("Daha kucuk bir deger giriniz. Cünkü kacak on vagonlarda");
            }
            int tahmin4 = girilenDeger.nextInt(10);
            if (Train.saklanilanYer == tahmin4){
                System.out.println("Tebrikler kacagin 4. tahmininizde hangi vagonda oldugunu bildiniz");
                System.out.println(" Puaniniz " + 25);
                break;
            }else if (Train.saklanilanYer > tahmin4){
                System.out.println("Daha buyuk bir deger giriniz. Cünkü kacak arka vagonlarda");
            }else{
                System.out.println("Daha kucuk bir deger giriniz. Cünkü kacak on vagonlarda");
            }
            if (kalanhak ==1){
                System.out.println("Hakkiniz bitti kacagi bulamadiniz . Puaniniz " + 0);
            }
        }
    }
}
