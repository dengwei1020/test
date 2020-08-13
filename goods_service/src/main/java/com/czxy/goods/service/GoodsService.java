package com.czxy.goods.service;

import com.czxy.goods.dao.CategoryDao;
import com.czxy.goods.dao.GoodsDao;
import com.czxy.goods.domain.Category;
import com.czxy.goods.domain.Goods;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;

/**
 * Created by dw on 2020/8/7.
 */
@Service
@Transactional
public class GoodsService {
    @Resource
    private GoodsDao goodsDao;
    @Resource
    private CategoryDao categoryDao;

    public void Addgoods(Goods goods) throws ParseException {
        goodsDao.insert(goods);
    }

    public List<Category> findall() {
       return categoryDao.selectAll();
    }

    public List<Goods> Jiangyan(String goodsname) {
       return goodsDao.Jiangyan(goodsname);
    }

    public List<Goods> Goodfindall() {
       return goodsDao.Goodfindall();
    }
}
