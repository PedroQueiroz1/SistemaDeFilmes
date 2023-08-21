package br.com.sistemadefilmes.model;
import java.time.LocalDate;
import java.util.List;

public class Filme {
    private String nome;
    private LocalDate dataDeLancamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores;

    public Filme(String nome, LocalDate dataDeLancamento, String descricao, Diretor diretor, List<Ator> atores) {
        this.nome = nome;
        this.dataDeLancamento = dataDeLancamento;
        this.descricao = descricao;
        this.diretor = diretor;
        this.atores = atores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }


    // TODO remover toString() e adicionar StringBuilder no lugar
    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", dataDeLancamento=" + dataDeLancamento +
                ", descricao='" + descricao + '\'' +
                ", diretor=" + diretor +
                ", atores=" + atores +
                '}';
    }
}