package app;

import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

class Gui extends JFrame {

    private University university = new University();
    private JComboBox<String> nameFakInst = new JComboBox<>(university.getFacultyName());
    private JComboBox<String> valueCourses = new JComboBox<>(university.getCoursesName());
    private JComboBox<String> nameGroup = new JComboBox<>();
    private TimeTableModel stm = new TimeTableModel();
    private JTable table = new JTable(stm);
    private JScrollPane scrollPane = new JScrollPane(table);
    static DataBase dataBase = new DataBase();


    Gui() throws SQLException {

        JFrame frame = new JFrame("Расписание занятий");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//открытие и закрытие1
        frame.setSize(800, 500);//размер формы
        frame.setVisible(true);//отбражение формы
        frame.setLocationRelativeTo(null);//локация формы( локация в какой-то форме)
        frame.setLayout(new GridLayout(2, 1));//расположение компонентов
        JPanel panel = new JPanel(new GridLayout());
        JPanel panel1 = new JPanel(new GridLayout(6, 1));
        JLabel label = new JLabel("Институт|Факультет");
        panel1.add(label);
        panel1.add(nameFakInst);
        JLabel label2 = new JLabel("Курс");
        panel1.add(label2);
        panel1.add(valueCourses);
        JLabel label3 = new JLabel("Группа");
        panel1.add(label3);
        panel1.add(nameGroup);
        frame.add(panel1);


        ActionListener actionListener = e -> {
            university.setIndexFaculty(nameFakInst.getSelectedIndex());//передача индекса факультета
            university.setIndexCourses(valueCourses.getSelectedIndex());//передача индекса курса
            if (nameFakInst.getSelectedIndex() != 0 && valueCourses.getSelectedIndex() != 0) {
                try {
                    nameGroup.setModel(new DefaultComboBoxModel<>(university.getGroups()));
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            } else {

                nameGroup.removeAllItems();
            }
        };


        ActionListener actionListener1 = e -> {
            if (nameGroup.getSelectedIndex() != 0) {
                university.setIndexGroup(nameGroup.getSelectedIndex());//передача индекса группы
                try {
                    stm.addDate(university.getTimetable());
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                panel.add(scrollPane);
                frame.add(panel);
                frame.validate();

            }
        };

        valueCourses.addActionListener(actionListener);
        nameFakInst.addActionListener(actionListener);
        nameGroup.addActionListener(actionListener1);
        frame.validate();
    }
}
