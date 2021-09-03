package com.resttechsolutions.contactapi2.resource.dto;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Response {

    public Map<String, Object> response;

    public Response(){
        this.response = new HashMap<>();

        this.response.put("Date", LocalDateTime.now());
        this.response.put("Error", false);
    }
}
