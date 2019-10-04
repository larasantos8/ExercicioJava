public class CarroProprio extends Carro{
    private String dataCompra;

    public CarroProprio(String dataCompra, String placa, int ano, String modelo, boolean disponivel, String vendedor, double preco) {
        super(placa, ano, modelo, disponivel, vendedor, preco);
        this.dataCompra = dataCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    
}
