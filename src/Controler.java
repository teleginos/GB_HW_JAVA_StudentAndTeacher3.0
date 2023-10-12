import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }

    public StudyGroup createStudyGroupFromIds(int teacherId, List<Integer> studentIds) {
        Teacher teacher = service.getTeacherById(teacherId);
        List<Student> students = service.getStudentsByIds(studentIds);
        StudyGroupService groupService = new StudyGroupService();
        return groupService.createStudyGroup(teacher, students);
    }

    public User getUserById(Type type, int id) {
        return service.getUserById(type, id);
    }

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }
}