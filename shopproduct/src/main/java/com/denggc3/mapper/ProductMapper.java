package com.denggc3.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.denggc3.model.Product;
import com.denggc3.vo.ProductVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author denggc3
 * @since 2020-12-28
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

    /**
     * 查找产品细节
     * @param vo
     * @return
     */
    List<Product> queryProductbyvo(ProductVo vo);

}
