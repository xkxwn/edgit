package cn.gzsxt.dao;

import cn.gzsxt.pojo.User;

public interface UserDao {

	public void save(User user);
	
	public void delete(Integer id);
}
