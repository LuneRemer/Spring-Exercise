package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

//@Component 표시가 있는 것들만 인스턴스 생성(root-context에서 base package)
@Component

//Lombok을 이용해서 여러 메서드가 만들어짐.(getter, setter, onMethod_, 등등)
@Data

public class Restaurant {
	
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
	
}
