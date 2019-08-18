package com.house.service.search;

import lombok.Data;

@Data
public class HouseSuggest {
    private String input;
    private int weight = 10; // 默认权重

}
