package br.com.sistemadefilmes.model;
import java.time.LocalDate;

// Implementar atributos
public class Filme {
    private String nome;
    private String diretor;
    private LocalDate dataDeLancamento;
    private String descricao;

    public Filme(String nome, String diretor, LocalDate dataDeLancamento, String descricao) {
        this.nome = nome;
        this.diretor = diretor;
        this.dataDeLancamento = dataDeLancamento;
        this.descricao = descricao;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}