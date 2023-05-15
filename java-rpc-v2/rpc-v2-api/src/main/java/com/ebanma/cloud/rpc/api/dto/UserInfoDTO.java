package com.ebanma.cloud.rpc.api.dto;

/**
 * @author fantasy
 * @version $ Id: W, v 0.1 2023/05/15 11:04 Administrator Exp $
 */

import lombok.Data;

//@Data
public class UserInfoDTO {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
