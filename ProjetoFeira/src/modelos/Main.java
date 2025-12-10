package modelos;
import persistencia.TipoDePedidosDAO;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pedidos tipoDePedidos = null;
        try{
            Scanner scr = new Scanner(System.in);
            System.out.println("Digite o tipo de produto: ");
            String tipo = scr.nextLine();
            System.out.println("Digite a quantidade do produto: ");
            int quantidade = scr.nextInt();
            System.out.println("Digite o valor do produto: ");
            double valor = scr.nextDouble();
            TipoDePedidosDAO tipoDePedidosDAO = new TipoDePedidosDAO();

            tipoDePedidos =  new Pedidos(tipo, quantidade, valor);

            tipoDePedidosDAO.salvar(tipoDePedidos);

            System.out.println("Arquivo criado com sucesso");


        }catch (Exception e){
            System.out.println("Erro ao criar: " + e.getMessage());
        }






    }
}
