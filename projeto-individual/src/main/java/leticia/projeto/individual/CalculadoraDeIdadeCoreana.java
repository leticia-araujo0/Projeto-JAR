package leticia.projeto.individual;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PC
 */
public class CalculadoraDeIdadeCoreana {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        for (int voltaMenu = 1; voltaMenu <= 4; voltaMenu++) {

            Integer anoAtual = 2023;

            System.out.println("---Bem vindo(a) à calculadora de idade coreana!---\n \n"
                    + "Escolha uma das opções a seguir: \n");

            System.out.println("1 - Diga qual a sua idade! ");
            System.out.println("2 - Calcular minha idade coreana! ");
            System.out.println("3 - Por que minha idade coreana é diferente?");
            System.out.println("4 - Encerrar a calculadora!");

            voltaMenu = leitor.nextInt();

            Integer diaNascimento;
            Integer mesNascimento;
            Integer anoNascimento;

            switch (voltaMenu) {
                case 1:
                    System.out.println("Digite o dia do seu nascimento:  ");
                    diaNascimento = leitor.nextInt();

                    System.out.println("Digite o mês  do seu nascimento: ");
                    mesNascimento = leitor.nextInt();

                    System.out.println("Digite o ano em que você nasceu: ");
                    anoNascimento = leitor.nextInt();

                    Integer calculoIdade = (anoAtual - anoNascimento);

                    if (mesNascimento <= 3) {
                        System.out.println(String.format("Idade internacional: %d ", calculoIdade - 1));
                    } else {
                        System.out.println(String.format("Idade internacional: %d ", calculoIdade));
                    }
                    break;

                case 2:
                    System.out.println("2 - Calcular minha idade coreana!");

                    System.out.println("Digite o dia do seu nascimento:  ");
                    diaNascimento = leitor.nextInt();

                    System.out.println("Digite o mês do seu nascimento: ");
                    mesNascimento = leitor.nextInt();

                    System.out.println("Digite o ano em que você nasceu: ");
                    anoNascimento = leitor.nextInt();

                    if (diaNascimento == 31 && mesNascimento == 12) {
                        System.out.println("Idade coreana: " + (anoAtual - anoNascimento + 2));

                    } else if (mesNascimento <= 2) {
                        System.out.println("Idade coreana:  " + (anoAtual - anoNascimento + 1));

                    } else {
                        System.out.println("Idade coreana: " + (anoAtual - anoNascimento));
                    }
                    break;

                case 3:
                    System.out.println("3 - Por que minha idade coreana é diferente? \n ");

                    System.out.println("Na Coreia do Sul, as pessoas já nascem com um ano de idade! Depois, passam\n"
                            + " a contar um ano a mais na idade no dia de Ano Novo. Então, se você nasceu\n"
                            + " no dia 1º de janeiro vai ter um ano até a próxima virada. Mas se você tiver nascido\n"
                            + " no dia 31 de dezembro, mesmo que você tenha literalmente um dia de vida, já fará\n"
                            + "dois anos na mesma noite, juntamente com o início do novo ano!\n");
                    break;

                case 4:
                    System.out.println("Fim!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente! \n");

                    do {
                        System.out.println("Digite um número equivalente a alguma das opções do menu: ");
                        voltaMenu = leitor.nextInt();
                    } while (voltaMenu > 4);

            }
        }
    }
}
