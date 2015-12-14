/**
 * 
 */
package com.ulacit.devappweb.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulacit.devappweb.dao.DetailStateDao;
import com.ulacit.devappweb.dto.DetailStateDTO;
import com.ulacit.devappweb.mapper.DetailStateMapper;
import com.ulacit.devappweb.model.DetailState;
import com.ulacit.devappweb.service.DetailStateManager;


/**
 * @author Desarrollo
 *
 */
@Transactional
@Service("detailStateManager")
@WebService(serviceName = "DetailStateService", endpointInterface = "com.ulacit.devappweb.service.DetailStateManager")
public class DetailStateManagerImpl extends GenericManagerImpl<DetailState, Long> implements DetailStateManager {
	DetailStateDao dao;

	public DetailStateManagerImpl() {
	}

	@Autowired
	public DetailStateManagerImpl(DetailStateDao dao) {
		super(dao);
		this.dao = dao;
	}

	@Override
	public List<DetailStateDTO> findByName(String name) {
		List<DetailStateDTO> detailStatesDTOs = null;
		List<DetailState> detailStates = dao.findByName(name);	

		detailStatesDTOs = DetailStateMapper.INSTANCE.detailStatestoDetailStatesDTOs(detailStates);

		return detailStatesDTOs;
	}

	@Override
	public List<DetailStateDTO> getDetailStates() {
		log.debug("STARTING getDetailStates [DetailStateManagerImpl]...");
		List<DetailStateDTO> detailStatesDTOs = null;
		List<DetailState> detailStates = dao.getAll();			
		
		detailStatesDTOs = DetailStateMapper.INSTANCE.detailStatestoDetailStatesDTOs(detailStates);

		log.debug("[detailStatesDTOs]..." + detailStatesDTOs.size());
		
		return detailStatesDTOs;
	}
}
