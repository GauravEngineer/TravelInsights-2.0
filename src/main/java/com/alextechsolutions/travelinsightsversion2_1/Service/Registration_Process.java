package com.alextechsolutions.travelinsightsversion2_1.Service;

import com.alextechsolutions.travelinsightsversion2_1.Model.Users;
import com.alextechsolutions.travelinsightsversion2_1.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Registration_Process {

    @Autowired
    private UserRepo repo;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public void register(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
    }
}
