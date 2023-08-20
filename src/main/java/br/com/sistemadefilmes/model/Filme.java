package br.com.sistemadefilmes.model;
import java.time.LocalDate;
// Implementar atributos
public class Filme {
    private String nome;
    private String diretor;
    private LocalDate dataDeLancamento;
    private String descricao;
}
public Filme (String nome, String diretor, LocalDate dataDeLancamento, String descricao){
    this.nome = nome;
    this.diretor = diretor;
    this.dataDeLancamento = dataDeLancamento;
    this.descricao = descricao;
}
