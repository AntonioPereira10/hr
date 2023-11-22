package com.ontimize.hr.ws.core.rest;

import com.ontimize.hr.api.core.service.ICandidateService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")

public class CandidateRestController extends ORestController {
    @Autowired
    private ICandidateService service;

    @Override
    public ICandidateService getService() {
        return this.service;
    }
}
