package com.everygold.inf.etax.service.impl;

import com.everygold.inf.etax.dao.BillDao;
import com.everygold.inf.etax.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class BillServiceImpl implements BillService{

    @Autowired
    private BillDao billDao;
    @Override
    public List<Map<String, Object>> queryLoanList() {
        return billDao.queryLoanList();
    }
}