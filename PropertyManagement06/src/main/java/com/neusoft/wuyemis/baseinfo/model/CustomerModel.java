package com.neusoft.wuyemis.baseinfo.model;
import java.io.Serializable;
//客户表Model
import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
@Alias("Customer")
public class CustomerModel implements Serializable{
	private int CustomerNO = 0;  //客户序号
	private String CCODE = null;		//客户编码
	private String CNAME = null;		//客户名称
	private String Contact = null;		//联系人姓名
	private String CardCode = null;		//身份证号码
	private String Mobile = null;		//手机号
	private String Tel = null;		//电话
	private String Fax =null;		//传真
	private String QQ = null;		//QQ
	private String WeiXin = null;		//微信
	//@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date FeeStartDate = null;		//收费开始日期
	private Date FeeEndDate = null;		//收费截止日期
	private String CStatus = null;		//客户状态
	
	//关联的客户类型表对象
	private CustomerTypeModel customerType = null;
	
	//关联的客户-房间表类型对象列表
	private List<CustomerHomeModel> customerHomes = null;
	
	//关联的车位-客户表对象列表
	private List<ParkCustomerModel> parkCustomers =null;

}
