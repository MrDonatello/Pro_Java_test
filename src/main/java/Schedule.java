import java.sql.SQLException;
import java.util.ArrayList;

class Schedule {

    ArrayList<String[]> getSchedule(int indexGroup, int indexFaculty, int indexCourses) throws SQLException, ClassNotFoundException {
        return Gui.dataBase.getSchedule(indexFaculty, indexCourses, indexGroup);
    }
}
