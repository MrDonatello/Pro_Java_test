package app;

import java.sql.SQLException;

class Courses {

    private int indexCourses;


    int getIndexCourses() {
        return indexCourses;
    }

    void setIndexCourses(int indexCourses) {

        this.indexCourses = indexCourses;
    }

    String[] getCoursesName() throws SQLException {

        return Gui.dataBase.getCourses();
    }
}
