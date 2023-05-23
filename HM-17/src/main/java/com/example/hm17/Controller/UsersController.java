package com.example.hm17.Controller;

import com.example.hm17.Model.Users;
import com.example.hm17.Service.UsersService;
import jakarta.validation.OverridesAttribute;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UsersController {
    private final UsersService usersService;


    @GetMapping("/get")
    public ResponseEntity getAlluser(){
        List<Users> userList = userservice.getAllcoffee();
        return ResponseEntity.status(200).body(userList);

}





    }
    @PostMapping("/add")
    public ResponseEntity addUsers(@Valid @RequestBody Users users, Error errors){
        if (errors.hasErrors()){
            String message=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(HttpStatus.OK).body(message);
        }
        usersService.addUsers(users);
        return ResponseEntity.status(200).body("Users added");
    }
    @PutMapping("update/{id}")
    public ResponseEntity uptadeUsers(@Valid @RequestBody Users users,@PathVariable Integer id Errors errors) {

        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
        }
        boolean isUpdate = usersService.uptadeUsers(id, users);
        if (isUpdate) {
            return ResponseEntity.status(200).body("Users update");


        }

        public ResponseEntity deleteCoffee(@Valid @PathVariable Users users){
            ResponseEntity.deleteUsers(id ,Users);
            return new ResponseEntity<>(HttpStatusCode.OK);
        }

    }
}

