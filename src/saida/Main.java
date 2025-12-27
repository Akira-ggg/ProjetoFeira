package saida;


import modelos.FazerPedidos;
import modelos.Pedido;
import java.util.Scanner;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FazerPedidos pedidos = new FazerPedidos();
        System.out.println("Digite o nome do pedido: ");
        String nome = sc.nextLine();
        System.out.println("Digite a quantidade do pedido: ");
        int quantidade = sc.nextInt();
        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        Pedido f = new Pedido(nome,quantidade,valor);
        pedidos.adicionarProduto(f);




        ArrayList<Pedido> lista = pedidos.listarProdutos();
        for(Pedido p : lista){
            System.out.println(p);
        }

    }
}