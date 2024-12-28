package deneme;

public class Student {
	private String name;
	private String id;
	private String grade;
	private String course;
	private String gender;
	
	public Student(String name, String id, String grade, String course, String gender) {
		this.name = name;
		this.id = id;
		this.grade = grade;
		this.course = course;
		this.gender = gender;
	}
	
	

	

	public Student() {
		
	}





	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", grade=" + grade
				+ ", course=" + course + ", gender=" + gender + "]";
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



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
		
	
	
	
	
}
