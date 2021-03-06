package xiye.test.model;

/**
 * Database Table Remarks:
 *   角色权限关联表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_role_privilege
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class RolePrivilege {

	/**
	 * 角色ID role_id
	 * @mbggenerated
	 */
	private Long roleId;
	/**
	 * 权限D privilege_id
	 * @mbggenerated
	 */
	private Long privilegeId;

	/**
	 * @return  the value of role_id
	 * @mbggenerated
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId  the value for role_id
	 * @mbggenerated
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return  the value of privilege_id
	 * @mbggenerated
	 */
	public Long getPrivilegeId() {
		return privilegeId;
	}

	/**
	 * @param privilegeId  the value for privilege_id
	 * @mbggenerated
	 */
	public void setPrivilegeId(Long privilegeId) {
		this.privilegeId = privilegeId;
	}
}