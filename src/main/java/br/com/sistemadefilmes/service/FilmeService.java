package br.com.sistemadefilmes.service;

import br.com.sistemadefilmes.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class FilmeService {

    private List<Filme> listaFilmes = new ArrayList<>();

    public void cadastrarFilme(Filme filme) {
        if (filme.getAtor() == null || filme.getDiretor() == null) {
            System.out.println("Não é possível cadastrar o filme, pois o ator ou o diretor não existem.");
            System.out.println("Favor, cadastrar um ator e diretor antes de criar um novo filme.");
        } else {
            listaFilmes.add(filme);
            System.out.println("O filme " + filme.getNome() + " foi cadastrado com sucesso!");
            System.out.println("Info: \n" + filme.toString());
        }

    }

    public void buscarFilmePorNome(String nome) {
        for (Filme filme : listaFilmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Filme encontrado. \n Info: \n " + filme.toString());
            }
        }
        System.out.println("Nenhum filme encontrado com o nome " + nome);
    }

    }

