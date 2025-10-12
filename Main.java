import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       
        Ator ator1 = new Ator("Raphael Montes", 34);
        Filmes filme1 = new Filmes("Dias Perfeitos", "Suspense", "2h 45min");
        Filmes filme3 = new Filmes("A volta dos que não foram", "Comédia", "3h 10min");

        ator1.adicionarFilme(filme1);
        ator1.adicionarFilme(filme3);
        ator1.mostrarFilme();

        System.out.println("\n---");

        Ator ator2 = new Ator("Neiff de Jesus", 27);
        Filmes filme2 = new Filmes("Juntos para sempre", "Romance", "2h 15min");
        filme2.adicionarAtor(ator2);
        filme2.imprimirInf();
        filme2.listarAtores();

        List<Cliente> listaDeClientes = new ArrayList<>();

        Cliente c1 = new Cliente("Serena Bezerra Valu", 25);
        Cliente c2 = new Cliente("Lucas dos Santos Costa", 31);
        Cliente c3 = new Cliente("Maryanne Lima da Silve", 22);

        listaDeClientes.add(c1);
        listaDeClientes.add(c2);
        listaDeClientes.add(c3);

        for (Cliente c : listaDeClientes) {
            c.imprimirInfo();
        }

        c1.comprarIngresso("Show da Banda X", 120.0);
        c1.comprarIngresso("Teatro Y", 80.0);

        System.out.println("\nIngressos de " + c1.getNome() + ":");
        for (Ingresso i : c1.listarIngressos()) {
            System.out.println(i);
        }

        Ingresso i1 = c1.listarIngressos().get(0);
        c1.cancelarIngresso(i1);

        System.out.println("\nApós cancelamento:");
        for (Ingresso i : c1.listarIngressos()) {
            System.out.println(i);
        }

        System.out.println("\n--- Funcionário ---");
        Funcionario f1 = new Funcionario("111.222.333-44", "Carlos Souza", "carlos@ifpe.edu.br", "Atendente", 2500.0f);
        f1.imprimirInfo();
        f1.addAumento(500.0f);
        System.out.println("Após aumento:");
        f1.imprimirInfo();
    }
}
