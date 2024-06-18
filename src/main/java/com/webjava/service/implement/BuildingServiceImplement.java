package com.webjava.service.implement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webjava.beans.response.BuildingResponseDTO;
import com.webjava.repository.BuildingRepository;
import com.webjava.repository.entity.BuildingEntity;
import com.webjava.service.BuildingService;

@Service
public class BuildingServiceImplement implements BuildingService {

	@Autowired // Tim kiem interface BuildingRepository va inject(tiem) cac phuong thuc .Vi
				// interface khong dung de khoi tao doi tuong
	private BuildingRepository buildingRepository;

	@Override
	public List<BuildingResponseDTO> findAll(params) {
		List<BuildingEntity> buildingEntitys = buildingRepository.findAll(nameBuilding, numberOfBasement);
		List<BuildingResponseDTO> results = new ArrayList<BuildingResponseDTO>();
		for (BuildingEntity it : buildingEntitys) { // filter
			BuildingResponseDTO buildingResponseDTO = new BuildingResponseDTO();
			buildingResponseDTO.setId(it.getId());
			buildingResponseDTO.setName(it.getName());
			buildingResponseDTO.setAddress(it.getStreet() + "," + it.getWard() + "," + it.getDistrictId());
			
			results.add(buildingResponseDTO);
		}
		return results;
	}

	@Override
	public List<BuildingResponseDTO> findAll(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

}
