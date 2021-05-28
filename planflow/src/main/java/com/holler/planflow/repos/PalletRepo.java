package com.holler.planflow.repos;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.holler.planflow.models.Pallet;

@Repository
public interface PalletRepo extends CrudRepository<Pallet, Long>{

	@Query(value="Select palletid from pallets where location is null order by rand() limit 1", nativeQuery=true)
	Long findRandomPalletId();
	
	
	@Query(value="Delete from pallets where location is not null", nativeQuery=true)
	@Modifying
	@Transactional
	void deleteStoredPallets();
	
	
}