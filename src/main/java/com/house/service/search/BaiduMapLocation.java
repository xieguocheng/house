package com.house.service.search;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Author： XO
 * @Description：百度位置信息
 * @Date： 2018/11/25 20:41
 */

@Data
public class BaiduMapLocation {
    // 经度
    @JsonProperty("lon")
    private double longitude;

    // 纬度
    @JsonProperty("lat")
    private double latitude;

}
