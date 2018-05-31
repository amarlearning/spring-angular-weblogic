package com.amarpandey.sample.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amarpandey.sample.Rowmapper.SearchResultRowMapper;

@Transactional
@Repository
public class MainDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<String> searchQuery() {

		List<String> searchResult = null;
		final String searchSql = "(select distinct pd.plant_code,pm.plant_name,pd.plant_group_code from plant_master pm,plant_dimension pd where pd.plant_code=pm.plant_code and pm.dm_scope_sts='VALID' and is_prime ='YES')";
		
		try {
			searchResult = jdbcTemplate.queryForObject(searchSql, new SearchResultRowMapper());
		} catch (DataAccessException e) {
			e.printStackTrace();
		}

		return searchResult;
	}
}
