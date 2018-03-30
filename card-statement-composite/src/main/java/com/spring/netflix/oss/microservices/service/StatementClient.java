package com.spring.netflix.oss.microservices.service;

/**
 * Created by HamedooGram on 2/22/18.
 */

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "statement-service")
public interface StatementClient extends StatementService {



}
