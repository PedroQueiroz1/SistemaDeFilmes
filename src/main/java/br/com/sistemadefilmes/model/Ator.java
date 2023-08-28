package br.com.sistemadefilmes.model;

import java.util.List;

public class Ator extends Pessoa {

    private List<Filme> filmesParticipados;

    @Override
    public void apresentar() {
        System.out.println("Sou o ator: " + getPrimeiroNome() + " " + getSegundoNome());
    }

}
