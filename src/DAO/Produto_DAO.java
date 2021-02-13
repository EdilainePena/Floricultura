/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexão.Connection;
import Model.Produto;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;

/**
 *
 * @author Gui
 */
public class Produto_DAO {

    Connection conexao = new Connection();
    private final MongoDatabase banco_de_dados;
    private final MongoCollection<Document> produtos;
    Produto produto;

    public Produto_DAO(Produto p) {
        banco_de_dados = conexao.banco_de_dados();
        produtos = banco_de_dados.getCollection("Produtos");
        this.produto = p;

    }

    public void adicionar_Produto() {

        Document novoProduto = new Document("Nome", produto.getNome())
                .append("Preço de custo", produto.getPreco_custo())
                .append("Preço de venda", produto.getPreco_venda())
                .append("Quantidade disponivel", produto.getQuantidade_disponivel());
        produtos.insertOne(novoProduto);

    }

    public Document buscar_Produto(String nome) {

        Document p = produtos.find(eq("Nome", nome)).first();
        return p;

    }

    public void atualiizar_Produto(Produto produto) {
        
        
    }

    public void remover_Produto(String nome) {

        produtos.deleteOne(eq("Nome",nome));
        
    }

    public void listar_Proeduto() {

        try (MongoCursor cursor = produtos.find().iterator()) {
            while (cursor.hasNext()) {
                System.out.println(cursor.next().toString());
            }
           
        }
    }
}