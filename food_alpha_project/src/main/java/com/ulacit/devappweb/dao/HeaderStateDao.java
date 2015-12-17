package com.ulacit.devappweb.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import com.ulacit.devappweb.model.HeaderState;

/**
 * @author Desarrollo
 *
 */
public interface HeaderStateDao extends GenericDao<HeaderState, Long> {
	/**
	 * @param name
	 * @return a list of detailStates
	 */
	public List<HeaderState> findByName(String name);

}
