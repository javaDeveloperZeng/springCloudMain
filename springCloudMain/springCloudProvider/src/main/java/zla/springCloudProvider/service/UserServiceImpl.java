package zla.springCloudProvider.service;/**
 * @title: UserServiceImpl
 * @projectName springCloudMain
 * @description: TODO
 * @author ZLS
 * @date 2020/3/1212:34
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zla.springCloudProvider.dao.UserDao;
import zla.springCloudapi.model.user.UserEntity;

import java.util.List;

/**
 *@Description TODO
 *@Author ZLS
 *@Date 2020/3/12 12:34
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;


    @Override
    public boolean createUser(UserEntity user) {
        return userDao.insert(user);
    }

    @Override
    public UserEntity getUser(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public List<UserEntity> listUser() {
        return userDao.findAll();
    }
}

