package com.denggc3.slordemo;

import com.denggc3.entity.Product;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description: java类作用描述
 * @Author: denggc3
 * @CreateDate: 2021/4/8$ 11:38$
 * @UpdateUser: 更新者
 * @UpdateDate: 2021/4/8$ 11:38$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */

public class Test {


    public static void main(String[] args) throws Exception {
        Product product=new Product();

        String className=product.getClass().getName();
        System.out.println(className);

        Class<?> p=Class.forName(className);
        System.out.println(p.getName());
        Class<?> p1=new Product().getClass();
        System.out.println(p1.getName());
        Class<?> p2=Product.class;
        System.out.println(p2.getName());

        Class<?> pm=Class.forName(className);
        Product product1= (Product) pm.newInstance();
        product1.setId("1");
        product1.setProducttitle("dfs");

        System.out.println(product1.toString());;

        Constructor<?> constructor[]=p.getConstructors();

        Product product3= (Product) constructor[1].newInstance("1","4","2");
        System.out.println(product3.toString());
        Product product2= (Product) constructor[0].newInstance();
        System.out.println(product2.toString());

        Constructor constructor1=  p.getConstructor();
        Product product4= (Product) constructor1.newInstance();
        System.out.println(product4.toString());

    }
}
