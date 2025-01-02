package deneme;

import java.util.ArrayList;

public class Student {
	private String name;
	private String id;
	private ArrayList<String> grades;
	private ArrayList<String> courses;
	private String gender;
	
	public Student(String name, String id, String gender) {
		this.name = name;
		this.id = id;
		this.grades = new ArrayList<>();
		this.courses = new ArrayList<>();
		this.gender = gender;
	}
	
	public void addCourse(String course, String grade){
		this.courses.add(course);
		this.grades.add(grade);
		
	}
	
	
	

	

	public Student() {
		
	}




	
	



	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Student's name: ").append(name).append("\n");
	    sb.append("Student's id: ").append(id).append("\n");
	    sb.append("Student's gender: ").append(gender).append("\n");
	    sb.append("Courses and Grades:\n");
	    for (int i = 0; i < courses.size(); i++) {
	        sb.append("Course: ").append(courses.get(i)).append(" - Grade: ").append(grades.get(i)).append("\n");
	    }
	    return sb.toString();
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}

	public ArrayList<String> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<String> grades) {
		this.grades = grades;
	}

	public ArrayList<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}
	
	
	
	
	
	
		
	
	
	
	
}
