// Classe abstrata; não pode ser instanciada

/* Essa classe é abstrata porque "Pessoa" é apenas um exemplo (tipo um protótipo).
   Ela representa os atributos iguais que existem em "Funcionario" e "Cliente".
   Não tem como ser um objeto do tipo Pessoa, porque no nosso sistema todo indivíduo
   PRECISA ser um cliente ou um funcionário. */

public abstract class Pessoa {
    private String cpf;
    private String nome;
    private String email;

    // Construtor; não mexer
    public Pessoa(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    // Métodos getters e setters; não mexer
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método abstrato — obrigatório nas subclasses
    public abstract void imprimirInfo();
}
