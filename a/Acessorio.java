public class Acessorio {
    private String nome;
    private double custoDiario;

    public Acessorio(String nome, double custoDiario) {
        this.nome = nome;
        this.custoDiario = custoDiario;
    }
    
    public String getNome() {
        return nome;
    }

    public double getCustoDiario() {
        return custoDiario;
    }
    
    @Override
    public String toString() {
        return "Acessorio{" +
               "nome='" + nome + '\'' +
               ", custoDiario=" + custoDiario +
               '}';
    }
}