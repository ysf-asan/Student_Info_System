package deneme;

public class Student extends StudentAbstract {
    
    public Student(String name, String id, String gender) {
        super(name, id, gender);
    }

	@Override
	public void addCourse(String course, String grade) {
		this.getCourses().add(course);
		this.getGrades().add(grade);
		
	}
	
	public Student(String username, String password){
		super(username,password);
	}

    
}