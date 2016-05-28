package com.service;

import java.util.List;

import com.model.Parameterinformation;


/*
 * @author 胡景霖
 *  
 * */
public interface IParameterService extends IBaseService {
	public Parameterinformation get(int id);

	public Parameterinformation getByName(String name);

	public int create(Parameterinformation parameter);

	public int update(Parameterinformation parameter);

	public int delete(int parameterID);

	public List<Parameterinformation> findAll();

	public List<Parameterinformation> getLikeName(String name);

	public Parameterinformation getParameter(String parametername);
}
