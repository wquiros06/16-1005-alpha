package com.ulacit.devappweb.service.impl;

import java.util.List;

import javax.jws.WebService;
import javax.transaction.Transactional;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulacit.devappweb.dao.UserFoodDao;
import com.ulacit.devappweb.dto.UserFoodDTO;
import com.ulacit.devappweb.mapper.UserFoodMapper;
import com.ulacit.devappweb.model.UserFood;
import com.ulacit.devappweb.service.UserFoodManager;

@Transactional
@Service("userFoodManager")
@WebService(serviceName = "UserFoodService", endpointInterface = "com.ulacit.devappweb.service.UserFoodManager")
public class UserFoodManagerImpl extends GenericManagerImpl<UserFood, Long> implements UserFoodManager {

	UserFoodDao dao;

	public UserFoodManagerImpl() {
	}

	/**
	 * @param dao
	 */
	@Autowired
	public UserFoodManagerImpl(UserFoodDao dao) {
		super(dao);
		this.dao = dao;
	}

	@Override
	public boolean isValidUserFood(String userName, String password) {
		boolean isValidUserFood = false;
		UserFoodDTO userFoodDTO = null;
		
		log.debug("searching user food by username: " + userName);
		
		UserFood userFood = dao.findByUserName(userName);
		userFoodDTO = UserFoodMapper.INSTANCE.userFoodtoUserFoodDTO(userFood);
		if (userFoodDTO != null) {
			log.debug("user food " + userName + " finded");
			
			if (userFoodDTO.getPassword().equals(password)) {
				if (userFoodDTO.isState()) {
					isValidUserFood = true;
					log.debug("user food " + userName + " is valid");
				}
			}
		}				 
		return isValidUserFood;
	}

	@Override
	public List<UserFoodDTO> getuserFoods() {
		List<UserFoodDTO> userFoodsDTOs = null;
		List<UserFood> userFoods = dao.getAll();

		userFoodsDTOs = UserFoodMapper.INSTANCE.userFoodstoUserFoodsDTOs(userFoods);

		return userFoodsDTOs;
	}


	@Override
	public List<UserFoodDTO> findByUserName(String rating) {
		// TODO Auto-generated method stub
		return null;
	}
}
