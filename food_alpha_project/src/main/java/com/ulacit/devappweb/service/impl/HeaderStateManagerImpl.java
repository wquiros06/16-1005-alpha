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

import com.ulacit.devappweb.dao.HeaderStateDao;
import com.ulacit.devappweb.dto.HeaderStateDTO;
import com.ulacit.devappweb.mapper.HeaderStateMapper;
import com.ulacit.devappweb.model.HeaderState;
import com.ulacit.devappweb.service.HeaderStateManager;

/**
 * @author Desarrollo
 *
 */
@Transactional
@Service("headerStateManager")
@WebService(serviceName = "HeaderStateService", endpointInterface = "com.ulacit.devappweb.service.HeaderStateManager")
public class HeaderStateManagerImpl extends GenericManagerImpl<HeaderState, Long> implements HeaderStateManager {
	HeaderStateDao dao;

	public HeaderStateManagerImpl() {
	}

	@Autowired
	public HeaderStateManagerImpl(HeaderStateDao dao) {
		super(dao);
		this.dao = dao;
	}

	@Override
	public List<HeaderStateDTO> findByName(String name) {
		List<HeaderStateDTO> headerStatesDTOs = null;
		List<HeaderState> headerStates = dao.findByName(name);

		headerStatesDTOs = HeaderStateMapper.INSTANCE.headerStatestoHeaderStatesDTOs(headerStates);

		return headerStatesDTOs;
	}

	@Override
	public List<HeaderStateDTO> getHeaderStates() {
		log.debug("STARTING getHeaderStates [HeaderStateManagerImpl]...");
		List<HeaderStateDTO> headerStatesDTOs = null;
		List<HeaderState> headerStates = dao.getAll();
		
		
		headerStatesDTOs = HeaderStateMapper.INSTANCE.headerStatestoHeaderStatesDTOs(headerStates);

		log.debug("[headerStatesDTOs]..." + headerStatesDTOs.size());
		
		return headerStatesDTOs;
	}

}
