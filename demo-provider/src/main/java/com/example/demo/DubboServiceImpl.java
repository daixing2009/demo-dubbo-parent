package com.example.demo;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DubboServiceImpl implements DubboService {

  @Override
  public String testDubbo(String pararm) {
    System.out.println(">>>>>>>>>>>>>provider>>pararm="+pararm);
    return "success" + pararm;
  }
}
