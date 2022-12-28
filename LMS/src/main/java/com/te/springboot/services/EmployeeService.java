	package com.te.springboot.services;
	
	import com.te.springboot.dto.AddressDto;
	import com.te.springboot.dto.ContactDto;
import com.te.springboot.dto.EmployeeBatchDetailDto;
import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.dto.EmployeeMockDetailsDto;
import com.te.springboot.dto.ExperienceDto;
	import com.te.springboot.dto.TechnicalDto;
import com.te.springboot.entity.EmployeeBatchDetails;
import com.te.springboot.entity.EmployeeMockDetails;
import com.te.springboot.entity.PrimaryInfo;
	
	public interface EmployeeService {
		// Employee login API
		public PrimaryInfo login(EmployeeDto employeeDto);
		
		//Employee register API's
		public PrimaryInfo register(PrimaryInfo primaryInfo);
		//Employee's delete api's
		public String deleteAddress(AddressDto addressDto);
		public String deleteExperience(ExperienceDto experienceDto);
		public String deleteTechnical(TechnicalDto technicalDto);
		public String deleteContact(ContactDto contactDto);
		
		//Admin's Delete Api's
		public String deleteEmployeedata(EmployeeDto employeeDto);
		//Batch API's
		public EmployeeBatchDetails createBatchDetails(EmployeeBatchDetails batchDetails);
		public EmployeeBatchDetails getBatchDetails(EmployeeBatchDetailDto batchDetailDto);
		public EmployeeBatchDetails updateBatchDetails(EmployeeBatchDetailDto batchDetailDto);
		public String deleteBatchDetails(EmployeeBatchDetailDto batchDetailDto);
		//Search Batch API's
		public EmployeeBatchDetails searchBatchDetails(EmployeeBatchDetailDto batchDetailDto);
		//Mentor API's
		//Mentor Mock Details CRUD
		public boolean addMockDetails(EmployeeMockDetailsDto employeeMockDetailsDto);
		public String deleteMockDetails(EmployeeMockDetailsDto employeeMockDetailsDto);
		public EmployeeMockDetails getMockDetails(EmployeeMockDetailsDto employeeMockDetailsDto);
		public EmployeeMockDetails updateMockDetails(EmployeeMockDetailsDto employeeMockDetailsDto);
	
		
		
	}
