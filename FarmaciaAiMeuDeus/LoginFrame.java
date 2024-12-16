package farmaciaAiMeuDeus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton; // Novo bot�o
    private JLabel forgotPasswordLabel;

    public LoginFrame() {
        // Configura��es da tela de login
        setTitle("Login Farm�cia Ai Meu Deus");
        setSize(350, 320);
        setLocationRelativeTo(null); // Tela no centro da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout com espa�amento vertical personalizado
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20)); // 10 pixels de espa�amento entre os componentes

        JLabel userLabel = new JLabel("Usu�rio:");
        JLabel passwordLabel = new JLabel("Senha:");

        userField = new JTextField(25);
        passwordField = new JPasswordField(26);
        loginButton = new JButton("Entrar");
        registerButton = new JButton("Cadastre-se"); // Bot�o "Cadastre-se"

        // Configura��o do bot�o "Esqueci minha senha"
        forgotPasswordLabel = new JLabel("Esqueci minha senha");
        forgotPasswordLabel.setForeground(Color.BLUE); // Cor azul para parecer um link
        forgotPasswordLabel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cursor de m�o ao passar por cima
        forgotPasswordLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(LoginFrame.this, 
                    "Entre em contato com o suporte para recuperar sua senha.", 
                    "Esqueci minha senha", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JLabel registrerLabel = new JLabel("<html><a href=''>Cadastre-se</a></html>");
        registrerLabel.setCursor(new Cursor(Cursor .HAND_CURSOR));
        registrerLabel.addMouseListener(new MouseAdapter()
        {
        	@Override
            public void mouseClicked(MouseEvent e) {
        		new RegisterFrame().setVisible(true);
            }
        });

        // Adicionando componentes � tela
        add(userLabel);
        add(userField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(registerButton); // Adiciona o bot�o "Cadastre-se"
        add(forgotPasswordLabel); // Adiciona o "Esqueci minha senha"
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}
