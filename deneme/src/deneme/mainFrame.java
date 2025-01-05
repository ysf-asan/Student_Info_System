package deneme;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;

import java.awt.Label;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import java.awt.Image;
import java.awt.Font;

public class mainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtKullancAd;
	private JPasswordField passwordField;
	private static String root;
	private static Admin admin;
	private static Student student;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//admin_username = "admin";
		//admin_password = "admin";
		
		//stu_username = "student";
		//stu_password = "student";
		
		admin = new Admin("admin","admin");
		student = new Student("student","student");
		
		
		
		root = "";
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame frame = new mainFrame();
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
	public mainFrame() {
		setFont(new Font("Dialog", Font.BOLD, 15));
		setTitle("Giriş");
		setIconImage(Toolkit.getDefaultToolkit().getImage(mainFrame.class.getResource("/deneme/resource/iu_small_sizee.png")));
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 50, 50));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setSize(500, 900);
		
		JButton btnNewButton = new JButton("Giri\u015F Yap");
		btnNewButton.setBounds(35, 158, 89, 23);
		contentPane.add(btnNewButton);
		
		txtKullancAd = new JTextField();
		txtKullancAd.setBounds(35, 62, 137, 28);
		contentPane.add(txtKullancAd);
		txtKullancAd.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(35, 119, 137, 28);
		contentPane.add(passwordField);
		
		Label label = new Label("Username");
		label.setBounds(35, 39, 62, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Password");
		label_1.setBounds(35, 96, 62, 22);
		contentPane.add(label_1);
		
		
		
		
		JButton btnNewButton_4 = new JButton("Forget Password");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] options = {"Öğretmen", "Öğrenci"};
				String userType = (String) JOptionPane.showInputDialog(null,"Hangi şifreyi değiştirmek istiyorsunuz?", "Şifre seçimi", JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
				if(userType != null){
					JTextField newPasswordField = new JTextField();
					Object[] message = {"Yeni Şifre: ", newPasswordField};
					int option = JOptionPane.showConfirmDialog(null, message, "Şifreyi Sıfırla (" + userType + ") ", JOptionPane.OK_CANCEL_OPTION);
					if(option == JOptionPane.OK_OPTION){
						if(userType.equals("Öğretmen")){
							admin.setPassword(newPasswordField.getText());
							JOptionPane.showMessageDialog(null, "Şifre başarıyla değiştirildi");
						} else if(userType.equals("Öğrenci")){
							student.setPassword(newPasswordField.getText());
							JOptionPane.showMessageDialog(null, "Şifre başarıyla değiştirildi");
						}else if(option == JOptionPane.CANCEL_OPTION || option == JOptionPane.CLOSED_OPTION){
							JOptionPane.showMessageDialog(null, "Şifre değiştirme işlemi iptal edildi.", "Bilgi",JOptionPane.INFORMATION_MESSAGE);
						}
				}
				
				
				
					
					
				}
			}
		});
		btnNewButton_4.setBounds(35, 186, 137, 23);
		contentPane.add(btnNewButton_4);
		
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(final ActionEvent e ){
				String username = txtKullancAd.getText();
				String password = new String(passwordField.getPassword());
				if(!username.isEmpty() && !password.isEmpty()){
					if(admin.authenticate(username, password)){
						JOptionPane.showMessageDialog(null,"Cerrahpaşa kayıt sistemine hoşgeldiniz.", "Information",JOptionPane.INFORMATION_MESSAGE);
						root = "Öğretmen";
						new teacherFrame().setVisible(true);
						dispose();
					}else if(student.authenticate(username, password)){
						JOptionPane.showMessageDialog(null,"Öğrenci bilgi sistemine hoşgeldin.", "Information",JOptionPane.INFORMATION_MESSAGE);
						root = "Öğrenci";
						new studentFrame().setVisible(true);
						dispose();
				}	
					
				}else{
						JOptionPane.showInputDialog(null,"ERROR!", "WARNING",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	
}
