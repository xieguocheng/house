package com.house.service.utils;

import lombok.Data;

import java.util.List;

/**
 * 通用多结果Service返回结构
 * Created by 瓦力.
 */
@Data
public class ServiceMultiResult<T> {
    private long total;
    private List<T> result;

    public ServiceMultiResult(long total, List<T> result) {
        this.total = total;
        this.result = result;
    }

    public int getResultSize() {
        if (this.result == null) {
            return 0;
        }
        return this.result.size();
    }
}
