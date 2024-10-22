package com.yedam.app.emp.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.yedam.app.emp.mapper.EmpMapper;
import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@Service//빈으로 가지고 있는 한개면 강제주입임 (서비스에선 빈이 등록되어야 하는거니까)
public class EmpServiceImpl implements EmpService {
	
	private EmpMapper empMapper;
	
	//@Autowired : setter 없이 생성자가 하나만 사용될 경우/ 생략 생성자 여러개면 오토와일드 쓰자
	public EmpServiceImpl(EmpMapper empMapper) {
		this.empMapper = empMapper;
	}
	@Override
	public List<EmpVO> empList() {
		// TODO Auto-generated method stub
		return empMapper.selectAllList();
	}

	@Override
	public EmpVO empInfo(EmpVO empVO) {
		// TODO Auto-generated method stub
		return empMapper.selectInfo(empVO);
	}

	@Override
	public int empInsert(EmpVO empVO) {
		return empMapper.insertInfo(empVO);
	}

	@Override // AJAX => JSON
	public Map<String, Object> empUpdate(EmpVO empVO) {
		Map<String, Object> map = new HashMap<>();
		boolean isSuccessed = false;
		int result = empMapper.updateInfo(empVO.getEmployeeId(), empVO);
		if(result == 1 ) {
			isSuccessed = true;
		}
		map.put("result", isSuccessed);
		map.put("target", empVO);
		//맵을 기반으로 값을 담으면 하나의 객체로 전환 가능 (JSON형태와 유사)
		//맵을 활용하면 값을 편리하게 전달할수 있음. 맵을 활용을 하면 제한이 없다 ajax 통해 정보를전달할떄 유용하다.
		return map;
	}

	@Override
	public Map<String, Object> empDelete(int empId) {
		Map<String, Object> map = new HashMap<>();
		int result = empMapper.deleteInfo(empId);
		if (result == 1) {
			map.put("employeeId", empId);
		}
		//딜리트가 성공하면 아이디 반환 실패하면 null 반환
		//
		return map;
	}
	
	

}
