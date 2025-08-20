import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String modelo;
    private String placa;
    private double valorDiaria;
    private List<Acessorio> acessorios;

    public Carro(String modelo, String placa, double valorDiaria) {
        this.modelo = modelo;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.acessorios = new ArrayList<>(); // Inicializa a lista
    }
    
    public void adicionarAcessorio(Acessorio acessorio) {
        this.acessorios.add(acessorio);
    }
    
    public double getValorDiaria() {
        return valorDiaria;
    }
    
    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    @Override
    public String toString() {
        return "Carro{" +
               "modelo='" + modelo + '\'' +
               ", placa='" + placa + '\'' +
               ", valorDiaria=" + valorDiaria +
               ", acessorios=" + acessorios +
               '}';
    }
}