package app;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TimeTableModel extends AbstractTableModel {

    private ArrayList<String[]> dataArrayList;

    TimeTableModel() {

        dataArrayList = new ArrayList<>();

        for (int i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);
        }
    }


    @Override
    public int getRowCount() {
        return dataArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }


    @Override
    public String getColumnName(int columnIndex) {

        switch (columnIndex) {
            case 0:
                return "понедельник";
            case 1:
                return "вторник";
            case 2:
                return "среда";
            case 3:
                return "четверг";
            case 4:
                return "пятница";
            case 5:
                return "суббота";
        }
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] row = dataArrayList.get(columnIndex);
        return row[rowIndex];
    }

    //Добавление на лист
        void addDate(ArrayList<String[]> row) {
        dataArrayList.clear();
        dataArrayList.addAll(row);
    }
}
