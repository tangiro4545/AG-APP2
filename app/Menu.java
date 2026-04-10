package app;

import java.util.Scanner;

import models.Cachorro;
import util.Validacoes;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cachorro cachorro = new Cachorro("Teste nome","Teste cor", "Teste raça", 5 );
        int opcao;

        do {

            imprimirMenu();
            
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(cachorro.toString());
                    break;
                case 2:
                    alterarNome(cachorro, scanner);
                    break;
                case 3:
                    alterarCor(cachorro, scanner);
                    break;
                case 4:
                    alterarRaca(cachorro, scanner);
                    break;
                case 5:
                    alterarIdade(cachorro, scanner);
                    break;
                case 6:
                    cachorro.saudacao();
                    break;
                case 7:
                    cachorro = criarCachorro(scanner);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu de Acesso ===");
        System.out.println("1. Mostrar dados do cachorro");
        System.out.println("2. Alterar nome");
        System.out.println("3. Alterar cor");
        System.out.println("4. Alterar raça");
        System.out.println("5. Alterar idade");
        System.out.println("6. Mostrar saudação");
        System.out.println("7. Criar cachorro");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarNome(Cachorro cachorro, Scanner scanner) {
        System.out.print("Digite o novo nome: ");
        String novoNome = scanner.nextLine();
        if (Validacoes.nomeValido(novoNome)) {
            cachorro.setNome(novoNome);
            System.out.println("Nome alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroNome(novoNome));
        }
    }

    public static void alterarCor(Cachorro cachorro, Scanner scanner) {
        System.out.print("Digite a nova cor: ");
        String novaCor = scanner.nextLine();
        if (Validacoes.corValida(novaCor)) {
            cachorro.setCor(novaCor);
            System.out.println("Cor alterada com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroCor(novaCor));
        }
    }

    public static void alterarRaca(Cachorro cachorro, Scanner scanner) {
        System.out.print("Digite o nova raça: ");
        String novaRaca = scanner.nextLine();
        if (Validacoes.racaValida(novaRaca)) {
            cachorro.setRaca(novaRaca);
            System.out.println("Raça alterada com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroRaca(novaRaca));
        }
    }

    public static void alterarIdade(Cachorro cachorro, Scanner scanner) {
        System.out.print("Digite a nova idade: ");
        try {
            int novaIdade = Integer.parseInt(scanner.nextLine());
            if (Validacoes.idadeValida(novaIdade)) {
                cachorro.setIdade(novaIdade);
                System.out.println("Idade alterada com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroIdade(novaIdade));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido!");
        }
    }

    public static Cachorro criarCachorro(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Cor: ");
        String cor = scanner.nextLine();

        System.out.print("Raça: ");
        String raca = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        return new Cachorro(nome, cor, raca, idade);
    }

}