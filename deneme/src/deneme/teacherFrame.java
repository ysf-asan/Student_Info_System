package deneme;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Color;

import javax.swing.JMenuBar;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JList;

public class teacherFrame extends JFrame implements teacherFunc {

	private static final String String = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	private JList<String> list;
	static ArrayList<Student> studentList = new ArrayList<>();
	private JComboBox<String> comboBox;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	
	//private void updateStudentJList(){
		//String[] studentArray = studentList.stream().map(Student::toString).toArray(String[]::new);
		//list.setListData(studentArray);
	//}
	
	
	
	
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacherFrame frame = new teacherFrame();
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
	public teacherFrame() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(172, 42, 199, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 85, 199, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(172, 171, 199, 32);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Student Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(31, 50, 116, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(31, 89, 102, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblStudentGrade = new JLabel("Student Grade");
		lblStudentGrade.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentGrade.setBounds(31, 175, 102, 23);
		contentPane.add(lblStudentGrade);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGender.setBounds(31, 141, 64, 19);
		contentPane.add(lblGender);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(172, 140, 74, 23);
		contentPane.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(262, 140, 109, 23);
		contentPane.add(rdbtnFemale);
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(rdbtnMale);
		genderGroup.add(rdbtnFemale);
		
		
		comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nesneye Y\u00F6nelik Programlama", "Veri Yap\u0131lar\u0131", "Devreler ve Sistemler", "Differential Equations", "Lojik Devre Tasar\u0131m\u0131", "Olas\u0131l\u0131k Teorisi ve \u0130statistik"}));
		comboBox.setBounds(172, 216, 199, 32);
		contentPane.add(comboBox);
		
		JLabel lblStudenstsL = new JLabel("Studenst's Lessons");
		lblStudenstsL.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudenstsL.setBounds(31, 220, 134, 23);
		contentPane.add(lblStudenstsL);
		
		textField_3 = new JTextField();
		textField_3.setBounds(31, 293, 143, 32);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addStudent(e);
				
			}
		});
		btnAddStudent.setBounds(531, 89, 127, 34);
		contentPane.add(btnAddStudent);
		
		JButton btnNewButton = new JButton("Delete Student");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				deleteStudent(arg0);
			}
		});
		btnNewButton.setBounds(352, 295, 143, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				clearFields(arg0);
			}
		});
		btnNewButton_1.setBounds(531, 134, 127, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update Student");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateStudent(e);
					
			}
		});
		btnNewButton_2.setBounds(505, 296, 143, 27);
		contentPane.add(btnNewButton_2);
		
		list = new JList();
		list.setBounds(31, 359, 627, 124);
		contentPane.add(list);
		
		JButton btnNewButton_3 = new JButton("Search by ID");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				searchByID(arg0);
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(199, 295, 143, 27);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Giriş sayfası");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				goToMainFrame(arg0);
			}
		});
		btnNewButton_4.setBounds(531, 176, 127, 34);
		contentPane.add(btnNewButton_4);
		
		
	
		
		
			
		
	}

	@Override
	public void addStudent(ActionEvent e) {
		String name = textField.getText();
		String id = textField_1.getText();
		String grade = textField_2.getText();
		String course = (String) comboBox.getSelectedItem();
		String gender = null;
		
		if(rdbtnMale.isSelected()){
			gender = "Male";
		}else if (rdbtnFemale.isSelected()){
			gender = "Female";
		}else {
			gender = null;
		}
		
		
		
		boolean studentExists = false;
		for(Student student : studentList){
			if(student.getId().equals(id)){
				student.addCourse(course, grade);
				if(gender != null){
					student.setGender(gender);
				}
				studentExists = true;
				break;
			}
		}
		
		if(!studentExists){
			Student student = new Student(name,id,gender);
			student.addCourse(course,grade);
			studentList.add(student);
		}
		
		
		
		JOptionPane.showMessageDialog(null, "Öğrenci başarıyla eklendi: "+name,"Öğrenci ekleme",JOptionPane.INFORMATION_MESSAGE);
		
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		comboBox.setSelectedIndex(0);
		
	}

	@Override
	public void deleteStudent(ActionEvent e) {
		String stud_id = textField_3.getText();
		if(stud_id != null && !stud_id.trim().isEmpty()){
			for(int i = 0; i<studentList.size(); i++){
			if(studentList.get(i).getId().equals(stud_id)){
				studentList.remove(i);
				JOptionPane.showMessageDialog(null,"Öğrenci başarıyla silindi","Öğrenci İşlemi",JOptionPane.INFORMATION_MESSAGE);
				textField_3.setText("");
			}
			
		}
		}else{
				JOptionPane.showMessageDialog(null, "Öğrenci Bulunamadı!", "Hata", JOptionPane.ERROR_MESSAGE);
			}
		
	}

	@Override
	public void clearFields(ActionEvent e) {
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		comboBox.setSelectedIndex(0);
		rdbtnMale.setSelected(false);
		rdbtnFemale.setSelected(false);
		
	}

	@Override
	public void updateStudent(ActionEvent e) {
		String st_id = textField_3.getText();
		if(st_id != null){
			for(Student studentss : studentList){
				if(studentss.getId().equals(st_id)){
					new updateFrame(studentss, this).setVisible(true);
					
					
				}
			}
		}else{
			JOptionPane.showMessageDialog(null, "Öğrenci bulunamadı!", "Hata",JOptionPane.ERROR_MESSAGE);
		}
		
	}

	@Override
	public void searchByID(ActionEvent e) {
		String stu_id = textField_3.getText();
		for(Student student : studentList){
			if(student.getId().equals(stu_id)){
				JOptionPane.showMessageDialog(null, student.toString(),"Öğrenci Bilgileri", JOptionPane.INFORMATION_MESSAGE);
				textField_3.setText("");
			
			}else{
				JOptionPane.showMessageDialog(null, "Öğrenci Bulunamadı!", "Hata", JOptionPane.ERROR_MESSAGE);
			}
		}
		
	}

	@Override
	public void goToMainFrame(ActionEvent e) {
		new mainFrame().setVisible(true);
		dispose();
		
	}
	}


