package com.house.service.Impl;

import com.house.entity.Role;
import com.house.entity.User;
import com.house.repository.RoleRepository;
import com.house.repository.UserRepository;
import com.house.service.IUserService;
import com.house.service.utils.ServiceResult;
import com.house.web.dto.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author： XO
 * @Description：
 * @Date： 2018/11/21 16:00
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public User findUserByName(String userName) {
        User user = userRepository.findByName(userName);
        if (user == null) {
            return null;
        }
        List<Role> roles = roleRepository.findRolesByUserId(user.getId());
        if (roles == null || roles.isEmpty()) {
            throw new DisabledException("权限非法");
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        //java8特性
        roles.forEach(role -> authorities.add(
                new SimpleGrantedAuthority("ROLE_" + role.getName())));
        user.setAuthorityList(authorities);
        return user;
    }

    @Override
    public ServiceResult<UserDTO> findById(Long userId) {
        Optional<User> optional=userRepository.findById(userId);
        User user=optional.get();
        if (user == null) {
            return ServiceResult.notFound();
        }
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return ServiceResult.of(userDTO);
    }

    @Override
    public User findUserByTelephone(String telephone) {
        return null;
    }

    @Override
    public User addUserByPhone(String telehone) {
        return null;
    }

    @Override
    public ServiceResult modifyUserProfile(String profile, String value) {
        return null;
    }


}
