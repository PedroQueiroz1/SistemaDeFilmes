package br.com.sistemadefilmes.model;

import java.time.LocalDate;
import java.util.List;

public class Diretor extends Pessoa {
    private List<Filme> filmesDirigidos;

    @Override
    public void apresentar() {
        System.out.println("Sou o diretor " + getPrimeiroNome() + " " + getSegundoNome());
    }

}
