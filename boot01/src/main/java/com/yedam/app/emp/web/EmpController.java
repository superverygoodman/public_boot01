package com.yedam.app.emp.web;

import org.springframework.stereotype.Controller;

import com.yedam.app.emp.service.EmpService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor//애는 파이널로 만든 필드를 생성자로 만듬
public class EmpController {
	private final EmpService empSercice;
	
}
