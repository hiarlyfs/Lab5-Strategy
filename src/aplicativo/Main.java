package aplicativo;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int opcao = -1;
        Aplicativo aplicativo = new Aplicativo();

        while (opcao != 0) {
            System.out.println("Escolha um meio de transporte: ");
            System.out.println("1 - Pedestre");
            System.out.println("2 - Carro");
            System.out.println("3 - Onibus");
            System.out.println("4 - Metro");
            System.out.println("0 - Terminar");
            Scanner in = new Scanner( System.in );
            opcao = in.nextInt();

            if (opcao != 0) {
                mudarMeioTransporte(opcao, aplicativo);
            }
        }
    }

    private static void mudarMeioTransporte(int opcao, Aplicativo aplicativo) {
        try {
            aplicativo.alterarMeioTransporte(opcao);
        } catch (IllegalAccessException e) {
            System.out.println("Opção inválida");
        }
    }

}
