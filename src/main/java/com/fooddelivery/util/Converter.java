package com.fooddelivery.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.GsonBuilder;

public class Converter {

    public static Object stringToObject(String strObject,Class<?> classObj) throws JsonProcessingException {
        return new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create().fromJson(strObject,classObj);

    }

}
