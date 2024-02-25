package com.melcam.springbootweb.controllers;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melcam.springbootweb.model.User;
import com.melcam.springbootweb.model.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/api/v1")
public class UserRestController {

    @GetMapping("/details")
    public UserDto getMethodName() {
        User user=new User("Juan","Roman");
        UserDto userDto=new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola detail en Spring boot");
        return userDto;
    }

    @GetMapping("/users")
    public List<User> userList(){
        User user=new User("Juan","Roman");
        User user2=new User("Ricardo","Rojas");
        User user3=new User("Francisco","Lopez");

        List<User>userList= Arrays.asList(user,user2,user3);

//        List<User>userList=new ArrayList<>();
//        userList.add(user);
//        userList.add(user2);
//        userList.add(user3);

        return userList;
    }
    
    @GetMapping("/details-map")
    public Map<String,Object> details(){
        User user=new User("Juan","Roman");
        Map<String,Object> body=new HashMap<>();
        body.put("title", "Hola detail en Spring boot");
        //body.put("name", "Melcam");
       // body.put("lastname", "Perez");
        body.put("user", user);
        return body;
    }

}
