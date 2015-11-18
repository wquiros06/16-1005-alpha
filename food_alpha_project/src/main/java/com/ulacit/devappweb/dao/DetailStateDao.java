package com.ulacit.devappweb.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import com.ulacit.devappweb.model.DetailState;

public interface DetailStateDao extends GenericDao<DetailState, Long> {
	public List<DetailState> findByName(String name);
}
