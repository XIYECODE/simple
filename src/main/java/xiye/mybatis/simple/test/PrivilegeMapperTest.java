package xiye.mybatis.simple.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import xiye.mybatis.simple.mapper.PrivilegeMapper;
import xiye.mybatis.simple.model.SysPrivilege;

public class PrivilegeMapperTest extends BaseMapperTest {
	
	@Test
	public void testSelectById() {
		SqlSession sqlSession = getSqlSession();
		try {
			PrivilegeMapper privilegeMapper = sqlSession.getMapper(PrivilegeMapper.class);
			SysPrivilege privilege = privilegeMapper.selectById(1L);
			Assert.assertNotNull(privilege);
			Assert.assertEquals("用户管理", privilege.getPrivilegeName());
			
			
			SysPrivilege privilege2 = privilegeMapper.selectById2(2L);
			Assert.assertNotNull(privilege2);
			Assert.assertEquals("角色管理", privilege2.getPrivilegeName());
		} finally {
			//一定要关闭sqlSession
			sqlSession.close();
		}
	}
}
