/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import DAO.Produto_DAO;
import Model.Produto;

/**
 *
 * @author Gui
 */
public class Main {
     public static void main(String[] args) {
       
        Produto produto = new Produto();
        produto.setNome("rosa");
        produto.setPreco_custo(5);
        produto.setPreco_venda(50);
        produto.setQuantidade_disponivel(100);
        Produto_DAO p = new Produto_DAO(produto);
        p.adicionar_Produto();
        p.listar_Proeduto();
    }
}
