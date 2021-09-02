package com.resttechsolutions.contactapi2.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name="contact")
public class Contact extends AbstractPersistable {

    private String name;
    private String email;
    @OneToMany(mappedBy = "contact")
    private List<Phone> phones;
    @OneToMany(mappedBy = "contact")
    private List<Address> addresses;
}
