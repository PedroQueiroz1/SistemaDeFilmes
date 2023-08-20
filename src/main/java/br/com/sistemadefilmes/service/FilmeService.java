package br.com.sistemadefilmes.service;

import java.util.ArrayList;

public class FilmeService {
    private ArrayList<Filme> filmes;

    public FilmeService() {
        filmes = new ArrayList<Filme>();

        public void cadastrarFilme (Filme filme){
            if (filmes.contains(filme)) {
                System.out.println("O filme já está cadastrado.");
                return false;
            }
            filmes.add(filme);
            System.out.println("Filme cadastrado com sucesso!");
            return true;
        }

        public void buscarFilme () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o nome do filme que deseja buscar:");
            String nome = scanner.nextLine();
            for (Filme filme : filmes) {
                if (filme.getNome().equals(nome)) {
                    System.out.println("Filme encontrado:");
                    System.out.println("Nome: " + filme.getNome());
                    System.out.println("Diretor: " + filme.getDiretor());
                    System.out.println("Data de Lançamento: " + filme.getDataDeLancamento());
                    scanner.close();
                    return;
                }
            }
            System.out.println("Filme não encontrado.");
            scanner.close();
        }
    }

    /*
    Implementações a serem feitas posteriormente:

    public void adicionarDiretor(){}

    public void adicionarAtor(){}
     */

}
