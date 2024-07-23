package com.example.service;

import com.example.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        userList.add(new User(1, "Alan", 30, "alan@gmail.com"));
        userList.add(new User(2, "Brenda", 25, "brenda@gmail.com"));
        userList.add(new User(3, "Charles", 28, "charles@gmail.com"));
        userList.add(new User(4, "Diana", 32, "diana@gmail.com"));
        userList.add(new User(5, "Edward", 29, "edward@gmail.com"));
        userList.add(new User(6, "Fiona", 31, "fiona@gmail.com"));
        userList.add(new User(7, "George", 26, "george@gmail.com"));
        userList.add(new User(8, "Helen", 27, "helen@gmail.com"));
        userList.add(new User(9, "Ian", 34, "ian@gmail.com"));
        userList.add(new User(10, "Jane", 30, "jane@gmail.com"));


    }


    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : userList){
           if (user.getId() == id ){
               optional = Optional.of(user);
               return  optional;
            }
        }
        return  optional;
    }

    public List<User> listUser() {
        return  userList;
    }
}
