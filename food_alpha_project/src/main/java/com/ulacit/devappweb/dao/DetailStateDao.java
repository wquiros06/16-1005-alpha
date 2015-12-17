package com.ulacit.devappweb.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import com.ulacit.devappweb.model.DetailState;

/**
 * @author Desarrollo
 *
 */
public interface DetailStateDao extends GenericDao<DetailState, Long> {
	/**
	 * @param name
	 * @return a list of DetailStates object
	 */
	public List<DetailState> findByName(String name);
}
