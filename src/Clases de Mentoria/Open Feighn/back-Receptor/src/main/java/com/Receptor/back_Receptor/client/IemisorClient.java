package com.Receptor.back_Receptor.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name ="ms-emisor", url = "http://localhost:8081")
public interface IemisorClient {

    @GetMapping("/emisor/msn")
    String mensaje();

}
