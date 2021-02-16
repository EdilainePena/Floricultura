/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexão.Connection;
import Model.Funcionario;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Gui
 */
public class Funcionario_DAO {

    Connection conexao = new Connection();
    private final MongoDatabase banco_de_dados;
    private final MongoCollection<Document> funcionarios;
    
    public Funcionario_DAO() {
        banco_de_dados = conexao.banco_de_dados();
        funcionarios = banco_de_dados.getCollection("Funcionarios");
       

    }

    public void adicionar_Funcionario(Funcionario funcionario) {

        Document novoFuncionario = new Document("Nome", funcionario.getNome())
                .append("CPF", funcionario.getCPF())
                .append("Telefone", funcionario.getTelefone())
                .append("Data de Nascimento", funcionario.getData_nascimento());
        funcionarios.insertOne(novoFuncionario);
        JOptionPane.showMessageDialog(null, "Funcionario adicionado com sucesso!!!");
    }

    public Document buscar_Funcionario(String nome) {

        Document f = funcionarios.find(eq("Nome", nome)).first();
        return f;

    }

    public void atualizar_Funcionario(Funcionario funcionario) {
                
    }

    public void remover_Funcionario(String nome) {

        funcionarios.deleteOne(eq("Nome",nome));
        
    }

    public void listar_Funcionario() {

        try (MongoCursor cursor = funcionarios.find().iterator()) {
            while (cursor.hasNext()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(cursor.toString());
                System.out.println(funcionario.getNome());
            }
           
        }
    }
}