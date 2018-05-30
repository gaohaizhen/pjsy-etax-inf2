package com.everygold.inf.etax.controller;

import com.everygold.inf.etax.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

//localhost:8888/test/billMsg
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private BillService billservice;

    @RequestMapping("/billMsg")
    public Object billMsg(HttpServletRequest request) throws Exception {
        System.out.println(312);
        List<Map<String, Object>> li = billservice.queryLoanList();

        return 123;

    }

    @RequestMapping("/billMsg2")
    public Object billMsg2(HttpServletRequest request) throws Exception {
        System.out.println(312);
        List<Map<String, Object>> li = billservice.queryLoanList();

        return li;

    }

}
