package com.guusto.balanceapi.repository;

import com.guusto.balanceapi.entity.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

public interface BalanceApiRepository extends JpaRepository<Balance,Long> {

    @Query( value = "select * from balance u where u.client_id = :cliID and u.balance > 0 " , nativeQuery = true)
     List<Balance> getBalanceByClientId(@Param("cliID") long clientId);



}
