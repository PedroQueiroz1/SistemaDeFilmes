package br.com.sistemadefilmes.service;

import br.com.sistemadefilmes.model.Filme;
import br.com.sistemadefilmes.repository.FilmeRepository;

import java.util.ArrayList;
import java.util.List;

public class FilmeService {

    private List<Filme> listaFilmes = new ArrayList<>();

    private final FilmeRepository filmeRepository = new FilmeRepository() {
        @Override
        public void buscarFilmePorNome(String nome) {
            for (Filme filme : listaFilmes) {
                if (filme.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(filme.getNome());
                }
            }
        }

        @Override
        public void save(Filme filme) {
            listaFilmes.add(filme);
        }
    };


    public void cadastrarFilme(Filme filme) {
        if (filme.getAtores().isEmpty() || filme.getDiretor() == null) {
            System.out.println("Não é possível cadastrar o filme, pois o ator ou o diretor não existem.");
            System.out.println("Favor, cadastrar um diretor e pelo menos um ator antes de criar um novo filme.");
        } else {
            filmeRepository.save(filme);
            System.out.println("O filme " + filme.getNome() + " foi cadastrado com sucesso!");
        }
    }

    public void buscarFilmePorNome(String nome) {
        filmeRepository.buscarFilmePorNome(nome);
    }
}

