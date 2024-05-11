package teste;

import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int numero = 0;
        String agencia = "067-8";
        String nome = "Mario andrade ";
        double saldo = 237.48;

        System.out.print("Por favor, digite o numero da agencia!");
        numero = sc.nextInt();

        System.out.print("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero
                + " e seu saldo " + saldo + " ja esta disponivel para saque!");


        sc.close();
    }
}
