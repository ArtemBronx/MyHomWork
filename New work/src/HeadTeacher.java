

import java.util.ArrayList;
import java.util.List;


public class HeadTeacher {


    private String name;                                                // Имя
    private String surname;                                            // Фамилия
    List<Student> studentList;                                        // Список студентов
    List<Student> outStudentList = new ArrayList<>();                // Список студентов на отчисление

    public HeadTeacher(String name, String surname, List<Student> studentList) {
        this.name = name;
        this.surname = surname;
        this.studentList = studentList;

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

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getOutStudentList() {
        return outStudentList;
    }

    public void setOutStudentList(List<Student> outStudentList) {
        this.outStudentList = outStudentList;
    }


    @Override
    public String toString() {
        return "HeadTeacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studentList=" + studentList +
                ", outStudentList=" + outStudentList +
                '}';

    }

    public void printAllStudents() {

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).getName() + " " + studentList.get(i).getSurname());
        }
    }


    public void nameListOfSubjectsStudied(String name) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getListOfSubjectsStudied().contains(name))
                System.out.print(studentList.get(i).getName() + " " + studentList.get(i).getSurname() + ", ");
        }

        System.out.println();

    }


    public void nameChecklistForThisSemester(String name) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getChecklistForThisSemester().contains(name))
                System.out.print(studentList.get(i).getName() + " " + studentList.get(i).getSurname() + ", ");
        }

        System.out.println();
    }

    public void nameListOfExamsThisSemester(String name) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getListOfExamsThisSemester().contains(name))
                System.out.print(studentList.get(i).getName() + " " + studentList.get(i).getSurname() + ", ");

        }

        System.out.println();
    }


    public void numListOfGrades() {

        for (int i = 0; i < studentList.size(); i++) {
            int count = 0;
            double sum = 0;
            double num = 0;

            for (int j = 0; j < studentList.get(i).getListOfGrades().size(); j++) {
                sum += studentList.get(i).getListOfGrades().get(j);
                count += 1;
            }
            num = sum / count;
            System.out.println(studentList.get(i).getName() + " " + studentList.get(i).getSurname() +
                    " " + "Средний балл: " + num + "; ");

            if (num < 4 && !studentList.get(i).isHomework()) {
                outStudentList.add(studentList.get(i));
            }
        }
        System.out.println();
        System.out.print("На отчисление ");

        for (int i = 0; i < outStudentList.size(); i++) {
            System.out.print(outStudentList.get(i).getName() + " " + outStudentList.get(i).getSurname() + "; ");
        }
        System.out.println();
    }
}
