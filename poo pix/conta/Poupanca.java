package Projeto;

import java.util.Scanner;

public class Poupanca extends conta {
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
        int meses = a.nextInt();
        int limite = 24;
        if (quantia>valor || meses<limite)
        System.out.println("Saldo insuficiente ou meses insuficientes");
        else
        {
            valor-=quantia;
        }
        a.close();
    }
}

