package com.resttechsolutions.contactapi2.repository;

import com.resttechsolutions.contactapi2.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
