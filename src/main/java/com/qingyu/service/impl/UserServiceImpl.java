package com.qingyu.service.impl;
import javax.annotation.Resource;  
  



import org.springframework.stereotype.Service;

import com.qingyu.dao.IUserDao;
import com.qingyu.model.User;
import com.qingyu.service.IUserService;
  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private IUserDao userDao;  
    
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
}  
