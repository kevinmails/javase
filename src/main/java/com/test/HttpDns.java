package com.test;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.InMemoryDnsResolver;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.conn.SystemDefaultDnsResolver;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/20.
 */
public class HttpDns {

    public static void main(String[] args) throws IOException {

        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", PlainConnectionSocketFactory.getSocketFactory())
                .register("https", SSLConnectionSocketFactory.getSocketFactory())
                .build();
        InMemoryDnsResolver resolver = new InMemoryDnsResolver();
        resolver.add("my.host.com", InetAddress.getByName("127.0.0.1"));
        resolver.add("www.baidu.com", InetAddress.getByName("115.239.211.112"));
        resolver.add("www.bestpay.com.cn", InetAddress.getByName("116.228.151.89"));
//        SystemDefaultDnsResolver defaultDnsResolver = new SystemDefaultDnsResolver();

        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(socketFactoryRegistry, resolver);
        //set pool size
        cm.setMaxTotal(200);
        cm.setDefaultMaxPerRoute(100);
        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(cm).build();


        HttpPost poster = new HttpPost("http://my.host.com:8080/bestpay/bank/supervise/test.do");

        Map<String, String> params = new HashMap<String, String>();
        params.put("key", "kevin");
        setPostParams(poster, params);

        HttpGet getter = new HttpGet("https://www.alipay.com/");

        //time out setting
        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(5000).setConnectionRequestTimeout(1000).setSocketTimeout(5000).build();
        poster.setConfig(requestConfig);
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(getter);
            System.out.println(response);
            System.out.println(EntityUtils.toString(response.getEntity(), Charset.forName("utf-8")));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != response) {
                response.close();
            }
        }


    }

    private static void setPostParams(HttpPost poster, Map<String, String> params) {
        List<NameValuePair> pairList = new ArrayList<>(params.size());
        params.forEach((k, v) -> pairList.add(new BasicNameValuePair(k, v)));
        poster.setEntity(new UrlEncodedFormEntity(pairList, Charset.forName("UTF-8")));
    }

}
