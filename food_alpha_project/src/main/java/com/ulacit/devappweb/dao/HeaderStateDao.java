package com.ulacit.devappweb.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import com.ulacit.devappweb.model.HeaderState;

public interface HeaderStateDao extends GenericDao<HeaderState, Long> {
	public List<HeaderState> findByName(String name);

}
