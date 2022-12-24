package kr.co.ezenac.utilizeinterface.userInfo.dao.mysql;

import kr.co.ezenac.utilizeinterface.userInfo.UserInfoDTO;
import kr.co.ezenac.utilizeinterface.userInfo.dao.UserInfoDAO;

public class UserInfoMySqlDAO implements UserInfoDAO {

	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MySQL DB userId = " + userInfoDTO.getUserId());
		
	}

	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into MySQL DB userId = " + userInfoDTO.getUserId());
		
	}

	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into MySQL DB userId = " + userInfoDTO.getUserId());
		
	}

	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into MySQL DB userId = " + userInfoDTO.getUserId());
		
	}

}
