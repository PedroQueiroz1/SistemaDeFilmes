package br.com.sistemadefilmes.service;

import br.com.sistemadefilmes.model.Diretor;

import java.util.ArrayList;
import java.util.List;

public class DiretorService implements Diretor {

    private List<Diretor> listaDiretores = new ArrayList<>();
    private final Diretor diretor - new Diretor(){
        @Override
        public void buscarDiretorPorNome (String nome){
            for (Diretor diretor : listaDiretores){
                if (diretor.getNome().equalsIgnoreCase(nome)){
                    System.out.println(diretor.getNome());
                }
            }

    }

    public void cadastrarDiretor(Diretor diretor){
        listaDiretores.add(diretor);
        System.out.println("O diretor " + diretor.getPrimeiroNome() + " "
                + diretor.getSegundoNome() + " foi cadastrado com sucesso!");
    }
    }
}
