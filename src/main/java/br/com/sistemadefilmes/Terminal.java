package br.com.sistemadefilmes;

import br.com.sistemadefilmes.model.Ator;
import br.com.sistemadefilmes.model.Diretor;
import br.com.sistemadefilmes.model.Filme;
import br.com.sistemadefilmes.service.FilmeService;

import java.util.Scanner;

public class Terminal
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        FilmeService filmeService = new FilmeService();

        int menuSelecionado;

        do {
            exibirMenuInicial();
            menuSelecionado = scanner.nextInt();

            switch (menuSelecionado) {
                case 1:
                    menuAtor(scanner);
                    break;
                case 2:
                    menuDiretor(scanner);
                    break;
                case 3:
                    menuFilme(scanner);
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
            }
        } while (menuSelecionado != 4);
    }

    public static void exibirMenuInicial() {
        System.out.println("Selecione uma opção:");
        System.out.println("1. Ir para a aba de Ator");
        System.out.println("2. Ir para a aba de Diretor");
        System.out.println("3. Ir para a aba de Filme");
        System.out.println("4. Encerrar o programa");
    }

    public static void menuAtor(Scanner scanner) {
        int opcao;
        do {
            System.out.println("Aba de Ator:");
            System.out.println("1. Listar Atores");
            System.out.println("2. Cadastrar Ator");
            System.out.println("3. Voltar para o menu anterior");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Chamar método para listar atores
                    break;
                case 2:
                    // Chamar método para cadastrar ator
                    break;
                case 3:
                    System.out.println("Voltando para o menu anterior...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
            }
        } while (opcao != 3);
    }

    public static void menuDiretor(Scanner scanner) {
        int opcao;
        do {
            System.out.println("Aba de Ator:");
            System.out.println("1. Listar Atores");
            System.out.println("2. Cadastrar Ator");
            System.out.println("3. Voltar para o menu anterior");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Chamar método para listar atores
                    break;
                case 2:
                    // Chamar método para cadastrar ator
                    break;
                case 3:
                    System.out.println("Voltando para o menu anterior...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
            }
        } while (opcao != 3);
    }

    public static void menuFilme(Scanner scanner, FilmeService filmeService) {
        int opcao;
        do {
            System.out.println("Aba de Filme:");
            System.out.println("1. Listar Filmes");
            System.out.println("2. Cadastrar Filme");
            System.out.println("3. Voltar para o menu anterior");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    listarFilmes(filme);
                    break;
                case 2:
                    cadastrarFilme(scanner, filme);
                    break;
                case 3:
                    System.out.println("Voltando para o menu anterior...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
            }
        } while (opcao != 3);
    }
}
