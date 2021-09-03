package com.resttechsolutions.contactapi2.resource.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.resttechsolutions.contactapi2.entity.Contact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String number;
    @JsonManagedReference
    private Contact contact;
}
