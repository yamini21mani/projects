package com.te.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.dto.AddressDto;
import com.te.springboot.dto.ContactDto;
import com.te.springboot.dto.ExperienceDto;
import com.te.springboot.dto.TechnicalDto;
import com.te.springboot.entity.PrimaryInfo;
import com.te.springboot.response.LmsResponse;
import com.te.springboot.servicesImp.EmployeeServiceImp;

@RequestMapping(path = "/TYE")
@RestController
@Component
public class EmployeeController {
	@Autowired
	private LmsResponse lmsResponse;
	@Autowired
	private EmployeeServiceImp employeeServiceImp;

//Employee registration API
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
//DELETE API'S

	@DeleteMapping("/deleteAddress")
	public ResponseEntity<LmsResponse> deleteAddressdata(@RequestBody AddressDto addressDto) {
		String deletedata = employeeServiceImp.deleteAddress(addressDto);
		if (deletedata == null) {
			lmsResponse.setMessage("Data deleted successfully");
			lmsResponse.setStatus("200");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
		} else {
			lmsResponse.setMessage("No Data Found");
			lmsResponse.setStatus("500");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);

		}
	}

	@DeleteMapping("/deleteExperience")
	public ResponseEntity<LmsResponse> deleteExperienceDetails(@RequestBody  ExperienceDto experienceDto) {
		String deletedata = employeeServiceImp.deleteExperience(experienceDto);
		if (deletedata == null) {
			lmsResponse.setMessage("Data deleted successfully");
			lmsResponse.setStatus("200");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
		} else {
			lmsResponse.setMessage("No Data Found");
			lmsResponse.setStatus("500");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);

		}
	}

	@DeleteMapping("/deleteTechnical")
	public ResponseEntity<LmsResponse> deleteTechnicalDetails( @RequestBody TechnicalDto technicalDto) {
		String deletedata = employeeServiceImp.deleteTechnical(technicalDto);
		if (deletedata == null) {
			lmsResponse.setMessage("Data deleted successfully");
			lmsResponse.setStatus("200");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
		} else {
			lmsResponse.setMessage("No Data Found");
			lmsResponse.setStatus("500");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);

		}
	}

	@DeleteMapping("/deleteContact")
	public ResponseEntity<LmsResponse> deleteContactDetails(@RequestBody  ContactDto contactDto) {
		String deletedata = employeeServiceImp.deleteContact(contactDto);
		if (deletedata == null) {
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
