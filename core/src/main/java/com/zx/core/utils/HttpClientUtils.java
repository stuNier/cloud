package com.zx.core.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zx.core.consts.EncodingType;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Title: HttpUtils
 * Description: 接口请求
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin-3@thunisoft.com
 * @version 1.0
 * date 2019/12/2 15:58
 */
@Component
public class HttpClientUtils {

    private CloseableHttpClient httpClient;

    private static final String CONTENT_TYPE = "application/json";

    HttpClientUtils(){
        httpClient = HttpClientBuilder.create().build();
    }

    /**
     * post请求
     * @param uri api访问接口
     * @param requestParams 查询参数
     * @return JSONObject
     * @throws IOException IOException
     * @author: zhengxin@thunisoft.com
     * date: 19-12-02 16:08
     * @version 1.0
     */
    public JSONObject doPost(String uri, String requestParams) throws IOException {
        HttpPost httpPost = new HttpPost(uri);
        StringEntity formEntity = new StringEntity(requestParams,EncodingType.UTF_8);
        formEntity.setContentEncoding(EncodingType.UTF_8);
        formEntity.setContentType(CONTENT_TYPE);
        httpPost.setEntity(formEntity);
        CloseableHttpResponse response = httpClient.execute(httpPost);
        HttpEntity entity = response.getEntity();
        JSONObject jsonObject = JSON.parseObject(EntityUtils.toString(entity, EncodingType.UTF_8));
        response.close();
        return jsonObject;
    }


    /**
     * gey请求
     * @param uri api访问接口
     * @return JSONObject
     * @throws IOException IOException
     * @author: zhengxin@thunisoft.com
     * date: 19-12-02 16:08
     * @version 1.0
     */
    public JSONObject doGet(String uri) throws IOException {
        HttpGet httpGet = new HttpGet(uri);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        JSONObject jsonObject = JSON.parseObject(EntityUtils.toString(entity, EncodingType.UTF_8));
        response.close();
        return jsonObject;
    }
}
