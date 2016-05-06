package com.dao;

import java.util.List;

public interface IUserInfoDAO {
	public List findByUsername(Object username);
}
