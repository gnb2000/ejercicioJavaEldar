package com.ejercicioJavaEldar.ejercicioJavaEldar.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="users", url="http://localhost:8081")
public interface UserServiceClient {

    @GetMapping("users/{cardHolder}")
    boolean existeUsuarioByCardHolder(@PathVariable String cardHolder);
}
