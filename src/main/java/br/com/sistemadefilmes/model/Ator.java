package br.com.sistemadefilmes.model;

// TODO implementar atributos
/*
 LEMBRANDO QUE A CLASSE ATOR JÁ TEM "primeiroNome" e "segundoNome",
 porque está puxando da classe abstrata: 'Pessoa'.
 */
public class Ator extends Pessoa {

    @Override
    public void apresentar() {
        System.out.println("Sou o ator: " + getPrimeiroNome() + " " + getSegundoNome());
    }

}
