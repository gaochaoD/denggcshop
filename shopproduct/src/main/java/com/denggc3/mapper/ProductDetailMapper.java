package com.denggc3.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.denggc3.model.ProductDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author denggc3
 */
@Mapper
public interface ProductDetailMapper extends BaseMapper<ProductDetail> {

    /**
     * 插入产品细节
     * @param productDetail
     * @return
     */
    int insertProductDetail(ProductDetail productDetail);

    /**
     * 查找产品细节
     * @param proudctid
     * @return
     */
    List<ProductDetail> findproductdetailbyproductid(@Param(value = "proudctid") int proudctid);
}
