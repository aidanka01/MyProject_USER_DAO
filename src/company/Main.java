package company;

import company.model.Gender;
import company.model.User;
import company.service.UserService;
import company.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, 23, "Aidana", Gender.FEMALE);
        User user2 = new User(2, 22, "Azema", Gender.FEMALE);
        User user3 = new User(3, 21, "Ali", Gender.MALE);

        try {
            UserService userService = new UserServiceImpl();
            System.out.println("Get by id: ");
            userService.addNewUser(user1);
            userService.addNewUser(user2);
            userService.addNewUser(user3);
            userService.getById(3);
            System.out.println("Get all: ");
            userService.getAll();
            userService.removeByID(5);
            System.out.println("After deleting by id: ");
            userService.getAll();

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
