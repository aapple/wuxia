package com.young.wuxia.server.service;

import com.young.wuxia.server.domain.City;
import com.young.wuxia.server.repository.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;


/**
 * Created by yaobin on 2017/4/28.
 */
@Service
public class CityServiceImpl implements CityService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City findByName(String name) {
        logger.info("success");
        City city = cityRepository.findByName(name);
        Assert.notNull(city, "can't find city with name " + name);
        return city;
    }
}
