package xiye.mybatis.simple.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

public class PrivilegeProvider {
	/**
	 * 方法一：SQL语句较长或者拼接情况，比较适用
	 * @param id
	 * @return
	 */
	public String selectById(final Long id) {
		return new SQL() {
			{
				SELECT("id, privilege_name, privilege_url");
				FROM("sys_privilege");
				WHERE("id = #{id}");
			}
		}.toString();
	}
	/**
	 * 方法二：简短SQL语句比较适用
	 * @param id
	 * @return
	 */
	public String selectById2(final Long id) {
		return "select id, privilege_name, privilege_url from sys_privilege where id = #{id}";
	}
}
