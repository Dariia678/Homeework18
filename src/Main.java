import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        // ������ ������������ �� ����������
        userRepository.addUser(new User(1, "John Doe", "john.doe@example.com"));
        userRepository.addUser(new User(2, "Jane Smith", "jane.smith@example.com"));

        // ����� ����������� �� id
        int userIdToFind = 1;
        Optional<User> userById = userRepository.findUserById(userIdToFind);
        userById.ifPresent(user -> System.out.println("User found by ID: " + user));

        // ����� ����������� �� email
        String emailToFind = "jane.smith@example.com";
        Optional<User> userByEmail = userRepository.findUserByEmail(emailToFind);
        userByEmail.ifPresent(user -> System.out.println("User found by Email: " + user));

        // ��������� ������ ��� ������������
        Optional<List<User>> allUsers = userRepository.findAllUsers();
        allUsers.ifPresent(users -> System.out.println("Total users: " + users.size()));
    }
}
