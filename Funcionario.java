public class Funcionario extends Pessoa {
    private String cargo;
    private float salario;

    // Construtor
    public Funcionario(String cpf, String nome, String email, String cargo, float salario) {
        super(cpf, nome, email);
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters e Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

   
    public void addAumento(float valor) {
        this.salario += valor;
    }

 
    @Override
    public void imprimirInfo() {
        System.out.println("=== Funcionário ===");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Email: " + getEmail());
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
    }
}
