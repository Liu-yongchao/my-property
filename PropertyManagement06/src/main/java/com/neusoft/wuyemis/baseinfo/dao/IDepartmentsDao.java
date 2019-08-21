package com.neusoft.wuyemis.baseinfo.dao;
/*
 * 模块：baseinfo
 * Dao接口
 * @Author: 刘勇超
 */

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.baseinfo.model.DepartmentsModel;
@Mapper
public interface IDepartmentsDao {
	public void create(DepartmentsModel departmentsModel) throws Exception;
	public void update(DepartmentsModel departmentsModel) throws Exception;
	public void delete(DepartmentsModel departmentsModel) throws Exception;
	public List<DepartmentsModel> selectListByAll() throws Exception;

}
