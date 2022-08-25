package company.service;

import company.model.User;

public interface UserService {
    void addNewUser(User user) ;
    void getById(int id);
    void removeByID(int id) ;
    void getAll() ;


}

