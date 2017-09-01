package com.example.demo.utils;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created  at 2017/9/1.
 */
public class HttpUtil {
    //http://www.weather.com.cn/data/sk/101110101.html
    private static Logger logger = LoggerFactory.getLogger(HttpUtil.class);

    public  static HttpResponse<JsonNode> getUrl(String url ) throws UnirestException {
        DateTime startTime = DateTime.now();
        HttpResponse<JsonNode> httpResponse = Unirest.get(url)
                .asJson();

        logger.info("请求接口 - 响应内容,httpStatus：{}, response：{},耗时：{} 秒",
                httpResponse.getStatus(), httpResponse.getBody(),
                (new Duration(startTime, DateTime.now()).getMillis()) / 1000d);

        return httpResponse;
    }


    protected  static HttpResponse<JsonNode> post(String apiUrl ,Map<String, Object> apiParams) throws UnirestException {
        logger.info("请求接口 - 请求参数, url：{}, params：{}", apiUrl, apiParams);
        if (apiParams == null || apiParams.isEmpty()) {
            throw new IllegalArgumentException("credit api params must be not empty!");
        }
        DateTime startTime = DateTime.now();
        HttpResponse<JsonNode> httpResponse = Unirest.post(apiUrl)
                .body(apiParams)
                .asJson();
        logger.info("请求接口 - 响应内容,httpStatus：{}, response：{},耗时：{} 秒",
                httpResponse.getStatus(), httpResponse.getBody(),
                (new Duration(startTime, DateTime.now()).getMillis()) / 1000d);
        return httpResponse;
    }
}
