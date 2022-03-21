import java.util.List;

public class Student {



    private String name;                                     // Имя
    private String surname;                                 // Фамилия
    private int age;                                       // Возрост
    private int well;                                     // Курс
    private List<Integer> ListOfGrades ;                 // Список оценок
    private List<String> ListOfSubjectsStudied;         // Список изучаемых предметов
    private List<String> ChecklistForThisSemester;     // Список зачетов в этом семестре
    private List<String> ListOfExamsThisSemester;     // Список экзаменов в этом семестре
    private boolean homework;                        // Делает ли домашки



    public Student(String name, String surname, int age, int well, List<Integer> listOfGrades, List<String> listOfSubjectsStudied,
                   List<String> checklistForThisSemester, List<String> listOfExamsThisSemester, boolean homework) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.well = well;
        this.ListOfGrades = listOfGrades;
        this.ListOfSubjectsStudied = listOfSubjectsStudied;
        this.ChecklistForThisSemester = checklistForThisSemester;
        this.ListOfExamsThisSemester = listOfExamsThisSemester;
        this.homework = homework;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWell() {
        return well;
    }

    public void setWell(int well) {
        this.well = well;
    }

    public List<Integer> getListOfGrades() {
        return ListOfGrades;
    }

    public void setListOfGrades(List<Integer> listOfGrades) {
        ListOfGrades = listOfGrades;
    }

    public List<String> getListOfSubjectsStudied() {
        return ListOfSubjectsStudied;
    }

    public void setListOfSubjectsStudied(List<String> listOfSubjectsStudied) {
        ListOfSubjectsStudied = listOfSubjectsStudied;
    }

    public List<String> getChecklistForThisSemester() {
        return ChecklistForThisSemester;
    }

    public void setChecklistForThisSemester(List<String> checklistForThisSemester) {
        ChecklistForThisSemester = checklistForThisSemester;
    }

    public List<String> getListOfExamsThisSemester() {
        return ListOfExamsThisSemester;
    }

    public void setListOfExamsThisSemester(List<String> listOfExamsThisSemester) {
        ListOfExamsThisSemester = listOfExamsThisSemester;
    }

    public boolean isHomework() {
        return homework;
    }

    public void setHomework(boolean homework) {
        this.homework = homework;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", well=" + well +
                ", ListOfGrades=" + ListOfGrades +
                ", ListOfSubjectsStudied=" + ListOfSubjectsStudied +
                ", ChecklistForThisSemester=" + ChecklistForThisSemester +
                ", ListOfExamsThisSemester=" + ListOfExamsThisSemester +
                ", homework=" + homework +
                '}';
    }
}