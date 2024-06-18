package com.webjava.service;

import java.util.List;
import java.util.Map;

import com.webjava.beans.response.BuildingResponseDTO;

public interface BuildingService {
     List<BuildingResponseDTO> findAll(String nameBuilding, Long numberOfBasement);  // La mot ham abstract method

	List<BuildingResponseDTO> findAll(Map<String, Object> params);
}
