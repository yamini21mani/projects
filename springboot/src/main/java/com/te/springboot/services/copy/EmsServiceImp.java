package com.te.springboot.services.copy;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.BeanUtils;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.entity.EmployeeEntity;
import com.te.springboot.repository.EmsRepository;

@Service
public class EmsServiceImp implements EmsService {
	@Autowired
	private EmsRepository emsRepository;

	@Override
	public EmployeeEntity addemployee(EmployeeEntity employeeEntity) {
		return emsRepository.save(employeeEntity);

	}

	@Override
	public EmployeeEntity removeemployee(EmployeeEntity employeeEntity) {
		EmployeeEntity employeeEntity2 = emsRepository.findById(employeeEntity.getEmpId()).orElse(null);
		if (employeeEntity2 != null) {
			emsRepository.deleteById(employeeEntity2.getEmpId());
			return employeeEntity2;
		}
		return null;
	}

	@Override
	public boolean login(EmployeeDto dto) {
		EmployeeEntity entity = new EmployeeEntity();
		BeanUtils.copyProperties(dto, entity);
		EmployeeEntity repobject = emsRepository.findById(entity.getEmpId()).orElse(null);
		if (dto.getEmpPass().equals(repobject.getEmpPass())) {
			return true;
		} else
			return false;

	}

	@Override
	public List<EmployeeEntity> seelist() {
		List<EmployeeEntity> list = emsRepository.findAll();
//		List<EmployeeDto> dtos=new ArrayList<EmployeeDto>();
		if (list != null) {
//			BeanUtils.copyProperties(list, dto);
//			for (EmployeeDto employeeDto : dtos) {
//				System.out.println("EmployeeId: "+employeeDto.getEmpId()+",EmployeeName: "+employeeDto.getEmpName()+",Employeeemail: "+employeeDto.getEmpEmail());
				return list;
			
		}
		return null;

	}

	@Override
	public boolean update(EmployeeDto dto) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(dto, employeeEntity);
		EmployeeEntity employeeEntity2 = emsRepository.findById(dto.getEmpId()).orElse(null);
		if (employeeEntity2 != null) {
			employeeEntity2.setEmpEmail(dto.getEmpEmail());
			employeeEntity2.setEmpName(dto.getEmpName());
			emsRepository.save(employeeEntity2);
			return true;
		} else
			return false;

	}

}