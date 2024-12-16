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
    private JButton abrirRegistroButton; // Botão para abrir RegisterFrame

    public CadastroMedicamentoFrame() {
        // Configurações da tela de cadastro de medicamento
        setTitle("Cadastro de Medicamento");
        setSize(300, 300);
        setLocationRelativeTo(null); // Tela no centro da tela
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas a janela de cadastro

        // Layout GridLayout: 6 linhas e 2 colunas
        setLayout(new GridLayout(6, 2, 5, 10));

        // Criando os rótulos e campos de entrada
        JLabel nomeLabel = new JLabel("Nome:");
        JLabel codigoLabel = new JLabel("Código:");
        JLabel quantidadeLabel = new JLabel("Quantidade:");
        JLabel precoLabel = new JLabel("Preço:");

        nomeField = new JTextField();
        codigoField = new JTextField();
        quantidadeField = new JTextField();
        precoField = new JTextField();
        cadastrarButton = new JButton("Cadastrar");
        abrirRegistroButton = new JButton("Abrir Cadastro de Usuário"); // Novo botão

        // Ação do botão de cadastrar
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obter os dados dos campos
                String nome = nomeField.getText();
                String codigo = codigoField.getText();
                String quantidade = quantidadeField.getText();
                String preco = precoField.getText();

                // Verificação simples de campos não vazios
                if (nome.isEmpty() || codigo.isEmpty() || quantidade.isEmpty() || preco.isEmpty()) {
                    JOptionPane.showMessageDialog(CadastroMedicamentoFrame.this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Aqui você pode adicionar a lógica para armazenar os dados, como salvar em um banco de dados
                    JOptionPane.showMessageDialog(CadastroMedicamentoFrame.this, "Medicamento cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    // Limpar campos após o cadastro
                    nomeField.setText("");
                    codigoField.setText("");
                    quantidadeField.setText("");
                    precoField.setText("");
                }
            }
        });

        // Ação do botão para abrir RegisterFrame
        abrirRegistroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RegisterFrame().setVisible(true); // Abre a tela de cadastro de usuário
            }
        });

        // Adicionando os componentes à tela
        add(nomeLabel);
        add(nomeField);
        add(codigoLabel);
        add(codigoField);
        add(quantidadeLabel);
        add(quantidadeField);
        add(precoLabel);
        add(precoField);
        add(cadastrarButton);
        add(abrirRegistroButton); // Adiciona o novo botão
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CadastroMedicamentoFrame().setVisible(true);
            }
        });
    }
}
