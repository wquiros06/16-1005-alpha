/**
 * 
 */
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

import com.ulacit.devappweb.dao.ContactDao;
import com.ulacit.devappweb.model.Contact;
import com.ulacit.devappweb.service.ContactManager;

/**
 * @author Desarrollo
 *
 */
public class ContactManagerImplTest extends BaseManagerMockTestCase {

    @InjectMocks
    private ContactManagerImpl manager;

    @Mock
    private ContactDao dao;

    @Test
    public void testGetContact() {
        log.debug("testing get...");
        //given
        final Long id = 1L;
        final Contact contact = new Contact();
        given(dao.get(id)).willReturn(contact);

        //when
        Contact result = manager.get(id);

        //then
        assertSame(contact, result);
    }

    @Test
    public void testGetContacts() {
        log.debug("testing getAll...");
        //given
        final List contacts = new ArrayList();
        given(dao.getAll()).willReturn(contacts);

        //when
        List result = manager.getAll();

        //then
        assertSame(contacts, result);
    }

    @Test
    public void testSaveContact() {
        log.debug("testing save...");

        //given
        final Contact contact = new Contact();
        // enter all required fields

        given(dao.save(contact)).willReturn(contact);

        //when
        manager.save(contact);

        //then
        verify(dao).save(contact);
    }

    @Test
    public void testRemoveContact() {

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
