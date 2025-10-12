public class Ingresso {
    private String evento;
    private double preco;
    private Cliente cliente; 

    protected Ingresso(String evento, double preco, Cliente cliente) {
        this.evento = evento;
        this.preco = preco;
        this.cliente = cliente;
    }


    public String getEvento() { return evento; }
    public double getPreco() { return preco; }
    public Cliente getCliente() { return cliente; }

    @Override
    public String toString() {
        return "Ingresso para " + evento + " - R$" + preco + 
               " (Cliente: " + cliente.getNome() + ")";
    }
}
