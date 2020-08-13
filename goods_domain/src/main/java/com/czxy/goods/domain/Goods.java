package com.czxy.goods.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dw on 2020/8/7.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="tbl_goods")
public class Goods {
    @Id
    @Column(name ="goods_id")
    private Integer goodsid;
    @Column(name ="goods_name")
    private String goodsname;
    @Column(name ="goods_number")
    private Integer goodsnumber;
    @Column(name ="goods_price")
    private Double goodsprice;
    @Column(name ="guarantee_period")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String guaranteeperiod;
    private String cid;
    private Category category;
//     `goods_id` int(10) NOT NULL AUTO_INCREMENT,
//  `goods_name` varchar(20) DEFAULT NULL,
//  `goods_number` int(10) DEFAULT NULL,
//  `goods_price` double DEFAULT NULL,
//            `guarantee_period` date DEFAULT NULL COMMENT '保质期',
//            `cid` varchar(10) DEFAULT NULL COMMENT '所属分类ID',
    public String getGuaranteeperiod() {
        return guaranteeperiod;
    }
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setGuaranteeperiod(String guaranteeperiod) {
        this.guaranteeperiod = guaranteeperiod;
    }
}
