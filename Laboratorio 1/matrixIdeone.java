/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 *
 * @author user
 */
 class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t = 0;
        Scanner sc = new Scanner(System.in);
        while (t<=5) {
	t+=1;
            
            int T = sc.nextInt();
            int[][] M = new int[T][T];
            int[][] N = new int[T][T];
            int[][] R = new int[T][T];

            for (int i = 0; i < T; i++) {
                for (int j = 0; j < T; j++) {
                    M[i][j] = 1;
                    N[i][j] = 2;
                }
            }
            
            double startTime = System.nanoTime();
                R=mult(M, N);            
            double estimatedTime = (System.nanoTime() - startTime)/1000000000;
            System.out.println("Tamaño "+ T+" Tiempo "+ estimatedTime+"s");
            
        }

    }

    public static int[][] mult(int[][] A, int[][] B) {
        int[][] C = new int[A.length][A.length];

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                for (int k = 0; k < B.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                
            }
            
        }

        return C;

    }

}
