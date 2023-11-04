package com.easy.car_rental.service;

import com.easy.car_rental.dto.CarDTO;
import com.easy.car_rental.dto.DriverDTO;
import com.easy.car_rental.dto.Reg_UserDTO;
import com.easy.car_rental.dto.UserDTO;
import com.easy.car_rental.enums.RoleType;
import com.easy.car_rental.repo.AdminRepo;
import com.easy.car_rental.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;


public interface UserService {
    ArrayList<UserDTO> getAllRegUsers();

    UserDTO getRegUsers(String username,String password);

}
