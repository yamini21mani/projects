package com.te.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.dto.EmployeeBatchDetailDto;
import com.te.springboot.dto.EmployeeMockDetailsDto;
import com.te.springboot.entity.EmployeeBatchDetails;
import com.te.springboot.entity.EmployeeMockDetails;
import com.te.springboot.response.LmsResponse;
import com.te.springboot.servicesImp.EmployeeServiceImp;

@RequestMapping(path = "/MentorController")
@RestController
public class MentorController {
	@Autowired
	private LmsResponse lmsResponse;
	@Autowired
	private EmployeeServiceImp employeeServiceImp;
	
	
	//getBatchDetails API
	@GetMapping("/getBatchDetails")
	public ResponseEntity<LmsResponse> getBatchDetails(@RequestBody EmployeeBatchDetailDto batchDetailDto) {
		EmployeeBatchDetails getbatch = employeeServiceImp.getBatchDetails(batchDetailDto);
		if (getbatch == null) {
			lmsResponse.setMessage("Batch retrieved successfully");
			lmsResponse.setStatus("200");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
		} else {
			lmsResponse.setMessage("Invalid Entry");
			lmsResponse.setStatus("500");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);
		}
	}

//CreateMockdetails API
	@PostMapping("/createMockDetails")
	public ResponseEntity<LmsResponse> createMockData( @RequestBody EmployeeMockDetailsDto employeeMockDetailsDto) {
		boolean addMock = employeeServiceImp.addMockDetails(employeeMockDetailsDto);
		if (addMock == true) {
			lmsResponse.setMessage("Mock details added successfully");
			lmsResponse.setStatus("200");
			lmsResponse.setError("No error");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
		} else {
			lmsResponse.setMessage("Invalid Entry");
			lmsResponse.setStatus("404");
			lmsResponse.setError("Error found");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);

		}
	}
//deleteMockdetails API
	@DeleteMapping("/deleteMockDetails")
	public ResponseEntity<LmsResponse> deleteMockData(@RequestBody EmployeeMockDetailsDto employeeMockDetailsDto) {
		String deletemockdetail = employeeServiceImp.deleteMockDetails(employeeMockDetailsDto);
		if (deletemockdetail==null) {
			lmsResponse.setMessage("Mock details deleted successfully");
			lmsResponse.setStatus("200");
			lmsResponse.setError("No error");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
		} else {
			lmsResponse.setMessage("No data Found");
			lmsResponse.setStatus("404");
			lmsResponse.setError("Error found");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);

		}
	}
	
//getMockDetails API
	@GetMapping("/getMockDetails")
	public ResponseEntity<LmsResponse> getMockData(@RequestBody  EmployeeMockDetailsDto employeeMockDetailsDto) {
		EmployeeMockDetails getMockdetail = employeeServiceImp.getMockDetails(employeeMockDetailsDto);
		if (getMockdetail!=null) {
			lmsResponse.setMessage("Mock details retrieved successfully");
			lmsResponse.setStatus("200");
			lmsResponse.setError("No error");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
		} else {
			lmsResponse.setMessage("Invalid Entry");
			lmsResponse.setStatus("404");
			lmsResponse.setError("Error found");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);

		}
	}
//UpdateMockDetails API
	@PostMapping("/updateMockDetails")
	public ResponseEntity<LmsResponse> updateMockData(@RequestBody EmployeeMockDetailsDto employeeMockDetailsDto) {
		EmployeeMockDetails updateMockdetail = employeeServiceImp.updateMockDetails(employeeMockDetailsDto);
		if (updateMockdetail!=null) {
			lmsResponse.setMessage("Mock details updated successfully");
			lmsResponse.setStatus("200");
			lmsResponse.setError("No error");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
		} else {
			lmsResponse.setMessage("Invalid Entry");
			lmsResponse.setStatus("404");
			lmsResponse.setError("Error found");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);

		}
	}
}
