package xiye.test.model;

/**
 * Database Table Remarks:
 *   权限表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_privilege
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class Privilege {

	/**
	 * 权限D id
	 * @mbggenerated
	 */
	private Long id;
	/**
	 * 权限名 privilege_name
	 * @mbggenerated
	 */
	private String privilegeName;
	/**
	 * 权限URL privilege_url
	 * @mbggenerated
	 */
	private String privilegeUrl;

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
	 * @return  the value of privilege_name
	 * @mbggenerated
	 */
	public String getPrivilegeName() {
		return privilegeName;
	}

	/**
	 * @param privilegeName  the value for privilege_name
	 * @mbggenerated
	 */
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	/**
	 * @return  the value of privilege_url
	 * @mbggenerated
	 */
	public String getPrivilegeUrl() {
		return privilegeUrl;
	}

	/**
	 * @param privilegeUrl  the value for privilege_url
	 * @mbggenerated
	 */
	public void setPrivilegeUrl(String privilegeUrl) {
		this.privilegeUrl = privilegeUrl;
	}
}