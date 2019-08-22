package com.neusoft.wuyemis.admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.wuyemis.admin.message.ResultMessage;
import com.neusoft.wuyemis.admin.model.UserInfoModel;
import com.neusoft.wuyemis.admin.service.IUserInfoService;

/*
 * 模块：admin
 * 操作员控制层Controller
 * @Author: 张云强
 */

@RequestMapping
@RestController(value="/userInfo")
public class UserInfoController implements IUserInfoService {
	
	
	@Autowired
	private IUserInfoService userInfoService=null;
	
	@GetMapping("/register")
	public void register(UserInfoModel userinfoModel) throws Exception {



	}

	@GetMapping("/modify")
	public void modify(UserInfoModel userinfoModel) throws Exception {
 


	}

	@GetMapping
	public void changePassword(String idString, String password) throws Exception {
		

	}

	@GetMapping
	public void changeRole(String id, String role) throws Exception {
		

	}

	@GetMapping
	public boolean validate(String id, String password) throws Exception {
		
		return false;
	}

	@GetMapping
	public void active(String id) throws Exception {
		

	}

	@GetMapping
	public void delete(UserInfoModel userinfoModel) throws Exception {
		
	}

	@GetMapping(value="/get/list")
	public List<UserInfoModel> selsetListByAll() throws Exception {
		
		return userInfoService.selsetListByAll();
	}

	@GetMapping
	public UserInfoModel getById(String id) throws Exception {
		
		return null;
	}

}