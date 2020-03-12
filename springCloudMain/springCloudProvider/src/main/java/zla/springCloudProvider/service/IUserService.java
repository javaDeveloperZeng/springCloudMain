package zla.springCloudProvider.service;/**
 * @title: IUserService
 * @projectName springCloudMain
 * @description: TODO
 * @author ZLS
 * @date 2020/3/1212:34
 */

import zla.springCloudapi.model.user.UserEntity;

import java.util.List;

/**
 *@Description TODO
 *@Author ZLS
 *@Date 2020/3/12 12:34
 **/
public interface IUserService {

    public boolean createUser(UserEntity user);

    public UserEntity getUser(Integer id);

    public List<UserEntity> listUser();
}
