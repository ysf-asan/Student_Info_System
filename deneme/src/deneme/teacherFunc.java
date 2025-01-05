package deneme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public interface teacherFunc {
    void addStudent(ActionEvent e);
    void deleteStudent(ActionEvent e);
    void clearFields(ActionEvent e);
    void updateStudent(ActionEvent e);
    void searchByID(ActionEvent e);
    void goToMainFrame(ActionEvent e);
}
