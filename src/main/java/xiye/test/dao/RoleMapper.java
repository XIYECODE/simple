package xiye.test.dao;

import java.util.List;
import xiye.test.model.Role;

public interface RoleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_role
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_role
	 * @mbggenerated
	 */
	int insert(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_role
	 * @mbggenerated
	 */
	Role selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_role
	 * @mbggenerated
	 */
	List<Role> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_role
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Role record);
}