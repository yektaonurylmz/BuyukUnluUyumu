package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BuyukUnluUyumu {

    public static void main(String[] args) {
        System.out.println("Kelime Giriniz : ");

        Scanner scn = new Scanner(System.in);
        String kelime = scn.next();

        buyukunlu(kelime);
    }
        public static void buyukunlu (String kelime) {
            int sayac1 = 0;
            int sayac2 = 0;
            String[] harf_ayir =kelime.split("");
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(harf_ayir));
            String[] k_harfler = {"A", "a", "I", "ı", "O", "o", "U", "u"};       // Kalın Harfler
            String[] i_harfler = {"E", "e", "İ", "i", "Ö", "ö", "Ü", "ü"};       // İnce  Harfler

            for (int i=0; i<k_harfler.length;i++){
                if (list.contains(k_harfler[i])){
                    sayac1++;
                }
                if (list.contains(i_harfler[i])){
                    sayac2++;
                }
            }

            if (sayac1 > 0 && sayac2 > 0) {
                System.out.println("Büyük Ünlü Uyumuna uymaz.");
            } else if (sayac1 > 0) System.out.println("Büyük Ünlü Uyumuna uyar.");
            else if (sayac2 > 0) System.out.println("Büyük Ünlü Uyumuna uyar.");

        }


    }

