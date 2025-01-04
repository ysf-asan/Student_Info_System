package deneme;

import java.util.ArrayList;

public abstract class StudentAbstract {
    private String name;
    private String id;
    private ArrayList<String> grades;
    private ArrayList<String> courses;
    private String gender;

    public StudentAbstract(String name, String id, String gender) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.gender = gender;
    }

    public abstract void addCourse(String course, String grade);

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
    
    public void setCourses (ArrayList<String> courses){
    	this.courses = courses;
    }
    
    protected String username;
	protected String password;
	
	public StudentAbstract(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public boolean authenticate(String username, String passowrd){
		return this.username.equals(username) && this.password.equals(passowrd);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    
    
}