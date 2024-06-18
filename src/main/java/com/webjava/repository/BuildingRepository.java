package com.webjava.repository;

import java.util.List;

import com.webjava.repository.entity.BuildingEntity;

public interface BuildingRepository {
    List<BuildingEntity> findAll( String nameBuilding,  Long numberOfBasement);
}
