package com.te.springboot.servicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.te.springboot.dto.AddressDto;
import com.te.springboot.dto.ContactDto;
import com.te.springboot.dto.EmployeeBatchDetailDto;
import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.dto.EmployeeMockDetailsDto;
import com.te.springboot.dto.ExperienceDto;
import com.te.springboot.dto.TechnicalDto;
import com.te.springboot.entity.AddressInfo;
import com.te.springboot.entity.ContactInfo;
import com.te.springboot.entity.EducationDetails;
import com.te.springboot.entity.EmployeeBankDetails;
import com.te.springboot.entity.EmployeeBatchDetails;
import com.te.springboot.entity.EmployeeMockDetails;
import com.te.springboot.entity.Experience_Info_Entity;
import com.te.springboot.entity.PrimaryInfo;
//import com.te.springboot.entity.RequestList;
import com.te.springboot.entity.SecondaryInfo;
import com.te.springboot.entity.TechnicalSkillsEntity;
import com.te.springboot.respository.AddressRepository;
import com.te.springboot.respository.ContactRepository;
import com.te.springboot.respository.EmployeeBatchDetailsRepository;
import com.te.springboot.respository.EmployeeMockDetailsRepository;
import com.te.springboot.respository.EmployeeRespository;
import com.te.springboot.respository.ExperienceRepository;
import com.te.springboot.respository.TechnicalRepository;
import com.te.springboot.services.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {

	// DTO objects
	@Autowired
	private EmployeeDto employeeDto;
	@Autowired
	private EmployeeMockDetails mockDetails;

	// repository objects
	@Autowired
	private EmployeeRespository repository;
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private ContactRepository contactRepository;
	@Autowired
	private TechnicalRepository technicalRepository;
	@Autowired
	private ExperienceRepository experienceRepository;
	@Autowired
	private EmployeeMockDetailsRepository mockDetailsRepository;
	@Autowired
	private EmployeeBatchDetailsRepository batchDetailsRepository;

	// entity objects
	@Autowired
	private PrimaryInfo primaryInfo;
	@Autowired
	private AddressInfo addressInfo;
	@Autowired
	private ContactInfo contactInfo;
	@Autowired
	private EducationDetails educationDetails;
	@Autowired
	private EmployeeBankDetails employeeBankDetails;
	@Autowired
	private EmployeeBatchDetails batchDetails;
	@Autowired
	private Experience_Info_Entity info_Entity;
	@Autowired
	private SecondaryInfo secondaryInfo;
	@Autowired
	private TechnicalSkillsEntity skillsEntity;

//Employee's delete API's

	@Override
	public String deleteAddress(AddressDto addressDto) {
		BeanUtils.copyProperties(addressDto, addressInfo);
		AddressInfo addresstable = addressRepository.findById(addressInfo.getsNo()).orElse(null);
		addressRepository.delete(addresstable);
		return null;
	}

	@Override
	public String deleteExperience(ExperienceDto experienceDto) {
		BeanUtils.copyProperties(experienceDto, info_Entity);
		Experience_Info_Entity experiencetable = experienceRepository.findById(info_Entity.getsNo()).orElse(null);
		experienceRepository.delete(experiencetable);
		return null;
	}

	@Override
	public String deleteTechnical(TechnicalDto technicalDto) {
		BeanUtils.copyProperties(technicalDto, skillsEntity);
		TechnicalSkillsEntity technicaltable = technicalRepository.findById(skillsEntity.getsNo()).orElse(null);
		technicalRepository.delete(technicaltable);
		return null;
	}

	@Override
	public String deleteContact(ContactDto contactDto) {
		BeanUtils.copyProperties(contactDto, contactInfo);
		ContactInfo contacttable = contactRepository.findById(contactInfo.getContactNumber()).orElse(null);
		contactRepository.delete(contacttable);
		return null;
	}

//Admin's Delete API's
	@Override
	public String deleteEmployeedata(EmployeeDto employeeDto) {
		BeanUtils.copyProperties(employeeDto, primaryInfo);
		PrimaryInfo primarytable = repository.findById(primaryInfo.getEmpId()).orElse(null);
		repository.delete(primarytable);
		return null;
	}
//Mentor's API's

	// Mock Details CRUD
	@Override
	public boolean addMockDetails(EmployeeMockDetailsDto employeeMockDetailsDto) {
		BeanUtils.copyProperties(employeeMockDetailsDto, mockDetails);
		mockDetails.setMockno(employeeMockDetailsDto.getMockno());
		mockDetails.setSno(employeeMockDetailsDto.getsNo());
		mockDetails.setPanel(employeeMockDetailsDto.getPanel());
		mockDetails.setDateAndTime(employeeMockDetailsDto.getDateAndTime());
		mockDetails.setTechnology(employeeMockDetailsDto.getTechnology());
		mockDetails.setMockRating(employeeMockDetailsDto.getMockRating());
		EmployeeMockDetails save = mockDetailsRepository.save(mockDetails);
		if (save != null) {
			return true;
		} else
			return false;
	}

	public EmployeeMockDetails getMockDetails(EmployeeMockDetailsDto employeeMockDetailsDto) {
		BeanUtils.copyProperties(employeeMockDetailsDto, mockDetails);
		EmployeeMockDetails getMockDetail = mockDetailsRepository.findById(employeeMockDetailsDto.getsNo())
				.orElse(null);
		return getMockDetail;
	}

	public String deleteMockDetails(EmployeeMockDetailsDto employeeMockDetailsDto) {
		BeanUtils.copyProperties(employeeMockDetailsDto, mockDetails);
		mockDetailsRepository.deleteById(employeeMockDetailsDto.getsNo());
		return null;
	}

	public EmployeeMockDetails updateMockDetails(EmployeeMockDetailsDto employeeMockDetailsDto) {
		BeanUtils.copyProperties(employeeMockDetailsDto, mockDetails);
		EmployeeMockDetails updateMockDetail = mockDetailsRepository.findById(employeeMockDetailsDto.getsNo())
				.orElse(null);
		if (updateMockDetail != null) {
			mockDetails.setMockno(employeeMockDetailsDto.getMockno());
			mockDetails.setDateAndTime(employeeMockDetailsDto.getDateAndTime());
			mockDetails.setPanel(employeeMockDetailsDto.getPanel());
			mockDetails.setTechnology(employeeMockDetailsDto.getTechnology());
			mockDetails.setMockRating(employeeMockDetailsDto.getMockRating());
			mockDetailsRepository.save(mockDetails);
			return mockDetails;
		}
		return null;
	}
//BatchDetails CRUD API's

	@Override
	public EmployeeBatchDetails createBatchDetails(EmployeeBatchDetails batchDetails) {
		EmployeeBatchDetails save = batchDetailsRepository.save(batchDetails);
//	 save = batchDetailsRepository.save(batchDetails);
		if (save != null)
			return save;
		else
			return null;
	}

	@Override
	public EmployeeBatchDetails getBatchDetails(EmployeeBatchDetailDto batchDetailDto) {
		BeanUtils.copyProperties(batchDetailDto, batchDetails);
		EmployeeBatchDetails getbatchdetail = batchDetailsRepository.findById(batchDetails.getEmp_batch_id())
				.orElse(null);
		return getbatchdetail;
	}

	@Override
	public EmployeeBatchDetails updateBatchDetails(EmployeeBatchDetailDto batchDetailDto) {
		BeanUtils.copyProperties(batchDetailDto, batchDetails);
		EmployeeBatchDetails updatebatch = batchDetailsRepository.findById(batchDetailDto.getEmp_batch_id())
				.orElse(null);
		if (updatebatch != null) {
			batchDetails.setEmp_batch_id(batchDetailDto.getEmp_batch_id());
			batchDetails.setEmp_batch_name(batchDetailDto.getEmp_batch_name());
			batchDetails.setEmp_mentor_name(batchDetailDto.getEmp_mentor_name());
			batchDetails.setEmp_technologies(batchDetailDto.getEmp_technologies());
			batchDetails.setEmp_start_date(batchDetailDto.getEmp_start_date());
			batchDetails.setEmp_end_date(batchDetailDto.getEmp_end_date());
			batchDetails.setEmp_action(batchDetailDto.getEmp_action());
			batchDetails.setEmp_status(batchDetails.getEmp_status());
			batchDetails.setEmp_batch_Strength(batchDetailDto.getEmp_batch_Strength());
			batchDetailsRepository.save(batchDetails);
			return batchDetails;
		}
		return null;
	}

	@Override
	public String deleteBatchDetails(EmployeeBatchDetailDto batchDetailDto) {
		BeanUtils.copyProperties(batchDetailDto, batchDetails);
		batchDetailsRepository.deleteById(batchDetailDto.getEmp_batch_id());
		return null;
	}

	@Override
	public EmployeeBatchDetails searchBatchDetails(EmployeeBatchDetailDto batchDetailDto) {
		if (batchDetailDto.getEmp_batch_id().startsWith("TYB")) {
			if (batchDetailDto.getEmp_batch_id().equals(batchDetails.getEmp_batch_id())) {
				BeanUtils.copyProperties(batchDetailDto, batchDetails);
				EmployeeBatchDetails searchbatch = batchDetailsRepository.findById(batchDetails.getEmp_batch_id())
						.orElse(null);
				if (searchbatch != null)
					return searchbatch;
				else
					return null;
			}
			return null;

		}
		return null;
	}

//Employee Create Register API
	@Override
	public PrimaryInfo register(PrimaryInfo primaryInfo) {
		return repository.save(primaryInfo);
	}

//Employee Login API
	@Override
	public PrimaryInfo login(EmployeeDto employeeDto) {
		BeanUtils.copyProperties(employeeDto, primaryInfo);
		PrimaryInfo employeedata = repository.findById(primaryInfo.getEmpId()).orElse(null);
		if (primaryInfo.getEmpId().equalsIgnoreCase(employeedata.getEmpId())) {
			if (primaryInfo.getEmpPass().equals(employeedata.getEmpPass())) {
				return employeedata;
			} else
				return null;
		}
		return null;
	}
}
