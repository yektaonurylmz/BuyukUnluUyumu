package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Kelime Giriniz : ");

        Scanner scn = new Scanner(System.in);
        String kelime = scn.next();

        buyukunlu(kelime);
    }
        public static void buyukunlu (String kelime) {
            String[] harf_ayir =new String[kelime.length()];
            for (int i = 0; i < kelime.length(); i++) {
                harf_ayir[i] = kelime.substring(i, i + 1);
            }
            int sayac1 = 0;
            int sayac2 = 0;
            String s ;
            String s1 ;
            String s2 ;
            String[] k_harfler = {"A", "a", "I", "ı", "O", "o", "U", "u"};       // Kalın harfler
            String[] i_harfler = {"E", "e", "İ", "i", "Ö", "ö", "Ü", "ü"};       // İnce Harfler

            for (String value : harf_ayir) {
                s = value;
                for (String item : k_harfler) {
                    s1 = item;
                    if (s.equals(s1)) {
                        sayac1++;
                    }
                }
                for (String item : i_harfler) {
                    s2 = item;
                    if (s.equals(s2)) {
                        sayac2++;
                    }
                }
            }
            if (sayac1 > 0 && sayac2 > 0) {
                System.out.println("Büyük Ünlü Uyumuna uymaz.");
            } else if (sayac1 > 0) System.out.println("Büyük Ünlü Uyumuna uyar.");
            else if (sayac2 > 0) System.out.println("Büyük Ünlü Uyumuna uyar.");
        }
    }

