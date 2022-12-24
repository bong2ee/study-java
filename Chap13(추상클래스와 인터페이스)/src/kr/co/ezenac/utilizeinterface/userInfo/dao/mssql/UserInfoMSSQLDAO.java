package kr.co.ezenac.utilizeinterface.userInfo.dao.mssql;

import kr.co.ezenac.utilizeinterface.userInfo.UserInfoDTO;
import kr.co.ezenac.utilizeinterface.userInfo.dao.UserInfoDAO;

public class UserInfoMSSQLDAO implements UserInfoDAO {

	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MSSQL DB userId = " + userInfoDTO.getUserId());
		
	}

	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into MSSQL DB userId = " + userInfoDTO.getUserId());
		
	}

	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into MSSQL DB userId = " + userInfoDTO.getUserId());
		
	}

	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into MSSQL DB userId = " + userInfoDTO.getUserId());
		
	}

}
