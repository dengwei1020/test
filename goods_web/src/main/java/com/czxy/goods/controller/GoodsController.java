package com.czxy.goods.controller;

import com.czxy.goods.domain.Category;
import com.czxy.goods.domain.Goods;
import com.czxy.goods.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dw on 2020/8/7.
 */
@Controller
@RequestMapping("/good")
public class GoodsController{
    @Resource
    private GoodsService goodsService;
    @PostMapping
    public String Addgoods(Goods goods){
        System.out.println(goods.toString());
        try {
            goodsService.Addgoods(goods);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "forward:/goods/add.jsp";
        }
        return "redirect:/goods/list.jsp";
    }

    @GetMapping
    public @ResponseBody List<Category> findall(){
       List<Category> categoryList=goodsService.findall();
       return categoryList;
    }
    @GetMapping("/jiangyan/{goodsname}")
    public @ResponseBody boolean Jiangyan(@PathVariable("goodsname") String goodsname){
       List<Goods> goods = goodsService.Jiangyan(goodsname);
        if (goods.size()==0){
           return true;
        }else {
           return false;
        }
    }
    @GetMapping("/goodsall")
    public @ResponseBody List<Goods> Goodfindall(){
        List<Goods> g=goodsService.Goodfindall();
        System.out.println(g);
        return g;
    }
}
