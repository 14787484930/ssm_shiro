package com.demo.dao;

import com.demo.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IRoleDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_roles
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_roles
     *
     * @mbg.generated
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_roles
     *
     * @mbg.generated
     */
    Role selectByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_roles
     *
     * @mbg.generated
     */
    List<Role> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_roles
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Role record);
    
    public List<Role> findByUserId(int id);

	List<Role> findByPage(@Param("page") Integer page, @Param("rows") Integer rows);
	
	public long totalCount();
}