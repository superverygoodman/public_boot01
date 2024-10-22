package com.yedam.app.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.app.emp.service.EmpVO;

//      com.yedam.app.**.mapper
public interface EmpMapper {
	//Mapper의 메소드는 SQL문의 실행 형태를 그대로 반영
	//전체조회
	public List<EmpVO> selectAllList();
	//단건조회
	public EmpVO selectInfo(EmpVO empVO);
	//등록
	public int insertInfo(EmpVO empVO);
	//수정                 마이바티스거임 
	public int updateInfo(@Param("id") int eid, @Param("emp") EmpVO empVO);//마이바티스 매개변수 두개인 경우 알려주기 위해 일부러 두개함
	//삭제
	public int deleteInfo(int employeeId);

}
