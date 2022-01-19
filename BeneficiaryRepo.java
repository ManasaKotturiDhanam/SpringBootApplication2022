package com.webservices.rest.banking.com.dhanam.repos;

import com.webservices.rest.banking.com.dhanam.entity.Baneficiary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BeneficiaryRepo extends PagingAndSortingRepository<Baneficiary, Integer> {
	
   Page<Baneficiary>findAll(Pageable pageable);
}
