package org.example;

public class OperacionesMatematicas {//clase principal
    public static int suma(int a, int b){
        return a + b;
    }//Suma
    public static int resta(int a, int b){
        return a - b;
    }//Resta
    public static int recorrido(int n){
        int res = 0;
        for (int i=1; i<=n; i++){
            res = res + i;
        }
        return res;
    }//Resta
}