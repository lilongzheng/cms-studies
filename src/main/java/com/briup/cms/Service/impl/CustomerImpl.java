package com.briup.cms.Service.impl;

import com.briup.cms.Service.ICustomerService;
import com.briup.cms.bean.Customer;
import com.briup.cms.dao.ICustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerImpl implements ICustomerService {
    @Autowired
    private ICustomerDao customerdao;
    @Override
    public Customer findById(int id) {
        return customerdao.queryById(id);
    }
}
