package com.denggc3.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author denggc3
 * @since 2020-12-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Mechant implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String merchantname;

    private String merchantshopname;

    private String merchantaccount;

    private String mechantpassword;

    private String mechantscope;

    /**
     * 1提交成功，2审核通过，3审核不通过
     */
    private Integer auditstatus;

    /**
     * 1,正常，2,下架
     */
    private Integer soldout;


}
