package app;

import java.sql.*;

class Group {

    private int indexGroup;

    int getIndexGroup() {
        return indexGroup;
    }

    void setIndexGroup(int indexGroup) {
        this.indexGroup = indexGroup;
    }

    String[] getGroups(int indexFaculty, int indexCourses) throws SQLException {

        return Gui.dataBase.getGroups(indexFaculty, indexCourses);
    }
}
