package com.webjava.repository.implement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.webjava.beans.BuildingBean;
import com.webjava.repository.BuildingRepository;
import com.webjava.repository.entity.BuildingEntity;

@Repository  //Danh dau cac lop la kho luu tru
public class BuildingRepositoryImplement implements BuildingRepository {
	static final String DB_URL = "jdbc:mysql://localhost:3306/estatebasic";
	static final String USER = "root";
	static final String PASS = "";

	@Override   // Ghi de
	public List<BuildingEntity> findAll(Map<String, Object> params) {

		List<BuildingEntity> buildings = new ArrayList<BuildingEntity>();
		String sql = "SELECT b.*, d.name AS districtname FROM building b JOIN district d ON b.districtid = d.id";
		String where = "WHERE 1=1 ";

		// Giả sử rằng `params` là một map chứa các điều kiện tìm kiếm
		String nameBuilding = (String) params.get("nameBuilding");
		Integer numberOfBasement = (Integer) params.get("numberOfBasement");
		String buildingType = (String) params.get("buildingType");

		if(nameBuilding != null && !nameBuilding.equals("")) {
			where += " AND b.name LIKE '%" + nameBuilding + "%'";
		}
		if(numberOfBasement != null) {
			where += " AND b.numberofbasement = " + numberOfBasement;
		}
		if(buildingType != null && !buildingType.equals("")) {
			where += " AND b.type LIKE '%" + buildingType + "%'";
		}

		sql += where;

		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);) {  // Ket noi CSDL thanh cong, tra ra mot bang DB

			while(rs.next()) {  // Hung data tu DB tra ra
				BuildingEntity buildingEntity = new BuildingEntity();
				buildingEntity.setDistrictName(rs.getString("districtname"));
				buildingEntity.setName(rs.getString("name"));
				buildingEntity.setNumberOfBasement(rs.getLong("numberofbasement"));
				buildingEntity.setStreet(rs.getString("street"));
				buildingEntity.setWard(rs.getString("ward"));
				buildingEntity.setId(rs.getLong("id"));
				buildingEntity.setRentPrice(rs.getLong("rentprice"));
				buildingEntity.setType(rs.getString("type"));  // Gán giá trị cho loại tòa nhà
				buildings.add(buildingEntity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return buildings;
	}
}
