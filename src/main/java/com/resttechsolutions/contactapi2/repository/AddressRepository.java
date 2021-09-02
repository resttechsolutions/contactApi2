package com.resttechsolutions.contactapi2.repository;

import com.resttechsolutions.contactapi2.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
