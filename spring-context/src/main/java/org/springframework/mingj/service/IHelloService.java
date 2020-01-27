package org.springframework.mingj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @ClassName IHelloService
 * @Description TODO描述
 * @Author mingj
 * @Date 2020/1/26 19:31
 **/
@Service
public class IHelloService {

    @Autowired
    private ITestService service;

    public void test(){
        service.test("IHelloService");
    }
}
