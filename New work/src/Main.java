import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Tolia","Chery",23,2,
                Arrays.asList(2,4,5,5),
                Arrays.asList("Maths","Engineering","Programming", "Physics","Biology" ),
                Arrays.asList("Maths","Engineering","Programming", "Physics"),
                Arrays.asList("Engineering","Programming"),
                true);

        Student s2 = new Student("Irori", "Ivanov", 24, 2,
                Arrays.asList(3,4,5),
                Arrays.asList("Math", "Biology","Physics"),
                Arrays.asList("Physics","Math"),
                Arrays.asList("Biology","Physics"),
                  true);

        Student s3 = new Student("Ivan", "Emelia", 55, 2,
                Arrays.asList(2,2,2,2),
                Arrays.asList("Geography","History","Engineering","Fisculture"),
                Arrays.asList("Geography","History","Engineering"),
                Arrays.asList("Geography","Fisculture"),
                      false);


        Student s4 = new Student("Oliga", "Denesenka", 28, 2,
                Arrays.asList(3,3,5,5,5),
                Arrays.asList("Biology","History","English","Programming","Accounting"),
                Arrays.asList("Biology","History","Accounting"),
                Arrays.asList("Accounting","Programming"),
                      true);

        HeadTeacher teacher = new HeadTeacher ("Petor","Dycalis",Arrays.asList(s1,s2,s3,s4));
        teacher.printAllStudents();
        System.out.println();

        System.out.print("Историю изучают  : ");
        teacher.nameListOfSubjectsStudied("History");

        System.out.print("Зачет по Биологии : ");
        teacher.nameChecklistForThisSemester("Biology");

        System.out.print("Экзамен по Математике : ");
        teacher.nameListOfExamsThisSemester("Match");

        System.out.println();


        teacher.numListOfGrades();
    }}