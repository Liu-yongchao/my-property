package com.neusoft.wuyemis.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.neusoft.wuyemis.admin.dao.IUserInfoDao;
import com.neusoft.wuyemis.admin.model.UserInfoModel;
import com.neusoft.wuyemis.admin.service.IUserInfoService;
/*
 * 模块：admin
 * UserInfo的业务实现类
 * @Author: 张云强
 */
@Service
@Transactional
public class UserInfoServiceImpl implements IUserInfoService {
    
	//取得UserInfo的Dao接口对象
	@Autowired
	private IUserInfoDao  userInfoDao=null;
	
	@Override
	public void register(UserInfoModel userinfoModel) throws Exception {
		userInfoDao.create(userinfoModel);

	}

	@Override
	public void modify(UserInfoModel userinfoModel) throws Exception {
		userInfoDao.update(userinfoModel);

	}

	@Override
	public void changePassword(String idString, String password) throws Exception {
		
	}

	@Override
	public void changeRole(String id, String role) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean validate(String id, String password) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void active(String id) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(UserInfoModel userinfoModel) throws Exception {
		userInfoDao.delete(userinfoModel);
	}

	@Override
	public List<UserInfoModel> selsetListByAll() throws Exception {
		
		return userInfoDao.selectListByAll();
	}

	@Override
	public UserInfoModel getById(String id) throws Exception {
		
		return userInfoDao.selectListById(id);
	}

}
