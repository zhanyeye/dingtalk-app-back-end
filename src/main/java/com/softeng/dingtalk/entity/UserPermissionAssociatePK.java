package com.softeng.dingtalk.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author LiXiaoKang
 * @description 用户-权限实体类的联合主键
 * @date 02/02/2023
 */

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserPermissionAssociatePK implements Serializable {

    private int userId;

    private int permissionId;

    @Override
    public boolean equals(Object obj){
        if(obj instanceof UserPermissionAssociatePK){
            return userId == ((UserPermissionAssociatePK) obj).userId && permissionId == ((UserPermissionAssociatePK) obj).getPermissionId();
        }
        return false;
    }

    @Override
    public int hashCode(){
        return userId+permissionId;
    }
}
