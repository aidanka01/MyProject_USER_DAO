package company.dao;

import company.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
      private final List<User> users = new ArrayList<>();

        public List<User> getUsers() {
                return users;
        }



}