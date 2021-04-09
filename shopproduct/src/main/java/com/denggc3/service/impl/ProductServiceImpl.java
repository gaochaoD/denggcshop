package com.denggc3.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.denggc3.mapper.ProductMapper;
import com.denggc3.model.Product;
import com.denggc3.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.denggc3.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author denggc3
 * @since 2020-12-28
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {


    @Autowired
    private ProductMapper productMapper;

    @Override
    public List queryProductbyvo(ProductVo vo) {
        return productMapper.queryProductbyvo(vo);
    }
}
