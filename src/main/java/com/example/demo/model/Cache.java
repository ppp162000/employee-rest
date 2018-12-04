package com.example.demo.model;


import java.util.HashMap;
import java.util.Map;

public class Cache {
    private Map<Long, Object> map = new HashMap<>();

    public void put(Long id, Object object){
        map.put(id, object);
    }

    public Object get(Long id){
        return map.get(id);
    }
}
