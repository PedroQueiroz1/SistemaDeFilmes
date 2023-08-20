package br.com.sistemadefilmes.service;
import java.util.ArrayList;
// Implementar métodos e mudar se necessário o tipo de retorno.
public class FilmeService {
    private ArrayList<Filme> filmes;
    public FilmeService() {
        filmes = new ArrayList<Filme>();

    public void cadastrarFilme(Filme filme){
            if (filmes.contains(filme)) {
                System.out.println("O filme já está cadastrado.");
                return false;
            }
            filmes.add(filme);
            System.out.println("Filme cadastrado com sucesso!");
            return true;
        }

    public void buscarFilme(){}

    /*
    Sugestão:
    public void adicionarDiretor(){}

    public void adicionarAtor(){}
     */

}
