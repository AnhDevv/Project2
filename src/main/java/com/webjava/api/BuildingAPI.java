package com.webjava.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webjava.beans.BuildingBean;
import com.webjava.beans.response.BuildingResponseDTO;
import com.webjava.customExceptions.FieldRequiredException;
import com.webjava.service.BuildingService;

//@Controller
@RestController
public class BuildingAPI {
	@Autowired
	private BuildingService buildingService;   //Gọi tầng BuildingService interface

	@GetMapping(value = "/api/buildings")
	// Nhan request
	public Object getBuildings(// @RequestParam Map<String,Object> params
			@RequestParam(name = "name", required = false) String nameBuilding,
			@RequestParam(name = "numberOfBasement", required = false) Long numberOfBasement) {  //Nhận 2 request từ client
		List<BuildingResponseDTO> result = buildingService.findAll(nameBuilding, numberOfBasement);  // Kéo hai tham số từ API
		// Tra du lieu client
		return result;
	}

//     public static void validate(String name, Long districtId) throws InvalidDataException{
//    	 if(name == null || name.equals("") || districtId == null) {
//    		 throw new InvalidDataException("name or numOf is null");
//    	 }
//     }

	private void validate(BuildingBean buildingBean) // throws FieldRequiredException khong can khi su dung
														// RuntimeException
	{
		if (buildingBean.getName() == null || buildingBean.getName().equals("")
				|| buildingBean.getDistrictId() == null) {
			throw new FieldRequiredException("name of districtid is null");
		}
	}

	@RequestMapping(value = "/api/buildings", method = RequestMethod.POST)
	private Object createBuilding(@RequestBody BuildingBean buildingBean) {
//    	 try {
//			validate(buildingBean);
//		} catch (Exception e) {
//			ErrorResponseBean errorResponseBean = new ErrorResponseBean();
//			errorResponseBean.setError(e.getMessage());
//			List<String> details = new ArrayList<String>();
//			details.add("Thieu data cua name va district nhe");
//			errorResponseBean.setDetail(details);
//			return errorResponseBean;
//		}
		validate(buildingBean);
		return buildingBean;
	}

	@DeleteMapping(value = "/api/buildings/{ids}")
	private void deleteBuilding(@PathVariable List<Long> ids) {
		System.out.println(ids);
	}
}
