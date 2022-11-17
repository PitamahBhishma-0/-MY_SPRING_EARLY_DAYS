import java.util.List;

import com.gaurav.dao.Student_Dao;
import com.gaurav.model.Student;

public class App {

	public static void main(String[] args) {
		
		Student_Dao studentdao=new Student_Dao();
		Student student=new Student("Gauravvv","Basyal","gaurave@gmail.com");
		studentdao.saveStudent(student);
		student.setFirstName("Krishna");
		studentdao.UpdateStudent(student);
		studentdao.getStudentbyId(student.getId());
		List<Student> students=studentdao.getStudents(student.getId());
        students.forEach(student1 -> System.out.println(student1.getId()));
        studentdao.deleteStudent(student.getId());
	}

}
