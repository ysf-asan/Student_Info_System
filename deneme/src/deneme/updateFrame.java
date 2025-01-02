package deneme;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class updateFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Student student;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateFrame frame = new updateFrame());
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
	public updateFrame(final Student student, ActionListener actionListener) {
		this.student = student;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 363, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(151, 33, 166, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(151, 83, 166, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nesneye Y\u00F6nelik Programlama", "Devreler ve Sistemler", "Veri Yap\u0131lar\u0131", "Differential Equations", "Lojilk Devre Tasar\u0131m\u0131", "Olas\u0131l\u0131k Teorisi ve \u0130statistik"}));
		comboBox.setBounds(151, 133, 166, 23);
		contentPane.add(comboBox);
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
		rdbtnNewRadioButton.setBounds(151, 202, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Male");
		rdbtnNewRadioButton_1.setBounds(151, 176, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		JLabel lblStudentsName = new JLabel("Student's Name");
		lblStudentsName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentsName.setBounds(22, 36, 109, 22);
		contentPane.add(lblStudentsName);
		
		JLabel lblStundentsGrade = new JLabel("Stundent's Grade");
		lblStundentsGrade.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStundentsGrade.setBounds(22, 86, 119, 22);
		contentPane.add(lblStundentsGrade);
		
		JLabel lblStudentsLessons = new JLabel("Student's Lessons");
		lblStudentsLessons.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentsLessons.setBounds(22, 132, 119, 22);
		contentPane.add(lblStudentsLessons);
		
		JLabel lblNewLabel = new JLabel("Student's Gender");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(22, 191, 123, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				student.setName(textField.getText());
				String grade = (textField_1.getText());
				String course = (String) comboBox.getSelectedItem();
				String new_gender = null;
				
				boolean courseExist = false;
				for(int i=0; i<student.getCourses().size(); i++){
					if(student.getCourses().get(i).equals(course)){
						student.getGrades().set(i, grade);
						courseExist = true;
						break;
					}
				}
				if(!courseExist){
					student.addCourse(course, grade);
				}
				
				
				
				
				
				if(rdbtnNewRadioButton_1.isSelected()){
					new_gender = "Male";
				}else if (rdbtnNewRadioButton.isSelected()){
					new_gender = "Female";
				}else {
					new_gender = null;
				}
				
				student.setGender(new_gender);
				
				
				
				JOptionPane.showMessageDialog(null, "Öğrenci bilgileri başarıyla güncellendi","Başarı",JOptionPane.INFORMATION_MESSAGE);
				dispose();
				
				
			}
		});
		btnNewButton.setBounds(120, 251, 109, 30);
		contentPane.add(btnNewButton);
	}
}
