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

import com.ulacit.devappweb.dao.MenuDao;
import com.ulacit.devappweb.dto.MenuDTO;
import com.ulacit.devappweb.mapper.MenuMapper;
import com.ulacit.devappweb.model.Menu;
import com.ulacit.devappweb.service.MenuManager;

/**
 * @author Desarrollo
 *
 */
@Transactional
@Service("menuManager")
@WebService(serviceName = "MenuService", endpointInterface = "com.ulacit.devappweb.service.MenuManager")
public class MenuManagerImpl  extends GenericManagerImpl<Menu, Long> implements MenuManager {
	MenuDao dao;

	public MenuManagerImpl() {
	}

	@Autowired
	public MenuManagerImpl(MenuDao dao) {
		super(dao);
		this.dao = dao;
	}

	@Override
	public List<MenuDTO> getMenues() {
		log.debug("STARTING getMenues [MenuManagerImpl]...");
		List<MenuDTO> menuesDTOs = null;
		List<Menu> menues = dao.getAll();			
		
		menuesDTOs = MenuMapper.INSTANCE.menuestoMenuesDTOs(menues);

		log.debug("[menuesDTOs]..." + menuesDTOs.size());
		
		return menuesDTOs;
	}

}
