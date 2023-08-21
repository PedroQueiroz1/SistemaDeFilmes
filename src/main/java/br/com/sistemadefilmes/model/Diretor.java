package br.com.sistemadefilmes.model;

// TODO implementar atributos
/*
 LEMBRANDO QUE A CLASSE DIRETOR JÁ TEM "primeiroNome" e "segundoNome",
 porque está puxando da classe abstrata: 'Pessoa'.
 */
public class Diretor extends Pessoa {

    @Override
    public void apresentar() {
        System.out.println("Sou o diretor: " + getPrimeiroNome() + " " + getSegundoNome());
    }

}
