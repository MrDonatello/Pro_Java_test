import java.sql.*;

class Group {

    private DataBase dataBase;
    private int indexGroup;

    Group() {
        this.dataBase = new DataBase();
    }

    int getIndexGroup() {
        return indexGroup;
    }

    void setIndexGroup(int indexGroup) {
        this.indexGroup = indexGroup;
    }

    //ВОЗВРАЩАЕТ СПИСОК ГРУПП
    String[] getGroups(int indexFaculty, int indexCourses) throws SQLException, ClassNotFoundException {

        return dataBase.getGroups(indexFaculty, indexCourses);
    }
}
