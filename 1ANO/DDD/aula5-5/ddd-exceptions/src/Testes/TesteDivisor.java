package Testes;

import java.util.Scanner;

import Models.Divisor;

public class TesteDivisor {
    
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        Divisor d = new Divisor();
        
        System.out.println(d.getResultado());

        try {
            System.out.println("Digite um número: ");
            d.setNumero1(num.nextDouble());
            System.out.println("Digite um número: ");
            d.setNumero2(num.nextDouble());
            d.calcular();
            System.out.println(d.getResultado());
        } catch (ArithmeticException e) {
            System.out.println("Operação inválida, não existe divisão por zero!");
        } finally {
            System.out.println("Bloco finally");
        }
    }
}