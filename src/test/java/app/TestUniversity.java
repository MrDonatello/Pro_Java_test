package app;

import org.junit.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertArrayEquals;

public class TestUniversity {

    @Test
    public void getGroup() throws SQLException {
        University university = new University();
        university.setIndexFaculty(1);
        university.setIndexCourses(1);

        assertArrayEquals(new String[]{"", "ЗАТП-171", "ЗАТП-172", "ЗГД-171"}, university.getGroups());
    }

    @Test
    public void getSchedule() throws SQLException {
        University university = new University();
        university.setIndexFaculty(1);
        university.setIndexCourses(1);
        university.setIndexGroup(1);
        ArrayList<String[]> scheduleList = new ArrayList<>();

        String[][] strings = new String[][]{
                {"пары нет 1:)", "Проектирование и тестирование", " Операционные системы", " Философия", " ", " "},                    //пн
                {"Операционные системы", "Базы данных", "Иностранный язык", "Электротехника", "Математика", "Электротехника"},       //вт
                {"Базы данных", "Операционные системы", "Иностранный язык", "Операционные системы", "Базы данных", "Философия"},     //ср
                {"Математика", "Операционные системы", "Базы данных", "Электротехника", "Иностранный язык", "Электротехника"},       //чт
                {"Электротехника", "Базы данных", "Электротехника", "Математика", "Базы данных", "Электротехника"},                  //пт
                {"Электротехника", "Математика", "Операционные системы", "Базы данных", "Иностранный язык", "Операционные системы"}};//сб
        Collections.addAll(scheduleList, strings);

        assertArrayEquals(scheduleList.toArray(), university.getTimetable().toArray());
    }

    @Test
    public void getFacultyName() throws SQLException {
        University university = new University();
        assertArrayEquals(new String[]{"", "Заочного обучения", "Радиотехнический",
                "Информационных технологий и компьютерных систем"}, university.getFacultyName());
    }

    @Test
    public void getCourses() throws SQLException {
        University university = new University();
        assertArrayEquals(new String[]{"", "1", "2", "3", "4", "5"}, university.getCoursesName());
    }
}
