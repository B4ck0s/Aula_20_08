public class Aluguel {
    private Cliente cliente;
    private Carro carro;
    private int diasAlugados;

    public Aluguel(Cliente cliente, Carro carro, int diasAlugados) {
        this.cliente = cliente;
        this.carro = carro;
        this.diasAlugados = diasAlugados;
    }

    public double calcularValorTotal() {
        double valorTotal = this.carro.getValorDiaria() * this.diasAlugados;
        
        // Adiciona o custo dos acessórios, se houver
        for (Acessorio acessorio : carro.getAcessorios()) {
            valorTotal += acessorio.getCustoDiario() * this.diasAlugados;
        }
        
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Resumo do Aluguel:\n" +
               "  " + cliente.toString() + "\n" +
               "  " + carro.toString() + "\n" +
               "  Dias Alugados: " + diasAlugados + "\n" +
               "  Valor Total: R$" + String.format("%.2f", calcularValorTotal());
    }
}