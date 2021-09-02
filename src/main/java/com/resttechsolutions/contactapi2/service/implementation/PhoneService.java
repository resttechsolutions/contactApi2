package com.resttechsolutions.contactapi2.service.implementation;

import com.resttechsolutions.contactapi2.entity.Phone;
import com.resttechsolutions.contactapi2.repository.PhoneRepository;
import com.resttechsolutions.contactapi2.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneService implements IService<Phone, Long> {

    private Logger log = LoggerFactory.getLogger(Phone.class);
    private PhoneRepository pr;

    public PhoneService(PhoneRepository pr) {
        this.pr = pr;
    }

    @Override
    public Phone create(Phone phone) {
        log.info("Phone create init");

        try{
            return pr.save(phone);
        } catch (Exception e){
            log.error("Phone can\'t be created");

            e.printStackTrace();

            return new Phone();
        }
    }

    @Override
    public Phone findById(Long aLong) {
        log.info("Phone findById init");

        try{
            return pr.findById(aLong).orElse(new Phone());
        } catch (Exception e){
            log.error("Phone can\'t be found");

            e.printStackTrace();

            return new Phone();
        }
    }

    @Override
    public List<Phone> findAll() {
        log.info("Phone findAll init");

        try{
            return pr.findAll();
        } catch (Exception e){
            log.error("Phone list can\'t be loaded");

            e.printStackTrace();

            return new ArrayList<Phone>();
        }
    }

    @Override
    public Phone update(Phone phone) {
        log.info("Phone update init");

        try{
            return pr.save(phone);
        } catch (Exception e){
            log.error("Phone can\'t be updated");

            e.printStackTrace();

            return new Phone();
        }
    }

    @Override
    public void delete(Long aLong) {
        log.info("Phone delete init");

        try{
            pr.delete(pr.findById(aLong).get());
        } catch (Exception e){
            log.error("Phone can\'t be deleted");

            e.printStackTrace();
        }
    }
}
