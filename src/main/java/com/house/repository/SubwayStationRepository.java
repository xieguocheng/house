package com.house.repository;

import java.util.List;

import com.house.entity.SubwayStation;
import org.springframework.data.repository.CrudRepository;



/**
 * Created by 瓦力.
 */
public interface SubwayStationRepository extends CrudRepository<SubwayStation, Long> {
    List<SubwayStation> findAllBySubwayId(Long subwayId);
}
