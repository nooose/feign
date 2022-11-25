package com.example.feign.feign.client;

import com.example.feign.common.dto.BaseRequestInfo;
import com.example.feign.common.dto.BaseResponseInfo;
import com.example.feign.feign.config.DemoFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(
        name = "demo-client",
        url = "${feign.url.prefix}",
        configuration = DemoFeignConfig.class
)
public interface DemoFeignClient {

    @GetMapping("/get")
    ResponseEntity<BaseResponseInfo> callErrorDecoder(@RequestHeader("CustomHeaderName") String customHeader,
                                                      @RequestParam("name") String name,
                                                      @RequestParam("age") Long age);

    @PostMapping("/post")
    ResponseEntity<BaseResponseInfo> callErrorDecoder(@RequestHeader("CustomHeaderName") String customHeader,
                                                      @RequestBody BaseRequestInfo baseRequestInfo);

    @GetMapping("/error")
    ResponseEntity<BaseResponseInfo> callErrorDecoder();
}
