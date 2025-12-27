package modelos;

public class Pedido {
    private  int id = 0;
    private String nomePedido = "";
    private int  qunatidde = 0;
    private double preco = 0;

    public Pedido(){

    }
    public Pedido(String nome, int qunatidde, double preco){
        this.nomePedido = nome;
        this.qunatidde = qunatidde;
        this.preco = preco;
    }
    public  Pedido(int id, String nomePedido, int qunatidde, double preco){
        this.id = id;
        this.nomePedido = nomePedido;
        this.qunatidde = qunatidde;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public int getQunatidde() {
        return qunatidde;
    }

    public void setQunatidde(int qunatidde) {
        this.qunatidde = qunatidde;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public String toString(){
        return  "ID: " + id + "\n" +
                "Nome: " + nomePedido + "\n" +
                "Quantidade: " + qunatidde + "\n"+
                "Preço: " + preco + "\n";
    }
}
