public class Carro {
    private String placa;
    private int ano;
    private String modelo;
    private boolean disponivel;
    private String vendedor;
    private double preco;

    public Carro(String placa, int ano, String modelo, boolean disponivel, String vendedor, double preco) {
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        this.disponivel = disponivel;
        this.vendedor = vendedor;
        this.preco = preco;
    }

    public boolean disponivel( boolean disponivel){
    if(disponivel == true){
    return true;
    }
    else return false;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getVendedor() {
        return vendedor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }


    
}

