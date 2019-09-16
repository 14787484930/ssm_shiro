package com.demo.dao;

import com.demo.entity.UserRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserRoleDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("roleId") Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_role
     *
     * @mbg.generated
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_role
     *
     * @mbg.generated
     */
    List<UserRole> selectAll();
    
    /**
     * �����û�ID��ѯ���û�������
     * @param userId
     * @return
     */
    List<UserRole> findByUserId(Integer userId);

	int deleteByUserId(Integer userId);
}