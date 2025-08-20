public class Main {
    public static void main(String[] args) {
        // 1. Cria um Cliente
        Cliente cliente = new Cliente("João da Silva", "123.456.789-00");
        
        // 2. Cria 2 Acessórios
        Acessorio gps = new Acessorio("GPS", 15.00);
        Acessorio cadeirinha = new Acessorio("Cadeirinha de Bebê", 10.00);
        
        // 3. Cria 1 Carro e adiciona os 2 acessórios
        Carro carro = new Carro("Toyota Corolla", "ABC-1234", 100.00);
        carro.adicionarAcessorio(gps);
        carro.adicionarAcessorio(cadeirinha);
        
        // 4. Cria 1 Aluguel com o cliente, carro e dias alugados
        Aluguel aluguel = new Aluguel(cliente, carro, 7);
        
        // 5. Imprime o resumo do aluguel
        System.out.println(aluguel.toString());
    }
}
    
