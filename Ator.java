import java.util.ArrayList;
import java.util.List;

public class Ator{
private String nome;
private int idade;
private List<Filmes> filmes;

public Ator(String nome, int idade){
this.nome = nome;
this.idade = idade;
this.filmes = new ArrayList<>();
}

public String getNome(){
    return nome; 
}
public void setNome(String nome){
    this.nome = nome;
}
public int getIdade(){
    return idade;
}
public void setIdade(int idade){
    this.idade = idade;
}
public List<Filmes> getFilmes(){
    return filmes;
}
public void setFilme(List<Filmes> filmes){
    this.filmes = filmes;
}
public void adicionarFilme(Filmes f) {
        filmes.add(f);
}

public void mostrarFilme() {

    System.out.println("Ator:" + nome);
    System.out.println("Idade:" + idade);
    System.out.println("Filmes de " + nome + ":");
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado para este ator.");
        } else {
            for (Filmes f : filmes) {
                System.out.println("- " + f.getTitulo());
            }
        }
    }
}
