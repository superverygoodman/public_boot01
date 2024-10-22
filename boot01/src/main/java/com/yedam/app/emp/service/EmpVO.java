package com.yedam.app.emp.service;


import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//vo는 필드가 아니라 기능임
//@Data //해당데이터가 기본생성자가 아닌 다른생성자, 세터쓰지 말아야할때는 개별설정해줄것
//readonly 쓸때는 애 못씀
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmpVO {
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private String jobId;
	private Double salary;
	private double CommissionPct;
	private Integer managerId;
	private Integer departmentId;
}
