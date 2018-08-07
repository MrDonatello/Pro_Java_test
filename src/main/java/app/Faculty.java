package app;

import java.sql.SQLException;

class Faculty {

    private int indexFaculty;

    int getIndexFaculty() {
        return indexFaculty;
    }

    void setIndexFaculty(int indexFaculty) {
        this.indexFaculty = indexFaculty;
    }

    String[] getFacultyName() throws SQLException {

        return Gui.dataBase.getFacultyName();
    }

}
