package br.com.sistemadefilmes.model;

public abstract class Pessoa {

    private String primeiroNome;
    private String segundoNome;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    // TODO criar outro metodo que faça mais sentido para ter polimorfismo no trabalho.
    public abstract void apresentar();
}
