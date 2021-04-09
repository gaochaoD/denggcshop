package com.denggc3.enums;

import lombok.Getter;

/**
 * @Description: java类作用描述
 * @Author: denggc3
 * @CreateDate: 2021/4/6$ 14:28$
 * @UpdateUser: 更新者
 * @UpdateDate: 2021/4/6$ 14:28$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */

@Getter
public enum PayEnum{


    WECHAT_PAY("1","微信"),
    UNION_PAY("2","银联"),
    ALI_PAY("3","支付宝");


    PayEnum(String code,String message){
        this.code=code;
        this.message=message;
    }

    private String code;

    private String message;

}
