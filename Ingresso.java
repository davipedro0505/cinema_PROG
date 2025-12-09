public class Ingresso {

    private Filme filme;
    private double preco;
    private Cliente cliente;

    protected Ingresso(Filme filme, double preco, Cliente cliente) {
        this.filme = filme;
        this.preco = preco;
        this.cliente = cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public double getPreco() {
        return preco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Ingresso para o filme '" + filme.getTitulo() +
               "' - R$ " + preco +
               " (Cliente: " + cliente.getNome() + ")";
    }
}
