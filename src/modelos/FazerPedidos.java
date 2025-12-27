package modelos;
import interfaces.IPedidos;

import java.io.*;
import java.util.ArrayList;


public class FazerPedidos implements IPedidos {
    private String nomeDoArquivo = null;
    public FazerPedidos(){
        nomeDoArquivo = "./src/bancoDeDados/tiposDePedidos.txt";
    }
    public int geradorDeID()throws Exception{
        ArrayList<Pedido> pedido = this.listarProdutos();
        int auxID = 0;
        for(Pedido p : pedido){
            if(p.getId()> auxID){
                auxID = p.getId();

            }
        }
        return auxID+=1;

    }



    @Override
    public void somaTotal(Pedido tipoDePedido) {

    }

    @Override
    public void adicionarProduto(Pedido tipoDePedido) throws Exception {
        ArrayList<Pedido> listaProdutos = this.listarProdutos();
        int novoID = geradorDeID();
        tipoDePedido.setId(novoID);

        try{

            for(Pedido pedido : listaProdutos){
                if(pedido.getId() == tipoDePedido.getId()){
                    throw new Exception("Intem já existente cadastre outro");
                }
            }
            FileWriter fw = new FileWriter(nomeDoArquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            String str = tipoDePedido.getId() + ";";
            str += tipoDePedido.getNomePedido() + ";" +
                    tipoDePedido.getQunatidde() + ";" +
                    tipoDePedido.getPreco() + ";" + "\n";
            bw.write(str);
            bw.close();
            fw.close();

        }catch (Exception e){
            throw new Exception("Erro ao adicionar produto");
        }


    }

    @Override
    public void removerProduto(Pedido tipoDePedido) {

    }

    @Override
    public ArrayList<Pedido> listarProdutos() throws Exception {
        ArrayList<Pedido> listaProdutos = new ArrayList<>();
        try {

            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);


            String linha = "";
            while ((linha = br.readLine()) != null) {
                String[] vetorSTR = linha.split(";");
                Pedido objTipoDePedido = null;
                int id = Integer.parseInt(vetorSTR[0]);
                String nome = vetorSTR[1];
                int quantidade = Integer.parseInt(vetorSTR[2]);
                double valor = Double.parseDouble(vetorSTR[3]);
                objTipoDePedido = new Pedido(id, nome, quantidade, valor);
                listaProdutos.add(objTipoDePedido);


            }
            br.close();
            fr.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


        return listaProdutos;
    }
}
