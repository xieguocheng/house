package com.house.web.dto;

import lombok.Data;

/**
 * Created by 瓦力.
 */
@Data
public class UserDTO {
    private Long id;
    private String name;
    private String avatar;
    private String phoneNumber;
    private String lastLoginTime;

}