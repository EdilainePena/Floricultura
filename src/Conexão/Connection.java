/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexão;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;


/**
 *
 * @author Gui
 */
public class Connection {
    MongoClient cliente = new MongoClient();
    MongoDatabase banco_de_dados = cliente.getDatabase("Floricultura");
    
    public Connection() {
        
    }
        
        public MongoDatabase banco_de_dados(){  
            return banco_de_dados;
        }
}
