package xiye.mybatis.simple.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import xiye.mybatis.simple.model.SysRole;

/**
 * 使用注解
 * @author Lenovo
 *
 */
public interface RoleMapper {
	/*
	 * mybatis 3.3.0及以下版本@Results不共用，即每个方法前都要写
	 @Results({																					//等价于XML文件的<resultMap>
		@Result(property="id", column="id", id=true),							//id=true相当于<id>
		@Result(property="roleName", column="role_name"),
		@Result(property="enabled", column="enabled"),
		@Result(property="createBy", column="create_by"),
		@Result(property="createTime", column="create_time")
	})
	 * 3.3.0以上版本可以指定id，其他方法只用@ResultMap(id)即可
	 @Results(id = "roleResultMap", value = {
		@Result(property="id", column="id", id=true),
		@Result(property="roleName", column="role_name"),
		@Result(property="enabled", column="enabled"),
		@Result(property="createBy", column="create_by"),
		@Result(property="createTime", column="create_time")
	})
	@ResultMap("roleResultMap")
	*/
	
	@Select({"select * from sys_role where id = #{id}"})
	SysRole selectById(Long id);
	
	@Insert({"insert into sys_role (id, role_name, enabled, create_by, create_time)", 
				  "values (#{id}, #{roleName}, #{enabled}, #{createBy}, #{createTime, jdbcType=TIMESTAMP})"})
	int insert(SysRole role);
	
	@Insert({"insert into sys_role (role_name, enabled, create_by, create_time)", 
				  "values (#{roleName}, #{enabled}, #{createBy}, #{createTime, jdbcType=TIMESTAMP})"})
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insertAndReturnPrimaryKeyWithAutoIncrement(SysRole role);
}
