/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafindhostaddress;

import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author thinkpad
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaDomain = "";
        String nol = "00000000";
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama domain : ");
        namaDomain = sc.nextLine();

        try {
            InetAddress inet1 = InetAddress.getByName(namaDomain);

            String ip = inet1.getHostAddress();
            String oktet[] = ip.split("\\.");

            System.out.println("IPnya adalah " + ip);
            System.out.println("Binernya adalah : ");

            for (int i = 0; i < oktet.length; i++) {
                Integer desimal = Integer.valueOf(oktet[i]);
                String biner = Integer.toBinaryString(desimal);
                biner = nol.substring(biner.length()) + biner;
                if (i != oktet.length - 1) {
                    System.out.print(biner + ".");
                } else {
                    System.out.print(biner + "\n");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
