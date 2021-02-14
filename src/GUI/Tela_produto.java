/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.Produto_DAO;
import Model.Produto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author edila
 */
public class Tela_produto extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Tela_produto() {
        initComponents();
        preencherTabelaCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        bt_produto = new javax.swing.JButton();
        bt_funcionario = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        tf_pesquisa = new javax.swing.JTextField();
        bt_pesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela_produto = new javax.swing.JTable();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        tf_nome = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        tf_preco_custo = new javax.swing.JTextField();
        tf_preco_venda = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        tf_quantidade = new javax.swing.JTextField();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        tf_descricao = new javax.swing.JTextField();
        bt_sair = new javax.swing.JButton();
        bt_atualizar = new javax.swing.JButton();
        bt_cadastrar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton5.setBackground(new java.awt.Color(215, 193, 235));
        jButton5.setText("Sair");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 7, 43)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLayeredPane2.setBackground(new java.awt.Color(240, 240, 240));
        jLayeredPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 7, 43), 2, true));

        bt_produto.setBackground(new java.awt.Color(215, 193, 235));
        bt_produto.setText("Produto");
        bt_produto.setBorder(null);
        bt_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_produtoActionPerformed(evt);
            }
        });

        bt_funcionario.setBackground(new java.awt.Color(215, 193, 235));
        bt_funcionario.setText("Funcionário");
        bt_funcionario.setBorder(null);
        bt_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_funcionarioActionPerformed(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(240, 240, 240));
        jLayeredPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 7, 43), 1, true));

        tf_pesquisa.setBackground(new java.awt.Color(215, 193, 235));
        tf_pesquisa.setToolTipText("");
        tf_pesquisa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 7, 43), 1, true));
        tf_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pesquisaActionPerformed(evt);
            }
        });

        bt_pesquisar.setBackground(new java.awt.Color(215, 193, 235));
        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.setBorder(null);
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        Tabela_produto.setBackground(new java.awt.Color(215, 193, 235));
        Tabela_produto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 7, 43), 1, true));
        Tabela_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Preço de custo", "Preço de venda", "Quantidade disponível", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabela_produto);

        jLayeredPane3.setBackground(new java.awt.Color(215, 193, 235));
        jLayeredPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 7, 43), 1, true));
        jLayeredPane3.setForeground(new java.awt.Color(0, 0, 0));

        tf_nome.setBackground(new java.awt.Color(215, 193, 235));
        tf_nome.setToolTipText("");
        tf_nome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 7, 43), 1, true));
        tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeActionPerformed(evt);
            }
        });

        label1.setBackground(new java.awt.Color(215, 193, 235));
        label1.setText("Nome:");

        label2.setText("Preço de custo:");

        tf_preco_custo.setBackground(new java.awt.Color(215, 193, 235));
        tf_preco_custo.setToolTipText("");
        tf_preco_custo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 7, 43), 1, true));
        tf_preco_custo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_preco_custoActionPerformed(evt);
            }
        });

        tf_preco_venda.setBackground(new java.awt.Color(215, 193, 235));
        tf_preco_venda.setToolTipText("");
        tf_preco_venda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 7, 43), 1, true));
        tf_preco_venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_preco_vendaActionPerformed(evt);
            }
        });

        label3.setText("Preço de Venda:");

        tf_quantidade.setBackground(new java.awt.Color(215, 193, 235));
        tf_quantidade.setToolTipText("");
        tf_quantidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 7, 43), 1, true));
        tf_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_quantidadeActionPerformed(evt);
            }
        });

        label4.setText("Quantidade disponível:");

        label5.setText("Descição:");

        tf_descricao.setBackground(new java.awt.Color(215, 193, 235));
        tf_descricao.setToolTipText("");
        tf_descricao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 7, 43), 1, true));
        tf_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_descricaoActionPerformed(evt);
            }
        });

        bt_sair.setBackground(new java.awt.Color(215, 193, 235));
        bt_sair.setText("Sair");
        bt_sair.setBorder(null);
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });

        bt_atualizar.setBackground(new java.awt.Color(215, 193, 235));
        bt_atualizar.setText("Atualizar");
        bt_atualizar.setBorder(null);
        bt_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_atualizarActionPerformed(evt);
            }
        });

        bt_cadastrar.setBackground(new java.awt.Color(215, 193, 235));
        bt_cadastrar.setText("Cadastrar");
        bt_cadastrar.setBorder(null);
        bt_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastrarActionPerformed(evt);
            }
        });

        bt_excluir.setBackground(new java.awt.Color(215, 193, 235));
        bt_excluir.setText("Excluir");
        bt_excluir.setBorder(null);
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(tf_nome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(label1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(label2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(tf_preco_custo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(tf_preco_venda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(label3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(tf_quantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(label4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(label5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(tf_descricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bt_sair, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bt_atualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bt_cadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bt_excluir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_preco_custo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_preco_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_descricao)))
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_preco_custo)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_quantidade)
                    .addComponent(tf_preco_venda, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane1.setLayer(tf_pesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bt_pesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane3)
                    .addComponent(jScrollPane2)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(tf_pesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(tf_pesquisa)
                        .addGap(5, 5, 5)))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane2.setLayer(bt_produto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bt_funcionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(bt_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLayeredPane1)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_produtoActionPerformed

    private void bt_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_funcionarioActionPerformed

        Tela_funcionario tf = new Tela_funcionario();
        tf.setVisible(true);
        dispose();

    }//GEN-LAST:event_bt_funcionarioActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        int selecionado = Tabela_produto.getSelectedRow();//recebe o indice na lista da linha selecionada
        int opcao;

        if (selecionado == -1) {//verifica se algum serviço foi selecionado
            JOptionPane.showMessageDialog(Tabela_produto, "Nenhum produto selecionado!");
            return;
        }
        //opcao recebe 0 para sim,1 para nao e 2 para cancelar
        opcao = JOptionPane.showConfirmDialog(Tabela_produto, "Tem certeza que deseja excluir esse produto?");

        if (opcao == 0) {//verifica se o usuario deseja excluir
            Produto_DAO p_dao = new Produto_DAO();

            if (!tf_pesquisa.getText().equals("")) {
                Document produto = p_dao.buscar_Produto(tf_pesquisa.getText()).get(selecionado);
                p_dao.remover_Produto(produto.getString("Nome"));
            } else {
                Document produto = p_dao.listar_Produto().get(selecionado);
                p_dao.remover_Produto(produto.getString("Nome"));
            }
            JOptionPane.showMessageDialog(Tabela_produto, "Produto excluido com sucesso!");
        }

        preencherTabelaCliente();
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarActionPerformed
        Produto produto = new Produto();
        produto.setNome(tf_nome.getText());
        produto.setPreco_custo(Float.parseFloat(tf_preco_custo.getText()));
        produto.setPreco_venda(Float.parseFloat(tf_preco_venda.getText()));
        produto.setQuantidade_disponivel(Integer.parseInt(tf_quantidade.getText()));
        produto.setDescricao(tf_descricao.getText());
        Produto_DAO p_dao = new Produto_DAO();
        p_dao.adicionar_Produto(produto);
        JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!!!");
        limpar_campos();
        preencherTabelaCliente();
        
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    private void bt_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_atualizarActionPerformed
        int selecionado = Tabela_produto.getSelectedRow();

        if (selecionado == -1) {//verifica se algum produto foi selecionado
            JOptionPane.showMessageDialog(Tabela_produto, "Nenhum produto selecionado!");
            return;
        }

        if (tf_nome.getText().equals("")) {
            preencher_campos(selecionado);
        }
        
        else{
            Produto produto = new Produto();
            Produto_DAO p_dao = new Produto_DAO();
            produto.setNome(tf_nome.getText());
            produto.setPreco_custo(Float.parseFloat(tf_preco_custo.getText()));
            produto.setPreco_venda(Float.parseFloat(tf_preco_venda.getText()));
            produto.setQuantidade_disponivel(Integer.parseInt(tf_quantidade.getText()));
            produto.setDescricao(tf_descricao.getText());
            
            p_dao.atualiizar_Produto(produto,tf_nome.getText());
            JOptionPane.showMessageDialog(Tabela_produto, "Produto atualizado com sucesso!");
            preencherTabelaCliente();
            limpar_campos();
        }
        


    }//GEN-LAST:event_bt_atualizarActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_sairActionPerformed

    private void tf_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_descricaoActionPerformed

    private void tf_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_quantidadeActionPerformed

    private void tf_preco_vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_preco_vendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_preco_vendaActionPerformed

    private void tf_preco_custoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_preco_custoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_preco_custoActionPerformed

    private void tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed

        if (tf_pesquisa.getText().equals("")) {
            preencherTabelaCliente();
        } else {
            Pesquisar_produto(tf_pesquisa.getText());
        }

    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void tf_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pesquisaActionPerformed

    public void preencherTabelaCliente() {

        Produto_DAO p_dao = new Produto_DAO();
        DefaultTableModel modelo = (DefaultTableModel) Tabela_produto.getModel();
        modelo.setNumRows(0);

        for (Document listar_Produto : p_dao.listar_Produto()) {
            modelo.addRow(new Object[]{
                listar_Produto.get("_id"),
                listar_Produto.getString("Nome"),
                listar_Produto.getDouble("Preço de custo"),
                listar_Produto.getDouble("Preço de venda"),
                listar_Produto.getInteger("Quantidade disponível"),
                listar_Produto.getString("Descrição")
            });
        }
    }

    @SuppressWarnings("empty-statement")
    public void Pesquisar_produto(String nome) {
        Produto_DAO p_dao = new Produto_DAO();
        DefaultTableModel modelo = (DefaultTableModel) Tabela_produto.getModel();
        modelo.setNumRows(0);

        try {
            for (Document listar_Produto : p_dao.buscar_Produto(nome)) {
                modelo.addRow(new Object[]{
                    listar_Produto.get("_id"),
                    listar_Produto.getString("Nome"),
                    listar_Produto.getDouble("Preço de custo"),
                    listar_Produto.getDouble("Preço de venda"),
                    listar_Produto.getInteger("Quantidade disponivel"),
                    listar_Produto.getString("Descrição")
                });
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado !");
        }
    }

    public void limpar_campos() {

        tf_nome.setText("");
        tf_descricao.setText("");
        tf_pesquisa.setText("");
        tf_preco_venda.setText("");
        tf_preco_custo.setText("");
        tf_quantidade.setText("");

    }

    public void preencher_campos(int selecionado) {
        Produto_DAO p_dao = new Produto_DAO();

        //Document produto = p_dao.buscar_Produto(tf_pesquisa.getText()).get(selecionado);//
        Document produto = p_dao.listar_Produto().get(selecionado);

        tf_nome.setText(produto.getString("Nome"));
        tf_descricao.setText(produto.getString("Descrição"));
        tf_preco_venda.setText(produto.getDouble("Preço de venda").toString());
        tf_preco_custo.setText(produto.getDouble("Preço de custo").toString());
        tf_quantidade.setText(produto.getInteger("Quantidade disponível").toString());

    }

    /*
        DefaultTableModel modelo = (DefaultTableModel) Tabela_produto.getModel();
        modelo.setNumRows(0);
        Produto_DAO produto_DAO = new Produto_DAO();
        
        for (Produto p : produto_DAO.listar_Proeduto()){
            modelo.addRow(new Object[]{
                
            });
        }
    }
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_produto().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela_produto;
    private javax.swing.JButton bt_atualizar;
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_funcionario;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JButton bt_produto;
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton jButton5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private javax.swing.JTextField tf_descricao;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_pesquisa;
    private javax.swing.JTextField tf_preco_custo;
    private javax.swing.JTextField tf_preco_venda;
    private javax.swing.JTextField tf_quantidade;
    // End of variables declaration//GEN-END:variables
}
