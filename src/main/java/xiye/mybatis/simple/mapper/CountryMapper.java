package xiye.mybatis.simple.mapper;

import java.util.List;

import xiye.mybatis.simple.model.Country;

public interface CountryMapper {
	List<Country> selectAll();
}
