package com.jsondemotwo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jsondemotwo.pojo.InputJsonData;

@Repository
public interface RootDataRepo extends JpaRepository<InputJsonData, Long> {
	
	@Query("Select rdj FROM InputJsonData rdj WHERE rdj.id=:id AND rdj.status=:status")
	List<InputJsonData> findByIdAndNewStatus(Long id, String status);
}
