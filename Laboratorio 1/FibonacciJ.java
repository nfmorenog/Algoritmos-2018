/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccij;

import static java.lang.Long.toUnsignedString;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author user
 */
public class FibonacciJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int n = 92; n < 94; n++) {
            System.out.println("fibonacci Long " + n + " es " + fiboLong(n));
        }

        for (int n = 48; n < 50; n++) {
            System.out.println("fibonacci Int " + n + " es " + fiboInt(n));
        }
        /*
        for (double n = 76; n < 80; n++) {
            System.out.println("fibonacci Double " + n + " es " + BigDecimal.valueOf(fiboDouble(n)).toBigInteger());
        }
        for (int n = 76; n < 80; n++) {
            System.out.println("fibonacci Float " + n + " es " + fiboFloat(n));
        }*/
    }

    public static int fiboInt(int n) {
        int i = 1;
        int j = 0;
        for (int k = 0; k < n; k++) {
            j = i + j;
            i = j - i;
        }

        return j;
    }

    public static double fiboDouble(double n) {
        double i = 1;
        double j = 0;
        for (double k = 0; k < n; k++) {
            j = i + j;
            i = j - i;
        }

        return j;
    }

    public static float fiboFloat(float n) {
        float i = 1;
        float j = 0;
        for (float k = 0; k < n; k++) {
            j = i + j;
            i = j - i;
        }

        return j;
    }

    public static long fiboLong(long n) {
        long i = 1;
        long j = 0;
        for (long k = 0; k < n; k++) {
            j = i + j;
            i = j - i;
        }

        return j;
    }

}
