package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	//@Select : MyBatis의 Annotation
	@Select("SELECT sysdate FROM dual")
	public String getTime();
}
