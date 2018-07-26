import java.sql.SQLException;
import java.util.ArrayList;

class University {

    private Faculty faculty;
    private Group group;
    private Courses courses;
    private Schedule schedule;

    //КОНСТРУКТОР
    University() {

        this.faculty = new Faculty();
        this.group = new Group();
        this.courses = new Courses();
        this.schedule = new Schedule();
    }

    //ВОЗВРАЩАЕТ ИМЯ ФАКУЛЬТЕТА
    String[] getFacultyName() {

        return faculty.getFacultyName();
    }

    //УСТАНОВИТЬ ЗНАЧЕНИЕ ФАКУЛЬТЕТА
    public void setIndexFaculty(int indexFaculty) {

        faculty.setIndexFaculty(indexFaculty);
    }

    //УСТАНОВИТЬ ЗНАЧЕНИЕ ИНДЕКСА КУРСА
    void setIndexCourses(int indexCourses) {

        this.courses.setIndexCourses(indexCourses);
    }

    //ВОЗВРАЩАЕТ НОМЕР КУРСА
    String[] getCoursesName() {

        return courses.getCoursesName();
    }

    //ВОЗВРАЩАЕТ ГРУППЫ
    String[] getGroups() throws SQLException, ClassNotFoundException {

        return group.getGroups(faculty.getIndexFaculty(), courses.getIndexCourses());
    }

    //УСТАНОВИТЬ ЗНАЧЕНИЕ ГРУППЫ
    void setIndexGroup(int indexGroup) {

        this.group.setIndexGroup(indexGroup);
    }

    //ВОЗВРАЩАЕТ РАСПИСАНИЕ
    ArrayList<String[]> getSchedule() {

        return schedule.getSchedule(group.getIndexGroup(), faculty.getIndexFaculty(), courses.getIndexCourses());
    }
}
