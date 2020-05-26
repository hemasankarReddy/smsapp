package com.svs.cloud.smsapp.boot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class StudentController {
    @GetMapping("/student/hello")
    public String hello(){
       return "Hello" ;
    }

    @PostMapping("/siteconfig")
    public String register(@RequestBody SiteConfig siteConfig) {
        System.out.println(siteConfig.getSlicmnu());
        return "Hi " + siteConfig.getSlicmnu() + " your Registration process successfully completed";
    }
}
