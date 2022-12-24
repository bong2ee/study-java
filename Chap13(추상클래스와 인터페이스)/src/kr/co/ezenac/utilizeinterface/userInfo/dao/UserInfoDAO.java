package kr.co.ezenac.utilizeinterface.userInfo.dao;

import kr.co.ezenac.utilizeinterface.userInfo.UserInfoDTO;

public interface UserInfoDAO {
	
		void insertUserInfo(UserInfoDTO userInfoDTO);
		void updateUserInfo(UserInfoDTO userInfoDTO);
		void deleteUserInfo(UserInfoDTO userInfoDTO);
		void selectUserInfo(UserInfoDTO userInfoDTO);
}
