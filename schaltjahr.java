package Attila;

import java.util.Scanner;

public class schaltjahr {


    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Jahreszahl ein:");
        int var2 = var1.nextInt();
        if (istSchaltjahr(var2)) {
            System.out.println("" + var2 + " ist ein Schaltjahr.");
        } else {
            System.out.println("" + var2 + " ist kein Schaltjahr.");
        }

    }

    public static boolean istSchaltjahr(int var0) {
        if (var0 % 4 != 0) {
            return false;
        } else if (var0 % 100 != 0) {
            return true;
        } else {
            return var0 % 400 == 0;
        }
    }
}
