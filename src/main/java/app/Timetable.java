package app;

import java.sql.SQLException;
import java.util.ArrayList;

class Timetable {

    ArrayList<String[]> getSchedule(int indexGroup, int indexFaculty, int indexCourses) throws SQLException {
        return Gui.dataBase.Timetable(indexFaculty, indexCourses, indexGroup);
    }
}
