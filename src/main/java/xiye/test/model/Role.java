package xiye.test.model;

import java.util.Date;
import java.util.List;

/**
 * Database Table Remarks:
 *   角色表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_role
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class Role {

	/**
	 * 角色ID id
	 * @mbggenerated
	 */
	private Long id;
	/**
	 * 角色名 role_name
	 * @mbggenerated
	 */
	private String roleName;
	/**
	 * 有效标志 enabled
	 * @mbggenerated
	 */
	private Integer enabled;
	/**
	 * 创建人 create_by
	 * @mbggenerated
	 */
	private Long createBy;
	/**
	 * 创建时间 create_time
	 * @mbggenerated
	 */
	private Date createTime;

	/**
	 * @return  the value of id
	 * @mbggenerated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id  the value for id
	 * @mbggenerated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return  the value of role_name
	 * @mbggenerated
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName  the value for role_name
	 * @mbggenerated
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return  the value of enabled
	 * @mbggenerated
	 */
	public Integer getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled  the value for enabled
	 * @mbggenerated
	 */
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return  the value of create_by
	 * @mbggenerated
	 */
	public Long getCreateBy() {
		return createBy;
	}

	/**
	 * @param createBy  the value for create_by
	 * @mbggenerated
	 */
	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	/**
	 * @return  the value of create_time
	 * @mbggenerated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime  the value for create_time
	 * @mbggenerated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 权限列表
	 */
	private List<Privilege> privileges;

	public List<Privilege> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}
}