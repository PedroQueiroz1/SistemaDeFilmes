package br.com.sistemadefilmes.service;

import br.com.sistemadefilmes.model.Ator;

import java.util.ArrayList;
import java.util.List;

public class AtorService {

    private List<Ator> listaAtores = new ArrayList<>();

    public void cadastrarAtor(Ator ator){
        listaAtores.add(ator);
        System.out.println("O ator " + ator.getPrimeiroNome() + " "
                + ator.getSegundoNome() + " foi cadastrado com sucesso!");
    }

}
