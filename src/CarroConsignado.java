public class CarroConsignado extends Carro {
    private String proprietario;

    public CarroConsignado(String proprietario, String placa, int ano, String modelo, boolean disponivel, String vendedor, double preco) {
        super(placa, ano, modelo, disponivel, vendedor, preco);
        this.proprietario = proprietario;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    
    
    
}
