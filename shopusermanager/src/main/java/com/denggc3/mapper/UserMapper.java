package com.denggc3.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.denggc3.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author denggc3
 * @since 2020-12-24
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
