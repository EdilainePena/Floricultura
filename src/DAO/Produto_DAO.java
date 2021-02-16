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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Gui
 */
public class Produto_DAO {

    Connection conexao = new Connection();
    private final MongoDatabase banco_de_dados;
    private final MongoCollection<Document> produtos;

    public Produto_DAO() {

        banco_de_dados = conexao.banco_de_dados();
        produtos = banco_de_dados.getCollection("Produtos");

    }

    public void adicionar_Produto(Produto produto) {

        Document novoProduto = new Document("Nome", produto.getNome())
                .append("Preço de custo", produto.getPreco_custo())
                .append("Preço de venda", produto.getPreco_venda())
                .append("Quantidade disponível", produto.getQuantidade_disponivel())
                .append("Descrição", produto.getDescricao());
        produtos.insertOne(novoProduto);
    }

    public ArrayList<Document> buscar_Produto(String nome) {

        ArrayList<Document> lista_produtos = new ArrayList<>();

        MongoCursor cursor = produtos.find(eq("Nome", nome)).iterator();
        while (cursor.hasNext()) {

            lista_produtos.add((Document) cursor.next());
        }

        return lista_produtos;

    }

    public void atualizar_Produto(Produto produto, String nome) {

        produtos.updateOne(eq("Nome", nome),
                new Document("$set",
                    new Document("Nome", produto.getNome())
                    .append("Preço de custo", produto.getPreco_custo())
                    .append("Preço de venda", produto.getPreco_venda())
                    .append("Quantidade disponível", produto.getQuantidade_disponivel())
                    .append("Descrição", produto.getDescricao())
                )
        );
        
    }

    public void remover_Produto(String nome) {

        produtos.deleteOne(eq("Nome", nome));

    }

    public ArrayList<Document> listar_Produto() {

        ArrayList<Document> lista_produtos = new ArrayList<>();

        MongoCursor cursor = produtos.find().iterator();
        while (cursor.hasNext()) {

            lista_produtos.add((Document) cursor.next());
        }

        return lista_produtos;
    }
}
