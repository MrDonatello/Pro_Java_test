package app;

import java.sql.*;
import java.util.ArrayList;

class DataBase {

    private ArrayList<String> ListFaculty = new ArrayList<>();
    private ArrayList<String> ListCourses = new ArrayList<>();

    private ArrayList<String[]> timetableList = new ArrayList<>();
    private String[] groups;
    private String userName = "root";
    private String password = "5288";

    String[] getGroups(int indexFaculty, int indexCourses) throws SQLException {

        String urlGroup = "jdbc:mysql://localhost:3306/schedule";
        try (Connection connection = DriverManager.getConnection(urlGroup, userName, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from `group` where indexFaculty = ? and indexCourses = ?");
            preparedStatement.setInt(1, indexFaculty);
            preparedStatement.setInt(2, indexCourses);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                groups = resultSet.getString(3).split(",");
            }
        }
        return groups;
    }

    ArrayList<String[]> Timetable(int indexF, int indexC, int indexG) throws SQLException {

        timetableList.clear();
        String urlSchedule = "jdbc:mysql://localhost:3306/ras";
        try (Connection connection = DriverManager.getConnection(urlSchedule, userName, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement("select  * from tabletime where indexF = ? and indexC = ? and  indexG = ?");
            preparedStatement.setInt(1, indexF);
            preparedStatement.setInt(2, indexC);
            preparedStatement.setInt(3, indexG);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            String[] timetable = resultSet.getString(5).split("}");
            for (int i = 0; i < 6; i++) {
                timetableList.add(timetable[i].split(","));
            }
        }
        return timetableList;
    }

    String[] getFacultyName() throws SQLException {

        String urlGroup = "jdbc:mysql://localhost:3306/schedule";
        try (Connection connection = DriverManager.getConnection(urlGroup, userName, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from faculty.facultytable");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ListFaculty.add(resultSet.getString(2));
            }
        }
        return ListFaculty.toArray(new String[0]);
    }

    String[] getCourses() throws SQLException {

        String urlGroup = "jdbc:mysql://localhost:3306/schedule";
        try (Connection connection = DriverManager.getConnection(urlGroup, userName, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from courses.coursestable");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ListCourses.add(resultSet.getString(2));
            }
        }
        return ListCourses.toArray(new String[0]);
    }
}


