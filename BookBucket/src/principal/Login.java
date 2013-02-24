package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Login extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3817989945944490744L;
	private JPanel contentPane;
	private JTextField txtlogin;
	private JPasswordField txtsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/BookBucket.png")));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLogin.setBounds(10, 11, 54, 22);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSenha.setBounds(10, 33, 54, 22);
		contentPane.add(lblSenha);
		
		txtlogin = new JTextField();
		txtlogin.setBounds(68, 13, 126, 20);
		contentPane.add(txtlogin);
		txtlogin.setColumns(10);
		
		txtsenha = new JPasswordField();
		txtsenha.setBounds(68, 37, 126, 20);
		contentPane.add(txtsenha);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/images/BookBucket40x40.png")));
		btnNewButton.setBounds(204, 11, 120, 44);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Ver 1.0 beta");
		lblNewLabel.setBounds(258, 87, 66, 14);
		contentPane.add(lblNewLabel);
	}
}
