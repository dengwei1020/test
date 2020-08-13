package com.czxy.goods.dao;

import com.czxy.goods.domain.Goods;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by dw on 2020/8/7.
 */
@org.apache.ibatis.annotations.Mapper
public interface GoodsDao extends Mapper<Goods>{
    @Select("select * from tbl_goods where goods_name=#{goodsname}")
    List<Goods> Jiangyan(@Param("goodsname") String goodsname);

    @Results({
            @Result(property ="goodsid",column ="goods_id"),
            @Result(property ="goodsname",column ="goods_name"),
            @Result(property ="goodsnumber",column ="goods_number"),
            @Result(property ="goodsprice",column ="goods_price"),
            @Result(property ="guaranteeperiod",column ="guarantee_period"),
            @Result(property ="cid",column ="cid"),
            @Result(property ="category",column ="cid",one =@One(select ="com.czxy.goods.dao.CategoryDao.selectByPrimaryKey"))
    })
    @Select("select * from tbl_goods")
    List<Goods> Goodfindall();
}
