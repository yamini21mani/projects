package com.te.springboot.dto;

import org.springframework.stereotype.Component;

@Component
public class ExperienceDto {
private int sNo;

public int getsNo() {
	return sNo;
}

public void setsNo(int sNo) {
	this.sNo = sNo;
}
}
