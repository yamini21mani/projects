package com.te.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.entity.PrimaryInfo;
import com.te.springboot.response.LmsResponse;
import com.te.springboot.servicesImp.EmployeeServiceImp;

@RestController
public class BaseController {
	@Autowired
	private LmsResponse lmsResponse;
	@Autowired
	private PrimaryInfo primaryInfo;
	@Autowired
	private EmployeeServiceImp employeeServiceImp;

//	@RequestMapping(path = "/Admin/AdminController")
//	public ResponseEntity<LmsResponse> admin() {
//		return null;
//	}
//
//	@RequestMapping(path = "/Mentor/MentorController")
//	public ResponseEntity<LmsResponse> mentor() {
//		return null;
//	}
//
//	@RequestMapping(path = "/Employee/EmployeeController")
//	public ResponseEntity<LmsResponse> employee() {
//		return null;
//
//	}

//login API
	@PostMapping("/login")
	public ResponseEntity<LmsResponse> login(@RequestBody EmployeeDto employeeDto) {
		if (employeeDto.getEmpId().startsWith("TYA")) {
			PrimaryInfo info = employeeServiceImp.login(employeeDto);
			AdminController adminController = new AdminController();
			if (info != null) {
				lmsResponse.setMessage("Loggedin successfully");
				lmsResponse.setStatus("200");
				lmsResponse.setData(adminController);
				return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
			}
		}

		else if (employeeDto.getEmpId().startsWith("TYM")) {
			PrimaryInfo info = employeeServiceImp.login(employeeDto);
			MentorController mentorController = new MentorController();
			if (info != null) {
				lmsResponse.setMessage("Loggedin successfully");
				lmsResponse.setStatus("200");
				lmsResponse.setData(mentorController);
				return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
			}

		} else if (employeeDto.getEmpId().startsWith("TYE")) {
			PrimaryInfo info = employeeServiceImp.login(employeeDto);
			EmployeeController employeeController = new EmployeeController();
			if (info != null) {
				lmsResponse.setMessage("Loggedin successfully");
				lmsResponse.setStatus("200");
				lmsResponse.setData(employeeController);
				return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.ACCEPTED);
			}
		}

		else {
			lmsResponse.setMessage("Invalid credentials");
			lmsResponse.setStatus("404");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);

		}
		return null;
	}

//Registration API
	@PostMapping("/register")
	public ResponseEntity<LmsResponse> register(@RequestBody PrimaryInfo primaryInfo) {
		PrimaryInfo register = employeeServiceImp.register(primaryInfo);
		if (register != null) {
			lmsResponse.setMessage("Successful");
			lmsResponse.setData(register);
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.OK);
		} else {
			lmsResponse.setMessage("failed");
			return new ResponseEntity<LmsResponse>(lmsResponse, HttpStatus.BAD_REQUEST);
		}

	}
}
