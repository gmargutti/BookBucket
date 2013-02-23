package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Login {

	private JFrame frmLogin;
	private JPasswordField txtsenha;
	private JTextField txtlogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/BookBucket.png")));
		frmLogin.setResizable(false);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 350, 150);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLogin.setBounds(10, 11, 72, 22);
		frmLogin.getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSenha.setBounds(10, 36, 72, 22);
		frmLogin.getContentPane().add(lblSenha);
		
		txtsenha = new JPasswordField();
		txtsenha.setBounds(67, 40, 141, 20);
		frmLogin.getContentPane().add(txtsenha);
		
		txtlogin = new JTextField();
		txtlogin.setBounds(67, 13, 141, 20);
		frmLogin.getContentPane().add(txtlogin);
		txtlogin.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/images/BookBucket40x40.png")));
		btnNewButton.setBounds(218, 11, 116, 49);
		frmLogin.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Ver 1.0 Beta");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(253, 97, 81, 14);
		frmLogin.getContentPane().add(lblNewLabel);
	}
}
