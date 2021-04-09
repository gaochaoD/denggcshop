/*
package com.denggc3.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

*/
/**
 * <p>
 *
 * </p>
 *
 * @author denggc3
 * @since 2020-12-25
 *//*

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Producttype implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String producttypename;

    private String producttypedescription;

    */
/**
     * 等级比如1,2,3 1是最大的分类
     *//*

    private Integer typegrade;

    private Integer parentid;


}
*/
