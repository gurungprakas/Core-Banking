/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.corebanking.dao;

import com.prakas.corebanking.entity.Account;
import java.util.List;

/**
 *
 * @author Prakas
 */
public interface AccountDAO {
    List<Account> getAll();
    
    
}
