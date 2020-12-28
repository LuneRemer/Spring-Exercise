package org.zerock.persistence;

import static org.junit.Assert.fail;

//Libraries for Connection Test
import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection(){
		try(Connection con = 
				DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:XE", // jdbc:oracle:thin:@접속이름:포트:SID
						"book_ex", // User Name
						"book_ex")){ // Password
			
			log.info(con);
		} catch(Exception e) {
			fail(e.getMessage());
		}
	}
}
