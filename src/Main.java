import Laba1.Laba1;
import Laba2.Laba2;
import Laba4.AnalogClock;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Лабораторная 1");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите текст: ");
//        Laba1.var8(sc.nextLine());

//        System.out.println("-----------------------");
//        System.out.println("Лабораторная 2");
//        Laba2.var11();

//        System.out.println("-----------------------");
//        System.out.println("Лабораторная 3");
//        Laba3.Laba3.var7();

        // Лабораторная 4
        SwingUtilities.invokeLater(() -> new AnalogClock());

    }
}