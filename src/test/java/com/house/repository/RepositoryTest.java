package com.house.repository;

import com.house.HouseApplicationTests;
import com.house.entity.HouseTag;
import com.house.entity.User;
import com.house.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public class RepositoryTest extends HouseApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    IUserService userService;
    @Autowired
    private  HouseTagRepository houseTagRepository;

    @Test
    public void test (){
       /* User user=new User();
        user.setName("amdinn");
        user.setPassword(new BCryptPasswordEncoder().encode("123456"));
        user.setCreateTime(new Date());
        user.setLastLoginTime(new Date());
        user.setLastUpdateTime(new Date());
        user.setPhoneNumber("1212");
        user.setEmail("afsfds");
        user.setAvatar("asfdfa");
        userRepository.save(user);*/

        /*Boolean b=new BCryptPasswordEncoder().
                matches("123456",userRepository.findByName("aaa").getPassword());
        System.out.println(b);*/
        List<HouseTag> tags = houseTagRepository.findAllByHouseId(27L);
        tags.forEach(tag-> System.out.println(tag.toString()));
    }

}