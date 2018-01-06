/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.corebanking.dao.impl;

import com.prakas.corebanking.dao.AccountDAO;
import com.prakas.corebanking.entity.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prakas
 */
public class AccounDAOImpl implements AccountDAO{

    @Override
    public List<Account> getAll() {
        List<Account> accounts=new ArrayList<>();
        accounts.add(new Account(1, "Normal Savings", "Normal Savings", 2.5, 0, 100, true));
        accounts.add(new Account(2, "Super Savings", "Super Savings", 4.5, 10000, 200, false));
        return accounts;
        
 
    }
    
}
