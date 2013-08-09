package com.saugatlama.lamachat;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtAddress;
	private JTextField txtPort;

	/**
	 * Create the frame.
	 */
	public Login() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		} 		
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 320);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(121, 51, 135, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(42, 54, 69, 14);
		contentPane.add(lblUsername);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(121, 88, 135, 20);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		JLabel lblIpAddress = new JLabel("IP Address:");
		lblIpAddress.setBounds(42, 91, 69, 14);
		contentPane.add(lblIpAddress);
		
		JLabel lblPort = new JLabel("Port:");
		lblPort.setBounds(42, 150, 46, 14);
		contentPane.add(lblPort);
		
		txtPort = new JTextField();
		txtPort.setBounds(121, 147, 135, 20);
		contentPane.add(txtPort);
		txtPort.setColumns(10);
		
		JLabel lblAddressDesc = new JLabel("(e.g, 192.168.0.2)");
		lblAddressDesc.setBounds(141, 111, 100, 14);
		contentPane.add(lblAddressDesc);
		
		JLabel lblPortDesc = new JLabel("(e.g, 8192)");
		lblPortDesc.setBounds(158, 171, 69, 14);
		contentPane.add(lblPortDesc);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtUsername.getText();
				String address = txtAddress.getText();
				int port = Integer.parseInt(txtPort.getText());
				login(name, address, port);
			}
		});
		btnLogin.setBounds(102, 234, 89, 23);
		contentPane.add(btnLogin);
	}

	/*
	 * Login method
	 */
	private void login(String name, String address, int port) {
		dispose();
		System.out.println(name + ", " + address + ", " + port);
	}

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
}
