package com.resttechsolutions.contactapi2.service.implementation;

import com.resttechsolutions.contactapi2.entity.Address;
import com.resttechsolutions.contactapi2.repository.AddressRepository;
import com.resttechsolutions.contactapi2.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService implements IService<Address,Long> {

    private Logger log = LoggerFactory.getLogger(AddressService.class);
    private AddressRepository ar;

    public AddressService(AddressRepository ar) {
        this.ar = ar;
    }

    @Override
    public Address create(Address address) {
        log.info("Address create init");

        try{
            return ar.save(address);
        } catch (Exception e){
            log.error("The address can\'t be creadted");

            e.printStackTrace();

            return new Address();
        }
    }

    @Override
    public Address findById(Long aLong) {
        log.info("Address findById init");

        try{
            return ar.findById(aLong).orElse(new Address());
        } catch (Exception e){
            log.error("The address can\'t be found");

            e.printStackTrace();

            return new Address();
        }
    }

    @Override
    public List<Address> findAll() {
        log.info("Address findAll init");

        try{
            return ar.findAll();
        } catch (Exception e){
            log.error("The address list can\'t be loaded");

            e.printStackTrace();

            return new ArrayList<Address>();
        }
    }

    @Override
    public Address update(Address address) {
        log.info("Address update init");

        try{
            return ar.save(address);
        } catch (Exception e){
            log.error("The address can\'t be updated");

            e.printStackTrace();

            return new Address();
        }
    }

    @Override
    public void delete(Long aLong) {
        log.info("Address create init");

        try{
            ar.delete(ar.findById(aLong).get());
        } catch (Exception e){
            log.error("The address can\'t be creadted");

            e.printStackTrace();
        }
    }
}
