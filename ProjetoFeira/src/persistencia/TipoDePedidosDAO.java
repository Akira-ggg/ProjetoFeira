package persistencia;
import modelos.Pedidos;
import modelos.interfaces.IPedidosCRUD;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class TipoDePedidosDAO implements IPedidosCRUD {

    private String nomeDoArquivo = null;

    public TipoDePedidosDAO()  {
        try {
             nomeDoArquivo = "src\\bancoDeDadaos\\tiposDePedidos.txt" ;
             File arquivo = new File(nomeDoArquivo);

             if(!arquivo.exists()){
                 arquivo.getParentFile().mkdirs();
                 arquivo.createNewFile();
             }

        }catch (Exception e){
            System.out.println("Erro ao criar: " + e.getMessage());
        }



    }
    @Override
    public void salvar(Pedidos pedidos) throws Exception {
        FileWriter fr = new FileWriter(nomeDoArquivo, true);
        BufferedWriter br = new BufferedWriter(fr);
        String str = pedidos.getNome() + ";" +
                pedidos.getQuantidade() + ";" +
                pedidos.getPreco() + "\n";

        br.write(str);
        br.close();

    }

    @Override
    public void excluir(Pedidos pedidos) throws Exception {

    }

    @Override
    public void editar(Pedidos pedidos) throws Exception {

    }

    @Override
    public ArrayList<Pedidos> listaDePedidos() throws Exception {
        return null;
    }

    @Override
    public void atualizar(Pedidos pedidos) throws Exception {

    }
}
