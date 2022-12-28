package com.te.springboot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.entity.EmployeeEntity;
import com.te.springboot.response.EmsResponse;
import com.te.springboot.services.EmsService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Controller
public class EmsController {
	@Autowired
	private EmsResponse emsResponse;
	@Autowired
	private EmsService emsService;

	@PostMapping("/addemployee")
	public ResponseEntity<EmsResponse> add(@RequestBody EmployeeEntity employeeEntity) {

		EmployeeEntity addemployee = emsService.addemployee(employeeEntity);
		if (addemployee != null) {
			emsResponse.setError(false);
			emsResponse.setMessage("registered successfully");
			emsResponse.setStatus("200");
			emsResponse.setData(Arrays.asList(employeeEntity));
			return new ResponseEntity<EmsResponse>(emsResponse, HttpStatus.OK);
		}
		return null;
	}

	@DeleteMapping("/removeemployee")
	public ResponseEntity<EmsResponse> remove(@RequestBody EmployeeEntity employeeEntity) {
		EmployeeEntity removeemployee = emsService.removeemployee(employeeEntity);
		if (removeemployee != null) {
			emsResponse.setError(true);
			emsResponse.setMessage("data deleted successfully");
			emsResponse.setStatus("200");
			return new ResponseEntity<EmsResponse>(emsResponse, HttpStatus.ACCEPTED);
		}
		return null;
	}

	@PostMapping("/login")
	public ResponseEntity<EmsResponse> login(@RequestBody EmployeeDto dto) {
		boolean logindata = emsService.login(dto);
		if (logindata) {
			emsResponse.setError(true);
			emsResponse.setMessage("Logged in successfully");
			emsResponse.setStatus("200");
			return new ResponseEntity<EmsResponse>(emsResponse, HttpStatus.ACCEPTED);
		}
		return null;
	}

	@GetMapping("/seelist")
	public ResponseEntity<EmsResponse> seelist(EmployeeEntity employeeEntity) {

		List<EmployeeEntity> seeemployee = emsService.seelist();
		if (seeemployee != null) {
			emsResponse.setError(true);
			emsResponse.setMessage("action performed");
			emsResponse.setStatus("200");
			emsResponse.setData(seeemployee);
			return new ResponseEntity<EmsResponse>(emsResponse, HttpStatus.OK);
		}
		return null;
	
	}
	@PostMapping("/update")
	public ResponseEntity<EmsResponse> update(@RequestBody EmployeeDto dto) {
		boolean updateemployee = emsService.update(dto);
		if (updateemployee) {
			emsResponse.setError(true);
			emsResponse.setMessage("updated successfully");
			emsResponse.setStatus("200");
//			emsResponse.setData(Arrays.asList(employeeEntity));
			return new ResponseEntity<EmsResponse>(emsResponse, HttpStatus.OK);
		}
		return null;

	}
}
