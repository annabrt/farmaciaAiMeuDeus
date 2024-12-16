package farmaciaAiMeuDeus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroMedicamentoFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField nomeField;
    private JTextField codigoField;
    private JTextField quantidadeField;
    private JTextField precoField;
    private JButton cadastrarButton;
    private JButton abrirRegistroButton; // Bot�o para abrir RegisterFrame

    public CadastroMedicamentoFrame() {
        // Configura��es da tela de cadastro de medicamento
        setTitle("Cadastro de Medicamento");
        setSize(300, 300);
        setLocationRelativeTo(null); // Tela no centro da tela
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas a janela de cadastro

        // Layout GridLayout: 6 linhas e 2 colunas
        setLayout(new GridLayout(6, 2, 5, 10));

        // Criando os r�tulos e campos de entrada
        JLabel nomeLabel = new JLabel("Nome:");
        JLabel codigoLabel = new JLabel("C�digo:");
        JLabel quantidadeLabel = new JLabel("Quantidade:");
        JLabel precoLabel = new JLabel("Pre�o:");

        nomeField = new JTextField();
        codigoField = new JTextField();
        quantidadeField = new JTextField();
        precoField = new JTextField();
        cadastrarButton = new JButton("Cadastrar");
        abrirRegistroButton = new JButton("Abrir Cadastro de Usu�rio"); // Novo bot�o

        // A��o do bot�o de cadastrar
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obter os dados dos campos
                String nome = nomeField.getText();
                String codigo = codigoField.getText();
                String quantidade = quantidadeField.getText();
                String preco = precoField.getText();

                // Verifica��o simples de campos n�o vazios
                if (nome.isEmpty() || codigo.isEmpty() || quantidade.isEmpty() || preco.isEmpty()) {
                    JOptionPane.showMessageDialog(CadastroMedicamentoFrame.this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Aqui voc� pode adicionar a l�gica para armazenar os dados, como salvar em um banco de dados
                    JOptionPane.showMessageDialog(CadastroMedicamentoFrame.this, "Medicamento cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    // Limpar campos ap�s o cadastro
                    nomeField.setText("");
                    codigoField.setText("");
                    quantidadeField.setText("");
                    precoField.setText("");
                }
            }
        });

        // A��o do bot�o para abrir RegisterFrame
        abrirRegistroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RegisterFrame().setVisible(true); // Abre a tela de cadastro de usu�rio
            }
        });

        // Adicionando os componentes � tela
        add(nomeLabel);
        add(nomeField);
        add(codigoLabel);
        add(codigoField);
        add(quantidadeLabel);
        add(quantidadeField);
        add(precoLabel);
        add(precoField);
        add(cadastrarButton);
        add(abrirRegistroButton); // Adiciona o novo bot�o
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CadastroMedicamentoFrame().setVisible(true);
            }
        });
    }
}
