package com.denggc3.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.denggc3.model.Product;
import com.denggc3.vo.ProductVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author denggc3
 * @since 2020-12-28
 */
public interface IProductService extends IService<Product> {

    /**
     * 根据vo查询
     * @param vo
     * @return
     */
    List queryProductbyvo(ProductVo vo);

}
