package com.example.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDubboController {
  @Reference
  DubboService dubboService;

  @RequestMapping
  public void test(@RequestParam String pararm) {
    dubboService.testDubbo(pararm);
  }
}
