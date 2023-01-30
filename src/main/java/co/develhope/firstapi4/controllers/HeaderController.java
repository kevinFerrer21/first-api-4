package co.develhope.firstapi4.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HeaderController {

    @GetMapping("/headers")
    public String headersInfo(HttpServletRequest httpServletRequest) {
        return "port: " + httpServletRequest.getServerPort() + " name: " + httpServletRequest.getServerName();

    }
}