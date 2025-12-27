package interfaces;
import java.util.ArrayList;
import modelos.Pedido;

public interface IPedidos {
     void somaTotal(Pedido tipoDePedido) throws Exception;
     void adicionarProduto(Pedido tipoDePedido) throws Exception;
     void removerProduto(Pedido tipoDePedido)throws Exception;
     ArrayList <Pedido> listarProdutos()throws Exception;

}
