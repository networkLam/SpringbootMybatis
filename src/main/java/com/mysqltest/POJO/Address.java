package com.mysqltest.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private int addId;
    private String address;
    private String phone;
    private String contacts; //联系人
    private int uid;
    private int display;
}
