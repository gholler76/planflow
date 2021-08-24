package com.holler.planflow.repos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.holler.planflow.models.Location;

@Repository
public interface LocationRepo extends CrudRepository<Location, Long> {

	// use SQL to select a random location from locations table
	@Query(value = "Select locid from locations where not exists (select 1 from pallets where pallets.location = locations.locid) order by rand() limit 1", nativeQuery = true)
	Long findRandomLocId();

}