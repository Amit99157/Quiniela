package com.amit;

public class Main {

    public static void main(String[] args) {
        int numero;

        for(int i = 1; i<=9;i++) {
            numero = (int) (Math.random() * 3);
            if (numero == 0) {
                System.out.println("Partido " + i + ":         x");
            } else {
                System.out.println("Partido " + i + ":         " + numero);
            }
        }
        for(int i =10 ; i<=15;i++){
            numero = (int) (Math.random() * 3);
            if(numero == 0){
                System.out.println("Partido "+i+":        x");
            }else {
                System.out.println("Partido "+i+":        "+ numero);
            }
        }
    }
}
