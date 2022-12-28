package com.te.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.dto.EmployeeBatchDetailDto;
import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.entity.EmployeeBatchDetails;
//import com.te.springboot.entity.RequestList;
import com.te.springboot.response.LmsResponse;
import com.te.springboot.servicesImp.EmployeeServiceImp;

//import com.te.springboot.servicesImp.EmployeeServiceImp;
@RequestMapping(path = "/TYA")
@RestController
public class AdminController {
	@Autowired
	private EmployeeBatchDetailDto batchDetailDto;
	@Autowired
	private EmployeeServiceImp employeeServiceImp;
	@Autowired
	private LmsResponse lmsResponse;
	// Mentor Registeration
//	@PostMapping("/register")
//	public ResponseEntity<LmsResponse> register(@RequestBody PrimaryInfo primaryInfo) {
//		PrimaryInfo register = serviceImp.register(primaryInfo);
//		if (register != null) {
//			lmsResponse.setMessage("Successful");
//			lmsResponse.setData(register);
//			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.OK);
//		}else {
//			lmsResponse.setMessage("failed");
//			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);
//		}
//		
//	}

	// SearchBatch API
	@GetMapping("/searchBatch")
	public ResponseEntity<LmsResponse> searchBatchDetails(@RequestBody EmployeeBatchDetailDto batchDetailDto) {
		EmployeeBatchDetails searchbatch = employeeServiceImp.searchBatchDetails(batchDetailDto);
		if (searchbatch == null) {
//			lmsResponse.setMessage("Batch created successfully");
			lmsResponse.setStatus("200");
			lmsResponse.setData(searchbatch);
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
		} else {
			lmsResponse.setMessage("Invalid Entry");
			lmsResponse.setStatus("500");
//			lmsResponse.setData(null);
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);

		}
	}

	// BatchDetails API
	@PostMapping("/createBatch")
	public ResponseEntity<LmsResponse> createBatchDetails(@RequestBody EmployeeBatchDetails batchDetails) {
		EmployeeBatchDetails createbatch = employeeServiceImp.createBatchDetails(batchDetails);
		if (createbatch == null) {
			lmsResponse.setMessage("Batch created successfully");
			lmsResponse.setStatus("200");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
		} else {
			lmsResponse.setMessage("Invalid Entry");
			lmsResponse.setStatus("500");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/getBatch")
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

	@PutMapping("/updateBatch")
	public ResponseEntity<LmsResponse> updateBatchDetails(@RequestBody EmployeeBatchDetailDto batchDetailDto) {
		EmployeeBatchDetails updatebatch = employeeServiceImp.updateBatchDetails(batchDetailDto);
		if (updatebatch == null) {
			lmsResponse.setMessage("Batch updated successfully");
			lmsResponse.setStatus("200");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
		} else {
			lmsResponse.setMessage("Invalid Entry");
			lmsResponse.setStatus("500");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/deleteBatch")
	public ResponseEntity<LmsResponse> deleteBatchDetails(@RequestBody EmployeeBatchDetailDto batchDetailDto) {
		String deletebatch = employeeServiceImp.deleteBatchDetails(batchDetailDto);
		if (deletebatch == null) {
			lmsResponse.setMessage("Batch deleted successfully");
			lmsResponse.setStatus("200");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
		} else {
			lmsResponse.setMessage("Invalid Entry");
			lmsResponse.setStatus("500");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);
		}
	}

//Delete Employee API
	@DeleteMapping("/deleteEmployeedata")
	public ResponseEntity<LmsResponse> deleteEmployeedata(@RequestBody EmployeeDto employeeDto) {
		String employeedata = employeeServiceImp.deleteEmployeedata(employeeDto);
		if (employeedata == null) {
			lmsResponse.setMessage("Data deleted successfully");
			lmsResponse.setStatus("200");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
		} else {
			lmsResponse.setMessage("No Data Found");
			lmsResponse.setStatus("500");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);
		}

	}
}
