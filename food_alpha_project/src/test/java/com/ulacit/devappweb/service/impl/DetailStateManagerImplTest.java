package com.ulacit.devappweb.service.impl;

import static org.junit.Assert.assertSame;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.appfuse.service.impl.BaseManagerMockTestCase;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.ulacit.devappweb.dao.DetailStateDao;
import com.ulacit.devappweb.model.DetailState;
import com.ulacit.devappweb.service.DetailStateManager;

public class DetailStateManagerImplTest extends BaseManagerMockTestCase {

    @InjectMocks
    private DetailStateManagerImpl manager;

    @Mock
    private DetailStateDao dao;

    @Test
    public void testGet() {
        log.debug("testing get...");
        //given
        final Long id = 1L;
        final DetailState detail = new DetailState();
        given(dao.get(id)).willReturn(detail);

        //when
        DetailState result = manager.get(id);

        //then
        assertSame(detail, result);
    }

    @Test
    public void testGetAll() {
        log.debug("testing getAll...");
        //given
        final List details = new ArrayList();
        given(dao.getAll()).willReturn(details);

        //when
        List result = manager.getAll();

        //then
        assertSame(details, result);
    }

    @Test
    public void testSave() {
        log.debug("testing save...");

        //given
        final DetailState detail = new DetailState();
        // enter all required fields

        given(dao.save(detail)).willReturn(detail);

        //when
        manager.save(detail);

        //then
        verify(dao).save(detail);
    }

    @Test
    public void testRemove() {

        log.debug("testing remove...");

        //given
        final Long id = 1L;
        willDoNothing().given(dao).remove(id);

        //when
        manager.remove(id);

        //then
        verify(dao).remove(id);
    }
    
}
