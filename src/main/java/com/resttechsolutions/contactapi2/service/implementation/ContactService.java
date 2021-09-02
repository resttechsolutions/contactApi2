package com.resttechsolutions.contactapi2.service.implementation;

import com.resttechsolutions.contactapi2.entity.Contact;
import com.resttechsolutions.contactapi2.repository.ContactRepository;
import com.resttechsolutions.contactapi2.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService implements IService<Contact, Long> {

    private Logger log = LoggerFactory.getLogger(ContactService.class);
    private ContactRepository cr;

    public ContactService(ContactRepository cr) {
        this.cr = cr;
    }

    public Contact create(Contact contact) {
        log.info("Contact create init");

        try{
            return cr.save(contact);
        } catch (Exception e) {
            log.error("The contact can\'t be created");

            e.printStackTrace();

            return new Contact();
        }

    }

    @Override
    public Contact findById(Long aLong) {
        log.info("Contact findById init");

        try{
            return cr.findById(aLong).orElse(new Contact());
        } catch (Exception e) {
            log.error("The contact can\'t be found");

            e.printStackTrace();

            return new Contact();
        }
    }

    @Override
    public List<Contact> findAll() {
        log.info("Contact findAll init");

        try{
            return cr.findAll();
        } catch (Exception e) {
            log.error("The contact list can\'t be loaded");

            e.printStackTrace();

            return new ArrayList<Contact>();
        }
    }

    @Override
    public Contact update(Contact contact) {
        log.info("Contact update init");

        try{
            return cr.save(contact);
        } catch (Exception e) {
            log.error("The contact can\'t be updated");

            e.printStackTrace();

            return new Contact();
        }
    }

    @Override
    public void delete(Long aLong) {
        log.info("Contact delete init");

        try{
            cr.delete(cr.findById(aLong).get());
        } catch (Exception e) {
            log.error("The contact can\'t be deleted");

            e.printStackTrace();
        }
    }
}
