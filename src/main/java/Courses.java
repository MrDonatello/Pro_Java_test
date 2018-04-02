import java.util.ArrayList;

class Courses {

    private Group group;
    private int indexCourses;

    //КОНСТРУКТОР гиттт
  Courses(){

      this.group = new Group();
  }

    //УСТАНОВИТЬ ЗНАЧЕНИЕ ИНДЕКСА КУРСА гит
    void setIndexCourses(int indexCourses){

        this.indexCourses = indexCourses;
    }

    //ВОЗВРАЩАЕТ НОМЕР КУРСА
    String [] getCoursesName(){

        return new String [] {"","1","2","3","4","5"};
    }

    //ВОЗВРАЩАЕТ ГРУППЫ
    String [] getGroups(int indexFaculty){

        return group.getGroups(indexFaculty,indexCourses);
    }

    //ВОЗВРАЩАЕТ РАСПИСАНИЕ
    ArrayList<String[]> getSchedule(int indexGroup,int indexFaculty){

        return group.getSchedule(indexGroup,indexFaculty,indexCourses);
    }
}
