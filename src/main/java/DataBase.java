import java.sql.*;

   class DataBase {

    private String[] groups;

    String[] getGroups(int indexFaculty, int indexCourses) throws SQLException, ClassNotFoundException {
    String userName = "root";
    String password = "5288";
    String url = "jdbc:mysql://localhost:3306/schedule";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(url, userName, password);
    Statement statement = connection.createStatement()) {

        //-------------------------------------------------------SQL------------------------------------------------
        //statement.executeUpdate("create table name(id  not null primary key )");//создание новой таблицы
        //statement.executeUpdate(" insert into NAME_db (Name_row) = values ('name_add')");//добавление новой записи
        //statement.executeUpdate(" insert into NAME_db set name = 'name_add'") ;//добавление новой записи
        //ResultSet resultSet1 = statement.executeQuery("select groupsName  from `group` where indexFaculty= 31");выборка
        //System.out.println(resultSet.getInt(3));выбрать колонку по индексу
        //System.out.println(resultSet.getString("groupsName"));//выбрать колонку по названию
        //----------------------------------------------------------------------------------------------------------

        ResultSet resultSet = statement.executeQuery("select  * from `group`");
        while (resultSet.next()) {
            if (resultSet.getInt(1) == indexFaculty && resultSet.getInt(2) == indexCourses) {
                groups = resultSet.getString(3).split(",");
            }
        }}
    return groups;
}}
