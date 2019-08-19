package xiye.mybatis.simple.mapper;

import org.apache.ibatis.annotations.SelectProvider;

import xiye.mybatis.simple.mapper.provider.PrivilegeProvider;
import xiye.mybatis.simple.model.SysPrivilege;

/**
 * 使用Provider注解
 * @author Lenovo
 *
 */
public interface PrivilegeMapper {
	
	@SelectProvider(type=PrivilegeProvider.class, method="selectById")
	SysPrivilege selectById(Long id);
	
	@SelectProvider(type=PrivilegeProvider.class, method="selectById2")
	SysPrivilege selectById2(Long id);
}
