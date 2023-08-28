package br.com.sistemadefilmes.model;

import java.time.LocalDate;
import java.util.List;

public class Diretor extends Pessoa {
    private String departamento;
    private String projetosGerenciados;
    private String endereco;
    private int quantidadeDeFilmesDirigitos;

    public String getDepartamento() {return departamento;}

    public void setDepartamento(String departamento) {this.departamento = departamento;}

    public String getProjetosGerenciados() {return projetosGerenciados;}

    public void setProjetosGerenciados(String projetosGerenciados) {this.projetosGerenciados = projetosGerenciados;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public int getQuantidadeDeFilmesDirigitos() {return quantidadeDeFilmesDirigitos;}

    public void setQuantidadeDeFilmesDirigitos(int quantidadeDeFilmesDirigitos) {this.quantidadeDeFilmesDirigitos = quantidadeDeFilmesDirigitos;}

    public String toString() {
        return "Diretor{" +
                "primeiroNome='" + getPrimeiroNome() + '\'' +
                ", segundoNome='" + getSegundoNome() + '\'' +
                ", departamento='" + departamento + '\'' +
                ", projetosGerenciados='" + projetosGerenciados + '\'' +
                ", endereco='" + endereco + '\'' +
                ", quantidadeDeFilmesDirigitos=" + quantidadeDeFilmesDirigitos +
                '}';
    }

    private List<Filme> filmesDirigidos;

    @Override
    public void apresentar() {
        System.out.println("Sou o diretor " + getPrimeiroNome() + " " + getSegundoNome());
    }

}
