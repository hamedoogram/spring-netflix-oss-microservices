package com.spring.netflix.oss.microservices.service;

/**
 * Created by HamedooGram on 2/21/18.
 */

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "card-service")
public interface CardClient extends CardService {
}
