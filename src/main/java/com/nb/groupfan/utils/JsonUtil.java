package com.nb.groupfan.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonUtil {
    /**
     * 获取json数组中某个key的最大值，
     * @param jsonArray
     * @return
     */
    public static Double getMaxValue(JSONArray jsonArray,String key){
        Double d = 0D;
        for(int i =0;i<jsonArray.size();i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Double tmp  = jsonObject.getDouble(key);
            if(d < tmp){
                d = tmp;
            }
        }
        return d;
    }
    public static Double getMinValue(JSONArray jsonArray,String key){
        Double d = -1D;
        for(int i =0;i<jsonArray.size();i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Double tmp  = jsonObject.getDouble(key);

            if(d > tmp || d < 0){
                d = tmp;
            }
        }
        return d;
    }
}
