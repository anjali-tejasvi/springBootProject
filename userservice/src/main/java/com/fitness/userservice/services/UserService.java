package com.fitness.userservice.services;

import com.fitness.userservice.dto.RegisterRequest;
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.modal.User;
import com.fitness.userservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<?>  register(RegisterRequest request){

        System.out.println("------calling user service----");
        if(userRepository.existsByEmail(request.getEmail())){
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "User already exists");

            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(response);
        }
        
        User user=  new User();
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPassword(request.getPassword());

        User savedUser = userRepository.save(user);

        // Build response object
        UserResponse userResponse = new UserResponse();
        userResponse.setId(savedUser.getId());
        userResponse.setEmail(savedUser.getEmail());
        userResponse.setPassword(savedUser.getPassword());
        userResponse.setFirstName(savedUser.getFirstName());
        userResponse.setLastName(savedUser.getLastName());
        userResponse.setCreatedAt(savedUser.getCreatedAt());
        userResponse.setUpdatedAt(savedUser.getUpdatedAt());
        
        return  ResponseEntity.status(HttpStatus.CREATED)
                .body(userResponse);
    }

    public ResponseEntity<?> getUserProfile(String userId) {
        User user =  userRepository.findById(userId)
                .orElseThrow(()-> new RuntimeException("user not found"));

        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setEmail(user.getEmail());
        userResponse.setFirstName(user.getFirstName());
        userResponse.setLastName(user.getLastName());
        userResponse.setCreatedAt(user.getCreatedAt());
        userResponse.setUpdatedAt(user.getUpdatedAt());

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", "User profile fetched successfully");
        response.put("data", userResponse);

        return ResponseEntity.ok(response);
    }

    public Boolean existByUserId(String userId) {
        return  userRepository.existsById(userId);
    }
}
