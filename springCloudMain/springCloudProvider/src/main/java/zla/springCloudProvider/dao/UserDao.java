package zla.springCloudProvider.dao;/**
 * @title: UserDao
 * @projectName springCloudMain
 * @description: TODO
 * @author ZLS
 * @date 2020/3/1212:12
 */

import org.apache.ibatis.annotations.Mapper;
import zla.springCloudapi.model.user.UserEntity;

import java.util.List;

/**
 *@Description TODO
 *@Author ZLS
 *@Date 2020/3/12 12:12
 **/
@Mapper
public interface UserDao {

    public boolean insert(UserEntity user);

    public UserEntity findById(Integer id);

    public List<UserEntity> findAll();
}
