package com.young.wuxia.server.service;

import com.young.wuxia.server.domain.City;

/**
 * Created by yaobin on 2017/4/28.
 */
public interface CityService {

    City findByName(String name);
    
}
