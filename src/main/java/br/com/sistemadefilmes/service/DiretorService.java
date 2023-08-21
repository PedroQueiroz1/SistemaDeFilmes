package br.com.sistemadefilmes.service;

import br.com.sistemadefilmes.model.Diretor;

import java.util.ArrayList;
import java.util.List;

public class DiretorService {

    private List<Diretor> listaDiretores = new ArrayList<>();

    public void cadastrarDiretor(Diretor diretor){
        listaDiretores.add(diretor);
        System.out.println("O diretor " + diretor.getPrimeiroNome() + " "
                + diretor.getSegundoNome() + " foi cadastrado com sucesso!");
    }

}
