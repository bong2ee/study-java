package kr.co.ezenac.utilizeinterface.userInfo.dao.oracle;

import kr.co.ezenac.utilizeinterface.userInfo.UserInfoDTO;
import kr.co.ezenac.utilizeinterface.userInfo.dao.UserInfoDAO;

public class UserInfoOracleDAO implements UserInfoDAO {

	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into ORACLE DB userId = " + userInfoDTO.getUserId());
		
	}

	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into ORACLE DB userId = " + userInfoDTO.getUserId());
		
	}

	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into ORACLE DB userId = " + userInfoDTO.getUserId());
		
	}

	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into ORACLE DB userId = " + userInfoDTO.getUserId());
		
	}
	
	 

}
