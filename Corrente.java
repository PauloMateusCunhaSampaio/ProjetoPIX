package Projeto;

import java.util.Scanner;

public class Corrente extends conta {
    @Override
    public void depositar(double valor) {
        Scanner a = new Scanner(System.in);
        double quantia = a.nextDouble();
        valor+=quantia;
        a.close();
        
    }

    @Override
    public void sacar(double valor) {
        Scanner a = new Scanner(System.in);
        double quantia = a.nextDouble();
        if (quantia>valor)
        System.out.println("Saldo insuficiente");
        else{
            valor-=quantia;
        }
        a.close();
    }
}
