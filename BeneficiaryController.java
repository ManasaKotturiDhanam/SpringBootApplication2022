package com.webservices.rest.banking.com.dhanam.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.rest.banking.com.dhanam.entity.Baneficiary;
import com.webservices.rest.banking.com.dhanam.repos.BeneficiaryRepo;

@RestController
public class BeneficiaryController {
	@Autowired
	BeneficiaryRepo benefiaryRepo;

	@GetMapping(value = "/beneficiary/beneficiaries", produces = "application/json")
	public ResponseEntity<Map<String, Object>> retrieveBeneficiaryDetails(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {
		try {
			Pageable paging = PageRequest.of(page, size);
			Page<Baneficiary> getAllBeneficiaries = benefiaryRepo.findAll(paging);
			List<Baneficiary> beneficiaryList = getAllBeneficiaries.get().toList();
			long totalElements = getAllBeneficiaries.getTotalElements();
			System.out.println("totalElements:" + totalElements);
			beneficiaryList.forEach(System.out::println);
			Map<String, Object> response = new HashMap<>();
			response.put("beneficiarydetails", beneficiaryList);
			response.put("currentPage", getAllBeneficiaries.getNumber());
			response.put("totalItems", getAllBeneficiaries.getTotalElements());
			response.put("totalPages", getAllBeneficiaries.getTotalPages());
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		return null;

	}

}
