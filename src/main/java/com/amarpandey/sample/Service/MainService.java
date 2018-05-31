package com.amarpandey.sample.Service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.amarpandey.sample.Dao.MainDao;
import com.amarpandey.sample.utils.ResponseStatus;

@Service
public class MainService {

	@Autowired
	public MainDao mainDao;

	public HashMap<String, Object> testQuery() {

		List<String> searchData = null;
		HashMap<String, Object> responseMap = new HashMap<String, Object>();

		searchData = mainDao.searchQuery();

		if (searchData != null && searchData.size() > 0) {
			responseMap.put("successData", mainDao.searchQuery());
		} else {
			responseMap.put("error", new ResponseStatus("Something went wrong", HttpStatus.BAD_REQUEST));
		}

		return responseMap;
	}
}
