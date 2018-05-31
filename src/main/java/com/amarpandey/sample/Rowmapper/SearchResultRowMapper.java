package com.amarpandey.sample.Rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

public class SearchResultRowMapper implements RowMapper<List<String>> {

	@Override
	public List<String> mapRow(ResultSet rs, int rowCount) throws SQLException {

		List<String> searchList = new ArrayList<String>();

		do {

			searchList.add(rs.getString(1));

		} while (rs.next());

		return searchList;
	}

}
