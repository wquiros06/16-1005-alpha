package com.ulacit.devappweb.dao;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ulacit.devappweb.model.DetailState;

import static org.junit.Assert.*;

public class DetailStateDaoTest extends BaseDaoTestCase {
    @Autowired
    private DetailStateDao detailStateDao;

    @Test
    public void testFindDetailsByName() throws Exception {
        List<DetailState> details = detailStateDao.findByName("Activo");
        assertTrue(details.size() > 0);
    }
    

}
