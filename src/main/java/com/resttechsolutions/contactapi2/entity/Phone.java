package com.resttechsolutions.contactapi2.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name="phone")
public class Phone extends AbstractPersistable {

    private String name;
    private String number;
    @ManyToOne
    @JoinColumn(name = "contact_id", nullable = false)
    private Contact contact;
}
