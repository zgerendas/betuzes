package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Helló fut az első!");
        Set <String> s = new HashSet<>();
        s.add("cs");
        s.add("dz");
        s.add("dzs");
        s.add("gy");
        s.add("ly");
        s.add("ny");
        s.add("sz");
        s.add("ty");
        s.add("zs");
        String szoveg="Álmos csiga szalad az úton. Szőke ciklon úsz";
        String dupla="";
        for (int i = 0; i < szoveg.length(); i++) {
            if (i<szoveg.length()-1) {
                dupla = String.valueOf(szoveg.charAt(i)) + szoveg.charAt(i + 1);
                if (s.contains(dupla.toLowerCase())) {
                    System.out.print("*"+dupla+"*");
                    i++;
                } else
                    System.out.print(szoveg.charAt(i) + "-");
            }
        }

        System.out.println("haho   ");
    }
}

