package br.com.sistemadefilmes.model;

import java.time.LocalDate;
import java.util.List;

public interface Diretor extends Pessoa {
    private List<Filme> filmesDirigidos;


        void buscarDiretorPorNome(String nome);
    @Override
    public void apresentar() {
        System.out.println("Sou o diretor " + getPrimeiroNome() + " " + getSegundoNome());
    }

}
