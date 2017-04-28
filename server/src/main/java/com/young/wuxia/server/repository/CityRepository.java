package com.young.wuxia.server.repository;

import com.young.wuxia.server.domain.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yaobin on 2017/4/28.
 */

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

    City findByName(String name);
}
