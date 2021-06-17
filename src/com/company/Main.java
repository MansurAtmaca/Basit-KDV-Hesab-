package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Basit KDV Hesabı yapan program.
        1000'den büyük değerlerin kdv oranı daha düşük.
         */
        
        Scanner input=new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz: ");
        int ucret=input.nextInt();
        if (ucret>0&&ucret<1000){
            System.out.println("KDV'siz Fiyat: "+ucret);
            double kdv=ucret*1.18;
            System.out.println("KDV'li Fiyat: "+kdv);
            System.out.println("KDV Tutarı: "+(kdv-ucret));

        }else if (ucret>1000){
            System.out.println("KDV'siz Fiyat: "+ucret);
            double kdv=ucret*1.08;
            System.out.println("KDV'li Fiyat: "+kdv);
            System.out.println("KDV Tutarı: "+(kdv-ucret));

        }
    }
}
