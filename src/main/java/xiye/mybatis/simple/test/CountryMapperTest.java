package xiye.mybatis.simple.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import xiye.mybatis.simple.model.Country;

public class CountryMapperTest extends BaseMapperTest {
	
	@Test
	public void testSelectAll() {
		SqlSession sqlSession = getSqlSession();
		try {
			List<Country> countryList = sqlSession.selectList("xiye.mybatis.simple.mapper.CountryMapper.selectAll");
			printCountryList(countryList);
		} finally {
			//一定要关闭sqlSession
			sqlSession.close();
		}
	}
	
	public void printCountryList(List<Country> countryList){
		for (Country country : countryList) {
			System.out.printf("%-4d%4s%4s\n", country.getId(), country.getCountryname(), country.getCountrycode());
		}
	}
}
