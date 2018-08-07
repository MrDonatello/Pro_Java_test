package app;

import java.sql.SQLException;
import java.util.ArrayList;

class University {

    private Faculty faculty;
    private Group group;
    private Courses courses;
    private Timetable timetable;

    University() {

        this.faculty = new Faculty();
        this.group = new Group();
        this.courses = new Courses();
        this.timetable = new Timetable();
    }

    //ВОЗВРАЩАЕТ ИМЯ ФАКУЛЬТЕТА
    String[] getFacultyName() throws SQLException {

        return faculty.getFacultyName();
    }

    //УСТАНОВИТЬ ЗНАЧЕНИЕ ФАКУЛЬТЕТА
     void setIndexFaculty(int indexFaculty) {
        faculty.setIndexFaculty(indexFaculty);
    }

    //УСТАНОВИТЬ ЗНАЧЕНИЕ ИНДЕКСА КУРСА
    void setIndexCourses(int indexCourses) {
        this.courses.setIndexCourses(indexCourses);
    }

    //ВОЗВРАЩАЕТ НОМЕР КУРСА
    String[] getCoursesName() throws SQLException {
        return courses.getCoursesName();
    }

    //ВОЗВРАЩАЕТ ГРУППЫ
    String[] getGroups() throws SQLException {

        return group.getGroups(faculty.getIndexFaculty(), courses.getIndexCourses());
    }

    //УСТАНОВИТЬ ЗНАЧЕНИЕ ГРУППЫ
    void setIndexGroup(int indexGroup) {

        this.group.setIndexGroup(indexGroup);
    }

    //ВОЗВРАЩАЕТ РАСПИСАНИЕ
    ArrayList<String[]> getTimetable() throws SQLException {

        return timetable.getSchedule(group.getIndexGroup(), faculty.getIndexFaculty(), courses.getIndexCourses());
    }
}
