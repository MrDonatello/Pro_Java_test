
class Faculty {

    private int indexFaculty;

    public int getIndexFaculty() {
        return indexFaculty;
    }

    public void setIndexFaculty(int indexFaculty) {
        this.indexFaculty = indexFaculty;
    }

    //ВОЗВРАЩАЕТ ИМЯ ФАКУЛЬТЕТА
    public String[] getFacultyName() {

        return new String[]{"", "Заочного обучения", "Радиотехнический",
                "Информационных технологий и компьютерных систем"};
    }

}
