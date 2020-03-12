package zla.springCloudapi.model.user;/**
 * @title: UserEntity
 * @projectName springCloudMain
 * @description: TODO
 * @author ZLS
 * @date 2020/3/1211:53
 */

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *@Description TODO
 *@Author ZLS
 *@Date 2020/3/12 11:53
 **/
@NoArgsConstructor
@Data
public class UserEntity implements Serializable {

    private int id;
    private String username;
    private String  db_source; //来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public UserEntity(String username){
        this.username = username;
    }
}
