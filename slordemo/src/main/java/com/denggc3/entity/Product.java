package com.denggc3.entity;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;

/**
 * @Description: java类作用描述
 * @Author: denggc3
 * @CreateDate: 2021/4/7$ 15:47$
 * @UpdateUser: 更新者
 * @UpdateDate: 2021/4/7$ 15:47$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */

@Data
public class Product {

    @Field("id")
    private String id;

    @Field("title")
    private String producttitle;

    @Field("description")
    private String productdescription;

    public Product(){

    }

    public Product(String id,String producttitle,String productdescription){
        this.id=id;
        this.producttitle=producttitle;
        this.productdescription=productdescription;
    }

    @Override
    public String toString(){
        return "id"+this.id+"title"+this.producttitle;
    }


}
