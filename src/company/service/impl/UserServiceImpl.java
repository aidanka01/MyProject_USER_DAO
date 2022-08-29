package company.service.impl;

import company.MyException;
import company.dao.UserDao;
import company.model.User;
import company.service.UserService;
import java.util.List;

public class UserServiceImpl implements UserService {
   UserDao userDao = new UserDao();

   @Override
   public void addNewUser(User user) {
      List<User> users =userDao.getUsers();
      users.add(user);
   }

   @Override
   public void getById(int id) {
      try {
         User user1 = userDao.getUsers()
                 .stream()
                 .filter(user -> user.getId() == id)
                 .findFirst()
                 .orElseThrow(() -> new MyException("Oops...  we don't have such id"));
         System.out.println(user1);
      } catch (MyException e){
         System.out.println(e.getMessage());
      }
         }



   @Override
   public void removeByID(int id) {
      try {
         User user1 = userDao.getUsers()
                 .stream()
                 .filter(user -> user.getId() == id)
                 .findFirst()
                 .orElseThrow(() -> new MyException("Oops...we don't have such id for removing"));
         userDao.getUsers().remove(user1);
      } catch (MyException e){
         System.out.println(e.getMessage());
      }

   }

   @Override
   public void getAll() {
      for (User user : userDao.getUsers()) {
         System.out.println(user);
      }
   }
}
