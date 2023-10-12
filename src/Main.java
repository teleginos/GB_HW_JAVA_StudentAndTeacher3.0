import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Инициализация контроллера
        Controler controler = new Controler();

        // Создание студентов и преподавателя
        controler.createStudent("Иван", "Иванович", "Иванов", "01.01.2000");
        controler.createStudent("Петр", "Петрович", "Петров", "02.02.2001");
        controler.createStudent("Анна", "Андреевна", "Андреева", "03.03.2002");
        controler.createTeacher("Ольга", "Сергеевна", "Сергеева", "04.04.1995");

        // Получение студентов и преподавателя по ID
        User student1 = controler.getUserById(Type.STUDENT, 1);
        User student2 = controler.getUserById(Type.STUDENT, 2);
        User teacher = controler.getUserById(Type.TEACHER, 1);

        // Вывод информации о студентах и преподавателе
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(teacher);

        // Формирование учебной группы
        List<Integer> studentIds = Arrays.asList(1, 2);
        StudyGroup studyGroup = controler.createStudyGroupFromIds(1, studentIds);

        // Вывод информации о группе
        System.out.println(studyGroup);
    }
}