package com.resttechsolutions.contactapi2.resource;

import com.resttechsolutions.contactapi2.entity.Phone;
import com.resttechsolutions.contactapi2.resource.dto.PhoneDTO;
import com.resttechsolutions.contactapi2.resource.dto.Response;
import com.resttechsolutions.contactapi2.service.IService;
import com.resttechsolutions.contactapi2.util.GenericMapper;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phone")
public class PhoneResource {

    private IService<Phone, Long> service;
    private ModelMapper mm;

    public PhoneResource(IService<Phone, Long> service, ModelMapper mm) {
        this.service = service;
        this.mm = mm;
    }

    @GetMapping({"","/"})
    public ResponseEntity<Response> findAll(Response response){
        response.response.put("Data", GenericMapper.mapCollection(service.findAll(), PhoneDTO.class, mm));
        response.response.put("Code", HttpStatus.OK);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
