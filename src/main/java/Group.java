
class Group {

    private String[] groups;
    private int indexGroup;

    public int getIndexGroup() {
        return indexGroup;
    }

    public void setIndexGroup(int indexGroup) {
        this.indexGroup = indexGroup;
    }

    //ВОЗВРАЩАЕТ ГРУППЫ
    String[] getGroups(int indexFaculty, int indexCourses) {

        switch (indexFaculty) {
            case 1:
                switch (indexCourses) {
                    case 1:
                        this.groups = new String[]{"", "ВГМУ-1711", "ВД-1711", "ВД-1721", "ВСР-1711", "ВТД-171"};
                        break;
                    case 2:
                        this.groups = new String[]{"", "ВД-161", "ГМУ-161", "Д-161", "ИСТ-161", "ПСД-161"};
                        break;
                    case 3:
                        this.groups = new String[]{"", "ВД-151", "ГМУ-151", "Д-151", "ИСТ-151", "ПСД-151"};
                        break;
                    case 4:
                        this.groups = new String[]{"", "ГМУ-141", "ГМУ-142", "ГМУ-143", "ГМУ-144", "ГМУ-145"};

                        break;
                    case 5:
                        this.groups = new String[]{"", "ВД-131", "ПСД-131", "ТД-131", "ТД-132", "	ТД-133"};
                        break;
                }
                break;
            case 2:
                switch (indexCourses) {
                    case 1:
                        this.groups = new String[]{"", "ВГМУ-171", "ВД-171", "ВД-172", "ВСР-171", "ВТД-17"};
                        break;
                    case 2:
                        this.groups = new String[]{"", "ЗИВТ-161", "ГМУ-161", "Д-161", "ИСТ-161", "ПСД-161"};
                        break;
                    case 3:
                        this.groups = new String[]{"", "ВД-151", "ГМУ-151", "Д-151", "ИСТ-151", "ПСД-151"};
                        break;
                    case 4:
                        this.groups = new String[]{"", "ГМУ-141", "ГМУ-142", "ГМУ-143", "ГМУ-144", "ГМУ-145"};

                        break;
                    case 5:
                        this.groups = new String[]{"", "ВД-131", "ПСД-131", "ТД-131", "ТД-132", "ТД-133"};
                        break;
                }
                break;
            case 3:
                switch (indexCourses) {
                    case 1:
                        this.groups = new String[]{"", "ВГМУ-171_1", "ВД-171_1", "ВД-172_1", "ВСР-171_1", "ВТД-17_1"};
                        break;
                    case 2:
                        this.groups = new String[]{"", "ВД-161", "ГМУ-161", "Д-161", "ИСТ-161", "ПСД-161"};
                        break;
                    case 3:
                        this.groups = new String[]{"", "ВД-151", "ГМУ-151", "Д-151", "ИСТ-151", "ПСД-151"};
                        break;
                    case 4:
                        this.groups = new String[]{"", "ГМУ-141", "ГМУ-142", "ГМУ-143", "ГМУ-144", "ГМУ-145"};

                        break;
                    case 5:
                        this.groups = new String[]{"", "ВД-131", "ПСД-131", "ТД-131", "ТД-132", "ТД-133"};
                        break;
                }
                break;
            case 4:
                switch (indexCourses) {
                    case 1:
                        this.groups = new String[]{"", "ВГМУ-171_2", "ВД-171_2", "ВД-172_2", "ВСР-17_2", "ВТД-17_2"};
                        break;
                    case 2:
                        this.groups = new String[]{"", "ВД-161", "ГМУ-161", "Д-161", "ИСТ-161", "ПСД-161"};
                        break;
                    case 3:
                        this.groups = new String[]{"", "ВД-151", "ГМУ-151", "Д-151", "ИСТ-151", "ПСД-151"};
                        break;
                    case 4:
                        this.groups = new String[]{"", "ГМУ-141", "ГМУ-142", "ГМУ-143", "ГМУ-144", "ГМУ-145"};

                        break;
                    case 5:
                        this.groups = new String[]{"", "ВД-131", "ПСД-131", "ТД-131", "ТД-132", "ТД-133"};
                        break;
                }
                break;
            case 5:
                switch (indexCourses) {
                    case 1:
                        this.groups = new String[]{"", "ВГМУ-171_3", "ВД-171_3", "ВД-172_3", "ВСР-171_3", "ВТД-17_3"};
                        break;
                    case 2:
                        this.groups = new String[]{"", "ВД-161", "ГМУ-161", "Д-161", "ИСТ-161", "ПСД-161"};
                        break;
                    case 3:
                        this.groups = new String[]{"", "ВД-151", "ГМУ-151", "Д-151", "ИСТ-151", "ПСД-151"};
                        break;
                    case 4:
                        this.groups = new String[]{"", "ГМУ-141", "ГМУ-142", "ГМУ-143", "ГМУ-144", "ГМУ-145"};

                        break;
                    case 5:
                        this.groups = new String[]{"", "ВД-131", "ПСД-131", "ТД-131", "ТД-132", "ТД-133"};
                        break;
                }
                break;
        }
        return groups;
    }
}
