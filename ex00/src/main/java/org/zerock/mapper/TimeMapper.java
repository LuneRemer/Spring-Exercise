package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	//@Select : MyBatis의 Annotation
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	//SQL 구문이 없는 이유 : XML파일을 이용해서 처리할것이기 때문임.
	public String getTime2();
}
