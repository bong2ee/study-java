package kr.co.ezenac.userInfo.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import kr.co.ezenac.utilizeinterface.userInfo.UserInfoDTO;
import kr.co.ezenac.utilizeinterface.userInfo.dao.UserInfoDAO;
import kr.co.ezenac.utilizeinterface.userInfo.dao.mssql.UserInfoMSSQLDAO;
import kr.co.ezenac.utilizeinterface.userInfo.dao.mysql.UserInfoMySqlDAO;
import kr.co.ezenac.utilizeinterface.userInfo.dao.oracle.UserInfoOracleDAO;

public class UserInfoClient {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");		//dbType에 오라클이라는 DB타입이 저장됨
		
		UserInfoDTO userInfo = new UserInfoDTO();
		userInfo.setUserId("ezen");
		userInfo.setPassWord("0111");
		userInfo.setUserName("이젠");
		
		UserInfoDAO userInfoDAO = null;
		if(dbType.equals("ORACLE")) {
			userInfoDAO = new UserInfoOracleDAO();
		}
		else if(dbType.equals("MYSQL")) {
			userInfoDAO = new UserInfoMySqlDAO();
		}
		else if(dbType.equals("MSSQL")) {
			userInfoDAO = new UserInfoMSSQLDAO();
		}
		else {
			System.out.println("db support error");
		}
		
		userInfoDAO.insertUserInfo(userInfo);
		userInfoDAO.updateUserInfo(userInfo);
		userInfoDAO.deleteUserInfo(userInfo);
		userInfoDAO.selectUserInfo(userInfo);
		
		
		
	}
}
