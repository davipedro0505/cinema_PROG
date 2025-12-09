import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {

    private String nome;
    private int idade;
    private final List<Ingresso> ingressos;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.ingressos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Compra de ingresso para um FILME
    public Ingresso comprarIngresso(Filme filme, double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser positivo.");
        }

        Ingresso ingresso = new Ingresso(filme, preco, this);
        ingressos.add(ingresso);
        return ingresso;
    }

    public boolean cancelarIngresso(Ingresso ingresso) {
        return ingressos.remove(ingresso);
    }

    public List<Ingresso> listarIngressos() {
        return Collections.unmodifiableList(ingressos);
    }

    public void imprimirInfo() {
        System.out.println("Cliente: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Ingressos comprados: " + ingressos.size());
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " (" + idade + " anos)";
    }
}
