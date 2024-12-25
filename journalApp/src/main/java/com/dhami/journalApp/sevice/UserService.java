package com.dhami.journalApp.sevice;

import com.dhami.journalApp.entity.JournalEntry;
import com.dhami.journalApp.entity.User;
import com.dhami.journalApp.repository.JournalEntryRepo;
import com.dhami.journalApp.repository.UserRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

      @Autowired //
    private UserRepo userRepo;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

      public User saveUser(User user){
        return  userRepo.save(user);

      }

    public User savenewUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("USER"));
        return  userRepo.save(user);

    }
    public List<User> getAll(){
          return userRepo.findAll();
    }

    public Optional<User> findById(ObjectId id){
          return userRepo.findById(id);
    }

    public void deleteById(ObjectId id){
          userRepo.deleteById(id);
    }

    public User findByUserName(String userName){
          return userRepo.findByUserName(userName);
    }

    public User saveAdmin(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("USER","ADMIN"));
        return  userRepo.save(user);

    }
}
// controller ----> sevice ->>> repository

//@Component:
// Tells Spring that this is a Spring-managed component and
// can be autowired into other classes.