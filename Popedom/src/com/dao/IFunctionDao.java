package com.dao;

import java.util.List;

import com.entity.Function;

public interface IFunctionDao {
	public List<Function> getAllFunction();// ��ѯ���еĹ���

	public List<String> getAllFFunName();// ��ѯ���еĹ�������

	public List<Function> getSomeFunction(Function function);// ��ѯһЩ����

	public String getFFunNameByID(int fFunID);//ͨ�^ID��ԃ����
	
	public int getFFunIDByName(String FFunName);//ͨ�^���ֲ�ԃID
	
	public int insertFunction(Function function);//����һ������
	
	public int deleteFunctionById(int fFunID);//ɾ��һ������
	
	public int updateFunctionById(Function function);//�޸�һ������
	
	public Function getOneFFunctionByID(int fFunID);//ͨ��һ��ID��ѯһ������
	//
}
