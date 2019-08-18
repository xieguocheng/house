package com.house.web.dto;

import lombok.Data;

/**
 * Created by 瓦力.
 */
@Data
public final class QiNiuPutRet {
    public String key;
    public String hash;
    public String bucket;
    public int width;
    public int height;

}