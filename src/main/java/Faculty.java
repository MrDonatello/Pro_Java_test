import java.util.ArrayList;

class Faculty {

    private int indexFaculty;
    private Courses courses;

    //КОНСТРУКТОР гит
    Faculty(){

        this.courses = new Courses();
    }

    //УСТАНОВИТЬ ЗНАЧЕНИЕ ИНДЕКСА ФАКУЛЬТЕТА гит
    void setIndexFaculty(int indexFaculty) {

        this.indexFaculty = indexFaculty;
    }

    //ВОЗВРАЩАЕТ ИМЯ ФАКУЛЬТЕТА
     public String [] getFacultyName() {

        return   new String [] {"", "Гуманитарного образования", "Заочного обучения", "Радиотехнический",
                "Информационных технологий и компьютерных систем", "Машиностроительный"};
    }

    //ВОЗВРАЩАЕТ НОМЕР КУРСА
    String [] getCoursesName(){

        return courses.getCoursesName();
    }

    //ВОЗВРАЩАЕТ ГРУППЫ
    String [] getGroups(int indexCourses){

        courses.setIndexCourses(indexCourses);
        return courses.getGroups(indexFaculty);
    }

    //ВОЗВРАЩАЕТ РАСПИСАНИЕ
    ArrayList<String[]> getSchedule(int indexGroup){

        return courses.getSchedule(indexGroup,indexFaculty);
    }
}
