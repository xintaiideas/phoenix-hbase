package com.yks.phoenix.service;

import com.yks.phoenix.vo.Result;

import java.util.List;
import java.util.Map;

/**
 * Created by guoyichao on 20-6-10.
 */
public interface CRUDService {

    Result add();

    Result update();

    Result delete();


    List<Map<String, Object>> query();

}
