import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private List<User> users;

    // Конструктор, який ініціалізує список користувачів
    public UserRepository() {
        this.users = new ArrayList<>();
    }

    // Метод для додавання користувача до списку
    public void addUser(User user) {
        users.add(user);
    }

    // Метод для пошуку користувача за id
    public Optional<User> findUserById(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }

    // Метод для пошуку користувача за email
    public Optional<User> findUserByEmail(String email) {
        return users.stream()
                .filter(user -> user.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }

    // Метод для отримання списку всіх користувачів
    public Optional<List<User>> findAllUsers() {
        return users.isEmpty() ? Optional.empty() : Optional.of(users);
    }
}
