package com.house.service;

import com.house.HouseApplicationTests;
import com.house.service.search.HouseIndexMessage;
import com.house.service.search.ISearchService;
import com.house.service.search.SearchServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

import javax.xml.ws.Action;

/**
 * @Author： XO
 * @Description：
 * @Date： 2018/11/27 19:33
 */

public class ServiceTest extends HouseApplicationTests {
    @Autowired
    private ISearchService searchService;

   @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
     @Autowired
     private KafkaTemplate kafka;


    @Test
    public void index(){
        Long houseId=17L;
        searchService.index(houseId);
    }





}
