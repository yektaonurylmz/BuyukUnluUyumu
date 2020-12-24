package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BuyukUnluUyumu {

    public static void main(String[] args) {

        System.out.println("Kelime Giriniz : ");
        Scanner scn = new Scanner(System.in);
        String kelime = scn.next();

        buyukunlu(kelime);
    }
        public static void buyukunlu (String kelime) {

            String[] harf_ayir =kelime.split("");
            ArrayList<String> list = new ArrayList<>(Arrays.asList(harf_ayir));
            String[] k_harfler = {"A", "a", "I", "ı", "O", "o", "U", "u"};
            String[] i_harfler = {"E", "e", "İ", "i", "Ö", "ö", "Ü", "ü"};
            boolean kalinHarfKontrol = Arrays.stream(k_harfler).anyMatch(list::contains);
            boolean inceHarfKontrol = Arrays.stream(i_harfler).anyMatch(list::contains);
            if (kalinHarfKontrol && inceHarfKontrol){
                System.out.println("Buyuk Ünlü Uyumuna Uymaz");

            }else System.out.println("Buyuk Ünlü Uyumuna Uyar");
        }


    }

