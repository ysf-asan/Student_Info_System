package deneme;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JList;

import java.util.ArrayList;
import java.awt.Label;

import javax.swing.JTextArea;


public class studentFrame extends JFrame implements studentFunc{

	private JPanel contentPane;
	private JTextField textField;
	private List studentInfoList;
	private JTextField textField_1;
	private JTextArea textArea;
	
	private JComboBox<String> comboBox;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentFrame frame = new studentFrame();
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
	public studentFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(189, 54, 274, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textArea.setText("");
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(337, 92, 104, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        
				
				searchStudent(arg0);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(199, 92, 104, 27);
		contentPane.add(btnNewButton_1);
		
		JLabel lblEnterYourStudents = new JLabel("Enter your Student's ID");
		lblEnterYourStudents.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterYourStudents.setBounds(19, 49, 160, 35);
		contentPane.add(lblEnterYourStudents);
		
		JButton btnNewButton_2 = new JButton("Giriş Sayfası");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				goToHomePage(arg0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2.setBounds(19, 11, 104, 23);
		contentPane.add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_1.setBounds(135, 164, 238, 41);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setOpaque(false);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		textArea.setBounds(44, 252, 397, 119);
		contentPane.add(textArea);
		textArea.setOpaque(false);
	}

	@Override
	public void searchStudent(ActionEvent e) {
		String s_id = textField.getText();
        boolean found = false;
        // studentInfoList.removeAll();
        if (teacherFrame.studentList != null) {
            for (Student student : teacherFrame.studentList) {
                if (student.getId().equals(s_id)) {
                    StringBuilder toplu = new StringBuilder();
                    toplu.append("İsim: ").append(student.getName()).append("\n");
                    toplu.append("Cinsiyet: ").append(student.getGender()).append("\n");
                    toplu.append("Aldığı dersler ve notları: \n");
                    ArrayList<String> courses = student.getCourses();
                    ArrayList<String> grades = student.getGrades();
                    for (int i = 0; i < courses.size(); i++) {
                        toplu.append("Ders: ").append(courses.get(i)).append(", Not: ").append(grades.get(i)).append("\n");
                    }
                    textField_1.setText("Hoşgeldiniz " + student.getName());
                    textArea.setText(toplu.toString());
                    found = true;
                    break;
                }
            }
            if(!found){
				JOptionPane.showMessageDialog(null, "Öğrenci bulunamadı!","Hata",JOptionPane.ERROR_MESSAGE);
			}
		}else{
			JOptionPane.showMessageDialog(null, "Kayıtlı öğrenci bulunmamakta","Hata",JOptionPane.ERROR_MESSAGE);
		}
		
	}

	@Override
	public void goToHomePage(ActionEvent e) {
		new mainFrame().setVisible(true);
		dispose();
		
	}
}
