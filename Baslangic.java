package Giris;

import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        //Formül
        //Kilo (kg) / Boy(m) * Boy(m) */\
        int kilo;
        double boy;
        double indeks;
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen kilonuzu girin");
        kilo=input.nextInt();
        System.out.println("kilonuz:"+kilo);
        System.out.println("lutfen boyunuzu girin");
        boy=input.nextDouble();
        System.out.println("boyunuz:"+boy);
        indeks=((kilo)/(boy*boy));
        System.out.println("indeksiniz:"+indeks);






        }






    }

