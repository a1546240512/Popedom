package com.dao;

import java.util.List;

import com.entity.Function;

public interface IFunctionDao {
	public List<Function> getAllFunction();// 查询所有的功能

	public List<String> getAllFFunName();// 查询所有的功能名称

	public List<Function> getSomeFunction(Function function);// 查询一些功能

	public String getFFunNameByID(int fFunID);//通過ID查詢名字
	
	public int getFFunIDByName(String FFunName);//通過名字查詢ID
	
	public int insertFunction(Function function);//增加一个功能
	
	public int deleteFunctionById(int fFunID);//删除一个功能
	
	public int updateFunctionById(Function function);//修改一个功能
	
	public Function getOneFFunctionByID(int fFunID);//通过一个ID查询一个功能
	//
}
