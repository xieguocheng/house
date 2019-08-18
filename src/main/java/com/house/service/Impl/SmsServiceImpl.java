package com.house.service.Impl;

import com.house.service.ISmsService;
import com.house.service.utils.ServiceResult;
import org.springframework.stereotype.Service;

/**
 * @Author： XO
 * @Description：
 * @Date： 2018/11/23 20:19
 */
@Service
public class SmsServiceImpl implements ISmsService {


    @Override
    public ServiceResult<String> sendSms(String telephone) {
        return null;
    }

    @Override
    public String getSmsCode(String telehone) {
        return null;
    }

    @Override
    public void remove(String telephone) {

    }
}
