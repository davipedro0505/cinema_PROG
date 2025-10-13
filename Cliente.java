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

    // Getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public Ingresso comprarIngresso(String evento, double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser positivo.");
        }

        Ingresso ingresso = new Ingresso(evento, preco, this);
        ingressos.add(ingresso);
        return ingresso;
    }

    public boolean cancelarIngresso(Ingresso ingresso) {
        return ingressos.remove(ingresso);
    }

    public List<Ingresso> listarIngressos() {
        return Collections.unmodifiableList(ingressos);
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " (" + idade + " anos)";
    }

    void imprimirInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

