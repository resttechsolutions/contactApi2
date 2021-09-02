package com.resttechsolutions.contactapi2.repository;

import com.resttechsolutions.contactapi2.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
