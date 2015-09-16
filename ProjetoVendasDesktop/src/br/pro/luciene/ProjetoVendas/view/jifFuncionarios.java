/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jifPessoas.java
 *
 * Created on 02/04/2009, 19:33:36
 */
package br.pro.luciene.ProjetoVendas.view;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.pro.luciene.ProjetoVendas.model.Funcionario;
import br.pro.luciene.ProjetoVendas.model.Telefone;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Diretor
 */
public class jifFuncionarios extends javax.swing.JInternalFrame {

    Funcionario objFun;

//    Vector<Telefone> vetortelefones;
//    Vector<Situacao> vetorSituacoes;
//    PessoaData DAO;
//    SituacaoData DAOSituacao;
//    Vector cabecalho;

    /**
     * Creates new form jifPessoas
     */
    public jifFuncionarios() {
        initComponents();
        try {

            objFun = new Funcionario();

//            vetortelefones = new Vector<Telefone>();
//            vetorSituacoes = new Vector<Situacao>();
//            cabecalho = new Vector(); //JTable Pesquisa
//            DAO = new PessoaData();
//            DAOSituacao = new SituacaoData();
//            vetorSituacoes = DAOSituacao.carregarCombo();
//            jcbSituacao.setModel(new DefaultComboBoxModel(vetorSituacoes));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao abrir: "
                    + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpDadosGerais = new javax.swing.JPanel();
        jlID = new javax.swing.JLabel();
        jlId2 = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jlEndereco = new javax.swing.JLabel();
        jtEndereco = new javax.swing.JTextField();
        jlNumero = new javax.swing.JLabel();
        jtNumero = new javax.swing.JTextField();
        jlBairro = new javax.swing.JLabel();
        jtBairro = new javax.swing.JTextField();
        jlComplemento = new javax.swing.JLabel();
        jtComplemento = new javax.swing.JTextField();
        jlCep = new javax.swing.JLabel();
        jftCep = new javax.swing.JFormattedTextField();
        jlCidade = new javax.swing.JLabel();
        jtCidade = new javax.swing.JTextField();
        jlUf = new javax.swing.JLabel();
        jcbUf = new javax.swing.JComboBox();
        jlSituacao = new javax.swing.JLabel();
        jcbSituacao = new javax.swing.JComboBox();
        jlCadastradoEm = new javax.swing.JLabel();
        jlDataCadastro = new javax.swing.JLabel();
        jlTelefones = new javax.swing.JLabel();
        jcbTipoTelefone = new javax.swing.JComboBox();
        jftDDD = new javax.swing.JFormattedTextField();
        jftNumero = new javax.swing.JFormattedTextField();
        jbRetirar = new javax.swing.JButton();
        jbAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTelefones = new javax.swing.JTable();
        jpDadosFuncionario = new javax.swing.JPanel();
        jlRG = new javax.swing.JLabel();
        jtRG = new javax.swing.JTextField();
        jlCPF = new javax.swing.JLabel();
        jftCPF = new javax.swing.JFormattedTextField();
        jlDataNascimento = new javax.swing.JLabel();
        jdcDataNascimento = new com.toedter.calendar.JDateChooser();
        jlCTPS = new javax.swing.JLabel();
        jtCTPS = new javax.swing.JTextField();
        jlCargo = new javax.swing.JLabel();
        jtCargo = new javax.swing.JTextField();
        jlDepartamento = new javax.swing.JLabel();
        jtDepartamento = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();

        jButton1.setText("jButton1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Funcionários");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbConsultar.setText("Consultar");
        jbConsultar.setEnabled(false);
        getContentPane().add(jbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 120, 30));

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.setMaximumSize(new java.awt.Dimension(75, 23));
        jbSalvar.setMinimumSize(new java.awt.Dimension(75, 23));
        jbSalvar.setPreferredSize(new java.awt.Dimension(75, 23));
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 120, 30));

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 120, 30));

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 120, 30));

        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        getContentPane().add(jbAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 120, 30));

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 120, 30));

        jpDadosGerais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlID.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlID.setText("ID:");
        jpDadosGerais.add(jlID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, -1));

        jlId2.setText("0");
        jpDadosGerais.add(jlId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 20, -1));

        jlNome.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlNome.setText("Nome:");
        jpDadosGerais.add(jlNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, -1));

        jtNome.setForeground(new java.awt.Color(0, 0, 204));
        jtNome.setToolTipText("Digite o nome");
        jtNome.setEnabled(false);
        jpDadosGerais.add(jtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 240, -1));

        jlEmail.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlEmail.setText("E-mail:");
        jpDadosGerais.add(jlEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, -1));

        jtEmail.setForeground(new java.awt.Color(0, 0, 204));
        jtEmail.setToolTipText("Digite o e-mail");
        jtEmail.setEnabled(false);
        jpDadosGerais.add(jtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 240, -1));

        jlEndereco.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlEndereco.setText("Endereço:");
        jpDadosGerais.add(jlEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 70, -1));

        jtEndereco.setForeground(new java.awt.Color(0, 0, 204));
        jtEndereco.setToolTipText("Digite o endereço");
        jtEndereco.setEnabled(false);
        jpDadosGerais.add(jtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 240, -1));

        jlNumero.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlNumero.setText("Número:");
        jpDadosGerais.add(jlNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 70, -1));

        jtNumero.setForeground(new java.awt.Color(0, 0, 204));
        jtNumero.setToolTipText("Digite o número");
        jtNumero.setEnabled(false);
        jpDadosGerais.add(jtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 60, -1));

        jlBairro.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlBairro.setText("Bairro:");
        jpDadosGerais.add(jlBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, -1));

        jtBairro.setForeground(new java.awt.Color(0, 0, 204));
        jtBairro.setToolTipText("Digite o bairro");
        jtBairro.setEnabled(false);
        jpDadosGerais.add(jtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 240, -1));

        jlComplemento.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlComplemento.setText("Complemento:");
        jpDadosGerais.add(jlComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, -1));

        jtComplemento.setForeground(new java.awt.Color(0, 0, 204));
        jtComplemento.setToolTipText("");
        jtComplemento.setEnabled(false);
        jpDadosGerais.add(jtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 220, -1));

        jlCep.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCep.setText("CEP");
        jpDadosGerais.add(jlCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 70, -1));

        try {
            jftCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftCep.setToolTipText("Digite o CEP");
        jftCep.setEnabled(false);
        jpDadosGerais.add(jftCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 110, -1));

        jlCidade.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCidade.setText("Cidade:");
        jpDadosGerais.add(jlCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, -1));

        jtCidade.setForeground(new java.awt.Color(0, 0, 204));
        jtCidade.setToolTipText("Digite a cidade");
        jtCidade.setEnabled(false);
        jpDadosGerais.add(jtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 240, -1));

        jlUf.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlUf.setText("UF");
        jpDadosGerais.add(jlUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 70, -1));

        jcbUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "SP", "RJ", "ES", " " }));
        jcbUf.setToolTipText("Selecione o UF");
        jcbUf.setEnabled(false);
        jpDadosGerais.add(jcbUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 110, -1));

        jlSituacao.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlSituacao.setText("Situação:");
        jpDadosGerais.add(jlSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 70, -1));

        jcbSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));
        jcbSituacao.setToolTipText("Selecione a situação");
        jcbSituacao.setEnabled(false);
        jpDadosGerais.add(jcbSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 170, -1));

        jlCadastradoEm.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCadastradoEm.setText("Cadastrado em:");
        jpDadosGerais.add(jlCadastradoEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 100, -1));

        jlDataCadastro.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlDataCadastro.setText("xx/xx/xxxx");
        jpDadosGerais.add(jlDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 90, -1));

        jlTelefones.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlTelefones.setText("Telefones:");
        jpDadosGerais.add(jlTelefones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 70, -1));

        jcbTipoTelefone.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "Comercial", "Residencial", "Celular", "Recado" }));
        jcbTipoTelefone.setEnabled(false);
        jpDadosGerais.add(jcbTipoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 310, -1));

        try {
            jftDDD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftDDD.setEnabled(false);
        jpDadosGerais.add(jftDDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 320, 80, -1));

        try {
            jftNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftNumero.setEnabled(false);
        jpDadosGerais.add(jftNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 220, -1));

        jbRetirar.setText("-");
        jbRetirar.setEnabled(false);
        jbRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetirarActionPerformed(evt);
            }
        });
        jpDadosGerais.add(jbRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 60, -1));

        jbAdicionar.setText("+");
        jbAdicionar.setEnabled(false);
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });
        jpDadosGerais.add(jbAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 60, -1));

        jtbTelefones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "DDD", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbTelefones);

        jpDadosGerais.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 480, 80));

        jTabbedPane1.addTab("Dados Gerais", jpDadosGerais);

        jpDadosFuncionario.setLayout(null);

        jlRG.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlRG.setText("RG:");
        jpDadosFuncionario.add(jlRG);
        jlRG.setBounds(60, 70, 70, 17);

        jtRG.setForeground(new java.awt.Color(0, 0, 204));
        jtRG.setToolTipText("Digite o RG do Funcionário");
        jtRG.setEnabled(false);
        jpDadosFuncionario.add(jtRG);
        jtRG.setBounds(120, 70, 120, 20);

        jlCPF.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCPF.setText("CPF:");
        jpDadosFuncionario.add(jlCPF);
        jlCPF.setBounds(250, 70, 70, 17);

        try {
            jftCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftCPF.setToolTipText("Digite o CPF do Funcionário");
        jftCPF.setEnabled(false);
        jpDadosFuncionario.add(jftCPF);
        jftCPF.setBounds(310, 70, 120, 20);

        jlDataNascimento.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlDataNascimento.setText("Data de Nascimento:");
        jpDadosFuncionario.add(jlDataNascimento);
        jlDataNascimento.setBounds(60, 110, 160, 17);

        jdcDataNascimento.setEnabled(false);
        jpDadosFuncionario.add(jdcDataNascimento);
        jdcDataNascimento.setBounds(210, 110, 180, 20);

        jlCTPS.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCTPS.setText("CTPS:");
        jpDadosFuncionario.add(jlCTPS);
        jlCTPS.setBounds(60, 140, 70, 17);

        jtCTPS.setForeground(new java.awt.Color(0, 0, 204));
        jtCTPS.setToolTipText("Digite a CTPS do Funcionário");
        jtCTPS.setEnabled(false);
        jpDadosFuncionario.add(jtCTPS);
        jtCTPS.setBounds(120, 140, 270, 20);

        jlCargo.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCargo.setText("Cargo:");
        jpDadosFuncionario.add(jlCargo);
        jlCargo.setBounds(60, 170, 70, 17);

        jtCargo.setForeground(new java.awt.Color(0, 0, 204));
        jtCargo.setToolTipText("Digite o cargo do Funcionário");
        jtCargo.setEnabled(false);
        jpDadosFuncionario.add(jtCargo);
        jtCargo.setBounds(120, 170, 270, 20);

        jlDepartamento.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlDepartamento.setText("Departamento:");
        jlDepartamento.setToolTipText("");
        jpDadosFuncionario.add(jlDepartamento);
        jlDepartamento.setBounds(60, 200, 100, 17);

        jtDepartamento.setForeground(new java.awt.Color(0, 0, 204));
        jtDepartamento.setToolTipText("Digite o Departamento do Funcionário");
        jtDepartamento.setEnabled(false);
        jpDadosFuncionario.add(jtDepartamento);
        jtDepartamento.setBounds(170, 200, 220, 20);

        jlSenha.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlSenha.setText("Senha:");
        jpDadosFuncionario.add(jlSenha);
        jlSenha.setBounds(120, 260, 70, 17);

        jpfSenha.setToolTipText("Digite a senha do Funcionário");
        jpfSenha.setEnabled(false);
        jpDadosFuncionario.add(jpfSenha);
        jpfSenha.setBounds(200, 260, 160, 20);

        jTabbedPane1.addTab("Dados do Funcionário", jpDadosFuncionario);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 530, 470));

        setBounds(0, 0, 596, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try {
            if (validarCampos()) {
                if (preencherObjeto()) {
                    JOptionPane.showMessageDialog(this, 
                            "id:"+objFun.getIdPessoa() +
                            "\nNome:"+objFun.getNome() +
                            "\nE-mail:"+objFun.getEmail() +
                            "\nEndereço:"+objFun.getEndereco() +
                            "\nNúmero:"+objFun.getNumero()+
                            "\nBairro:"+objFun.getBairro() +
                            "\nComplemento:"+objFun.getComplemento()+
                            "\nCidade:"+objFun.getCidade() +
                            "\nUF:"+objFun.getUf() +
                            "\nCEP:"+objFun.getCep()+
                            "\nRG:"+objFun.getRg() +
                            "\nCPF:"+objFun.getCpf() +
                            "\nData Nascimento:"+objFun.getDataNascimento()+
                            "\nCTPS:"+ objFun.getCTPS() +
                            "\nCargo:" + objFun.getCargo() +
                            "\nDepartamento:" + objFun.getDepartamento() +
                            "\nSenha:" + objFun.getSenha() +
                                    
                            "Funcionário salvo !");
                    jbCancelarActionPerformed(evt);
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar:"
                    + erro.getMessage());
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
//        br.pro.luciene.ProjetoVendas.extras.Validacao.limparCampos(this);
//        br.pro.luciene.ProjetoVendas.extras.Validacao.tratarCampos(this, false);
        limparCampos();
        tratarCampos(false);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbNovo.setEnabled(true);
        jbAlterar.setEnabled(false);
        jbExcluir.setEnabled(false);
// TODO add your handling code here:
}//GEN-LAST:event_jbCancelarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jbExcluirActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        //br.pro.luciene.ProjetoVendas.extras.Validacao.limparCampos(this);
        //br.pro.luciene.ProjetoVendas.extras.Validacao.tratarCampos(this, true);
        limparCampos();
        tratarCampos(true);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbNovo.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbAlterar.setEnabled(false);
        jbAdicionar.setEnabled(true);
        jbRetirar.setEnabled(true);
}//GEN-LAST:event_jbNovoActionPerformed

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        DefaultTableModel mp = (DefaultTableModel) jtbTelefones.getModel();
        if (jcbTipoTelefone.getSelectedIndex() > 0
                && !jftDDD.getText().equals("")
                && !jftNumero.getText().equals("")) {
            Vector dados = new Vector();
            dados.add(jcbTipoTelefone.getSelectedItem());
            dados.add(jftDDD.getText());
            dados.add(jftNumero.getText());
            mp.addRow(dados);
        }
    }//GEN-LAST:event_jbAdicionarActionPerformed

    private void jbRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRetirarActionPerformed
        if (jtbTelefones.getSelectedRow() > -1) {
            DefaultTableModel mp = (DefaultTableModel) jtbTelefones.getModel();
            mp.removeRow(jtbTelefones.getSelectedRow());
        }
    }//GEN-LAST:event_jbRetirarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbRetirar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox jcbSituacao;
    private javax.swing.JComboBox jcbTipoTelefone;
    private javax.swing.JComboBox jcbUf;
    private com.toedter.calendar.JDateChooser jdcDataNascimento;
    private javax.swing.JFormattedTextField jftCPF;
    private javax.swing.JFormattedTextField jftCep;
    private javax.swing.JFormattedTextField jftDDD;
    private javax.swing.JFormattedTextField jftNumero;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlCTPS;
    private javax.swing.JLabel jlCadastradoEm;
    private javax.swing.JLabel jlCargo;
    private javax.swing.JLabel jlCep;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlComplemento;
    private javax.swing.JLabel jlDataCadastro;
    private javax.swing.JLabel jlDataNascimento;
    private javax.swing.JLabel jlDepartamento;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlId2;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlRG;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlSituacao;
    private javax.swing.JLabel jlTelefones;
    private javax.swing.JLabel jlUf;
    private javax.swing.JPanel jpDadosFuncionario;
    private javax.swing.JPanel jpDadosGerais;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtBairro;
    private javax.swing.JTextField jtCTPS;
    private javax.swing.JTextField jtCargo;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtComplemento;
    private javax.swing.JTextField jtDepartamento;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtRG;
    private javax.swing.JTable jtbTelefones;
    // End of variables declaration//GEN-END:variables

    private void formataTabela() {

        jtbTelefones.getColumnModel().getColumn(0).setPreferredWidth(80);
        jtbTelefones.getColumnModel().getColumn(1).setPreferredWidth(150);
        jtbTelefones.getColumnModel().getColumn(2).setPreferredWidth(80);

    }

    public boolean validarCampos() {
        if (jtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Digite o campo nome",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jtNome.requestFocus();
            return false;
        }
        if (jtNome.getText().length()>200) {
            JOptionPane.showMessageDialog(this,
                    "Digite no máximo 200 caracteres para o campo nome",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jtNome.requestFocus();
            return false;
        }
        if (jtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Digite o campo e-mail",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jtEmail.requestFocus();
            return false;
        }
        if (jtEmail.getText().length()>100) {
            JOptionPane.showMessageDialog(this,
                    "Digite apenas 100 caracteres no campo e-mail",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jtEmail.requestFocus();
            return false;
        }
        if (jtRG.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Digite o campo RG",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jtRG.requestFocus();
            return false;
        }
        if (jftCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Digite o campo CPF",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jftCPF.requestFocus();
            return false;
        }
        if(jtbTelefones.getRowCount()==0){
            JOptionPane.showMessageDialog(this,
                    "Digite pelo menos um Telefone",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jcbTipoTelefone.requestFocus();
            return false;
        }
        if (jpfSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Digite o campo Senha",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jpfSenha.requestFocus();
            return false;
        }
        if (jdcDataNascimento.getDate()==null) {
            JOptionPane.showMessageDialog(this,
                    "Digite o campo Data de Nascimento",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jdcDataNascimento.requestFocus();
            return false;
        }
        if (jtCTPS.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Digite o campo CTPS",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jtCTPS.requestFocus();
            return false;
        }
        if (jtCargo.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Digite o campo Cargo",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jtCargo.requestFocus();
            return false;
        }
        if (jtDepartamento.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Digite o campo Departamento",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jtDepartamento.requestFocus();
            return false;
        }
        if (jcbSituacao.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(this,
                    "Selecione a Situação",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jcbSituacao.requestFocus();
            return false;
        }

        return true;
    }

    public boolean preencherObjeto() throws Exception {
        objFun.setIdPessoa(Integer.parseInt(jlId2.getText()));
        objFun.setNome(jtNome.getText());
        objFun.setBairro(jtBairro.getText());
        objFun.setCep(jftCep.getText());
        objFun.setCidade(jtCidade.getText());
        objFun.setComplemento(jtComplemento.getText());
        objFun.setEmail(jtEmail.getText());
        objFun.setEndereco(jtEndereco.getText());
        objFun.setNumero(jtNumero.getText());
        objFun.setUf(jcbUf.getSelectedItem().toString());
        //objFun.setSituacao(vetorSituacoes.get(jcbSituacao.getSelectedIndex()));
        objFun.setDataCadastro(new Timestamp(new Date().getTime()));
        objFun.setDataNascimento(new Timestamp(jdcDataNascimento.
                getDate().getTime()));
        objFun.setCTPS(jtCTPS.getText());
        objFun.setCargo(jtCargo.getText());
        objFun.setCpf(jftCPF.getText());
        objFun.setRg(jtRG.getText());
        objFun.setSenha(jpfSenha.getText());
        for (int i = 0; i < jtbTelefones.getRowCount(); i++) {
            Telefone objTel = new Telefone();
            objTel.setTipo(jtbTelefones.getModel().
                    getValueAt(i, 0).toString());
            objTel.setDdd(jtbTelefones.getModel().
                    getValueAt(i, 1).toString());
            objTel.setTelefone(jtbTelefones.getModel().
                    getValueAt(i, 2).toString());
            objFun.adicionarTelefone(objTel);
        }
        

        return true;

    }
    public void limparCampos(){
        jlId2.setText("0");
        jtNome.setText("");
        jtEmail.setText("");
        jtEndereco.setText("");
        jtNumero.setText("");
        jtBairro.setText("");
        jtComplemento.setText("");
        jftCep.setText("");
        jtCidade.setText("");
        jcbUf.setSelectedIndex(0);
        jcbSituacao.setSelectedIndex(0);
        jlCadastradoEm.setText("");
        jcbTipoTelefone.setSelectedIndex(0);
        jftDDD.setText("");
        jftNumero.setText("");
        jtRG.setText("");
        jftCPF.setText("");
        jdcDataNascimento.setDate(null);
        jtCTPS.setText("");
        jtCargo.setText("");
        jtDepartamento.setText("");
        jpfSenha.setText("");
        //limpar a tabela
        jtbTelefones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Tipo", "DDD", "Telefone"}
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
    }
    public void tratarCampos(boolean b){
        jtNome.setEnabled(b);
        jtEmail.setEnabled(b);
        jtEndereco.setEnabled(b);
        jtNumero.setEnabled(b);
        jtBairro.setEnabled(b);
        jtComplemento.setEnabled(b);
        jftCep.setEnabled(b);
        jtCidade.setEnabled(b);
        jcbUf.setEnabled(b);
        jcbSituacao.setEnabled(b);
        jlCadastradoEm.setEnabled(b);
        jcbTipoTelefone.setEnabled(b);
        jftDDD.setEnabled(b);
        jftNumero.setEnabled(b);
        jtRG.setEnabled(b);
        jftCPF.setEnabled(b);
        jdcDataNascimento.setEnabled(b);
        jtCTPS.setEnabled(b);
        jtCargo.setEnabled(b);
        jtDepartamento.setEnabled(b);
        jpfSenha.setEnabled(b);
        jbAdicionar.setEnabled(b);
        jbRetirar.setEnabled(b);
    }
}
