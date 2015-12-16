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

import com.ulacit.devappweb.dao.HeaderStateDao;
import com.ulacit.devappweb.model.HeaderState;


public class HeaderStateManagerImplTest extends BaseManagerMockTestCase {

    @InjectMocks
    private HeaderStateManagerImpl manager;

    @Mock
    private HeaderStateDao dao;

    @Test
    public void testGet() {
        log.debug("testing get...");
        //given
        final Long id = 1L;
        final HeaderState header = new HeaderState();
        given(dao.get(id)).willReturn(header);

        //when
        HeaderState result = manager.get(id);

        //then
        assertSame(header, result);
    }

    @Test
    public void testGetAll() {
        log.debug("testing getAll...");
        //given
        final List header = new ArrayList();
        given(dao.getAll()).willReturn(header);

        //when
        List result = manager.getAll();

        //then
        assertSame(header, result);
    }

    @Test
    public void testSave() {
        log.debug("testing save...");

        //given
        final HeaderState header = new HeaderState();
        // enter all required fields

        given(dao.save(header)).willReturn(header);

        //when
        manager.save(header);

        //then
        verify(dao).save(header);
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