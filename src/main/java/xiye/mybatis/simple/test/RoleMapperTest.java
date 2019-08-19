package xiye.mybatis.simple.test;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import xiye.mybatis.simple.mapper.RoleMapper;
import xiye.mybatis.simple.model.SysRole;

public class RoleMapperTest extends BaseMapperTest {
	
	/*@Test
	public void testSelectById() {
		SqlSession sqlSession = getSqlSession();
		try {
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			SysRole role = roleMapper.selectById(1L);
			Assert.assertNotNull(role);
			Assert.assertEquals("管理员", role.getRoleName());
		} finally {
			//一定要关闭sqlSession
			sqlSession.close();
		}
	}*/
	
	@Test
	public void testInsert() {
		SqlSession sqlSession = getSqlSession();
		try {
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			
			SysRole role = new SysRole();
			role.setId(3L);
			role.setRoleName("普通用户");
			role.setEnabled(1);
			role.setCreateBy(1L);
			role.setCreateTime(new Date());
			int result = roleMapper.insert(role);
			Assert.assertEquals(1, result);
			
			SysRole role2 = new SysRole();
			role2.setRoleName("普通用户");
			role2.setEnabled(1);
			role2.setCreateBy(1L);
			role2.setCreateTime(new Date());
			int result1 = roleMapper.insertAndReturnPrimaryKeyWithAutoIncrement(role2);
			System.out.println("return id is "+role2.getId());
			Assert.assertEquals(1, result1);
		} finally {
			sqlSession.rollback();						//sqlSession默认回滚，即不会提交到数据库
			//sqlSession.commit();						//手动提交，添加数据到数据库
			//一定要关闭sqlSession
			sqlSession.close();
		}
	}
}
