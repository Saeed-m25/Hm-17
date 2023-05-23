package com.example.hm17.Service;

import com.example.hm17.Repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;

    private final UsersRepository usersRepository;

    public List<Users> getAllCoffee() {
        return usersRepository.findAll();
    }

    public void addCoffee(Users users) {
        usersRepository.save(users);
    }

    public Boolean uptadeUsers(Integer id, Users users) {
        Users oldUsers= usersRepository.getById(id);
        if (oldUsers == null) {
            return false;
        }
        oldUsers.setName(users.getName());
        oldUsers.setCategory(users.getCategory());
        oldUsers.setPricy(users.getPricy());


        usersRepository.save(oldUsers);
        return true;

    }
    public Boolean deleteCoffee(Integer id){
        Coffee oldCoffee= coffeeRepository.getById(id);
        if (oldCoffee==null){
            return false;
        }
        coffeeRepository.delete(oldCoffee);
        return true;
    }

}

}
