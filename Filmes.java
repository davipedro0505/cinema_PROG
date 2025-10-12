import java.util.ArrayList;
import java.util.List;

public class Filmes {

private String titulo;
private String genero;
private String duracao;
private List<Ator> atores;

public Filmes(String titulo,String genero,String duracao){
    this.titulo = titulo;
    this.genero = genero;
    this.duracao = duracao;
    this.atores = new ArrayList<>();
}
 public String getTitulo(){
    return titulo;
 }
 public void setTitulo (String titulo){
    this.titulo = titulo;
 } 
 public String getGenero(){
    return genero; 
}
 public void setGenero(String genero){
    this.genero = genero;
 }
 public String getDuracao(){
    return duracao;
 }
 public void setDuracao(String duracao){
    this.duracao = duracao;
 }
 public List<Ator> getAtores(){
    return atores;
 }
 public void setAtores(List<Ator> atores){
    this.atores = atores;
 }
 public void adicionarAtor(Ator a){
    atores.add(a);
 }
 public void removerAtor(Ator a){
    atores.remove(a);
 }
 public void listarAtores(){
    System.out.println("Atores do filme'" + titulo + "':");
    for (Ator a : atores){
        System.out.println("-" + a.getNome() + "(" + a.getIdade() + "anos)");
    }
 }
 public void imprimirInf(){
    System.out.println("Titulo: " + titulo);
    System.out.println("Gênero: " + genero);
    System.out.println("duração: " + duracao);
    System.out.println("Quantidade de atores:" + atores.size());
 }
}
