import java.util.ArrayList;

class University {

        private Faculty faculty;
        int indexGroup;//сдесь экземпляр класса а не инт
        int indexCourses;
        int indexFaculty;

        //КОНСТРУКТОР
        University(){

            this.faculty = new Faculty();
        }

        //ВОЗВРАЩАЕТ ИМЯ ФАКУЛЬТЕТА
        String [] getFacultyName(){

            return faculty.getFacultyName();
        }

        //ВОЗВРАЩАЕТ НОМЕР КУРСА
        String [] getCoursesName (){

            return faculty.getCoursesName();
        }

        //ВОЗВРАЩАЕТ ГРУППЫ
        String [] getGroups(){

            faculty.setIndexFaculty(indexFaculty);
            return faculty.getGroups(indexCourses);
        }

        //ВОЗВРАЩАЕТ РАСПИСАНИЕ
        ArrayList<String[]> getSchedule(){

            return faculty.getSchedule(indexGroup);
        }
}
