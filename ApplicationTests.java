package com.webservices.rest.banking.com.dhanam;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.webservices.rest.banking.com.dhanam.entity.Baneficiary;
import com.webservices.rest.banking.com.dhanam.repos.BeneficiaryRepo;

@SpringBootTest
class ApplicationTests {
	
	@Autowired		 
	BeneficiaryRepo benefiaryRepo;
	
	@Test
	public void testRetrieveBeneficiary() {
		Pageable paging = PageRequest.of(0, 4);
		Iterable<Baneficiary> findAll = benefiaryRepo.findAll(paging);
		assertThat(findAll).isNotEmpty();
		
	}
	
	 }
	


