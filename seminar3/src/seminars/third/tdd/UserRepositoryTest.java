import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    @Test
    public void testLogoutAllUsers() {
        UserRepository userRepository = new UserRepository();
        
        // Создаем пользователей
        User user1 = new User("user1", "password1", false);
        User user2 = new User("user2", "password2", false);
        User adminUser = new User("admin", "adminPassword", true);
        
        // Добавляем пользователей в репозиторий
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(adminUser);
        
        // Проверяем, что все пользователи в начале залогинены
        assertTrue(userRepository.findByName("user1"));
        assertTrue(userRepository.findByName("user2"));
        assertTrue(userRepository.findByName("admin"));
        
        // Разлогиниваем всех пользователей, кроме администраторов
        userRepository.logoutAllUsers();
        
        // Проверяем, что пользователи разлогинены (кроме администраторов)
        assertFalse(userRepository.findByName("user1"));
        assertFalse(userRepository.findByName("user2"));
        assertTrue(userRepository.findByName("admin"));
    }
}
