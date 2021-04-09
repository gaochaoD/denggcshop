package com.denggc3.slordemo;

import com.denggc3.entity.Product;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.processing.AbstractProcessor;
import java.io.IOException;
import java.util.*;

/**
 * @Description: java类作用描述
 * @Author: denggc3
 * @CreateDate: 2021/4/7$ 15:22$
 * @UpdateUser: 更新者
 * @UpdateDate: 2021/4/7$ 15:22$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
public class SolrUtil {

    private static final Logger logger= LoggerFactory.getLogger(SolrUtil.class);

    private static String SOLR_URL="http://39.104.49.76:8080/solr/collection1";

    private static HttpSolrServer solrServer=null;

    static {
        try {
            solrServer=new HttpSolrServer(SOLR_URL);
            solrServer.setAllowCompression(true);
            solrServer.setConnectionTimeout(3600);
            solrServer.setDefaultMaxConnectionsPerHost(10000);
            solrServer.setMaxTotalConnections(100);
        }catch (Exception e){
            logger.error("请检查tomcat服务器或端口是否开启!{}",e);
            e.printStackTrace();
        }
    }


    /**
     * 添加索引
     * @param document
     */
    public static void addIndex(SolrInputDocument document){
        try {
            solrServer.addBean(document);
            solrServer.commit();
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addIndexP(Product product){
        try {
            solrServer.addBean(product);
            solrServer.commit();
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 批量增加索引2
     *
     * @throws Exception
     */
    public static void addIndex2(Map<String, Object> mapValue) throws Exception {

        //必须先添加id
        SolrInputDocument document = new SolrInputDocument();
        Object idvalue = mapValue.get("id");
        document.addField("id", idvalue);

        if (mapValue != null) {
            Set<Map.Entry<String, Object>> entrySet = mapValue.entrySet();
            for (Map.Entry<String, Object> entry : entrySet) {

                String field = entry.getKey();
                Object value = entry.getValue();
                if ("id".equals(field)) {
                    continue;
                }
                Map<String, Object> operation = new HashMap<String, Object>();
                operation.put("set", value);
                document.addField(field, operation);
            }
        }
        UpdateResponse response = solrServer.add(document);
        solrServer.commit();

    }

    public static void main(String[] args) throws Exception {

        List list=new ArrayList<>();

        list.add(1);
        list.add("qe2");

        for (Object l:list){
            System.out.println(l);
        }

        System.out.println(list.getClass());


        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if(classStringArrayList.equals(classIntegerArrayList)){
            logger.info("泛型测试","类型相同");
        }

        if(stringArrayList instanceof ArrayList<?>){
            System.out.println("类型");
        }

/*        SolrInputDocument document = new SolrInputDocument();

        Product product=new Product();
        product.setId("2");
        product.setProducttitle("方式框架");
        product.setProductdescription("分手快乐分手快乐防溺水看到了");

        addIndexP(product);*/

/*        document.setField("id",product.getId());
        document.setField("title",product.getProducttitle());
        document.setField("description",product.getProductdescription());
        addIndex(document);*/
/*        Map<String, Object> mapValue = new HashMap<String,Object>();
        mapValue.put("id","3");
        mapValue.put("producttitle","猪肉呵呵");
        mapValue.put("productdescription","鸡肉的大哈哈");
        addIndex2(mapValue);*/

    }

}
