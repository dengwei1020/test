package com.czxy.goods.domain;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dw on 2020/8/7.
 * weiweishi go
 * 狗币邓老五
 */
@Data
@Table(name ="tbl_category")
public class Category {
    @Id
    private String cid;
    private String cname;
//     `cid` varchar(10) NOT NULL,
//  `cname` varchar(20) DEFAULT NULL,
}
