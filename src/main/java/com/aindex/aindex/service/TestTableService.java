package com.aindex.aindex.service;

import com.aindex.aindex.dao.TestTableRepository;
import com.aindex.aindex.domains.TestTable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TestTableService {

    protected final TestTableRepository testTableRepository;

    public String getTablename(){
        Optional testTable = testTableRepository.findById(1L);
        TestTable o = (TestTable) testTable.orElseGet(null);
        return o.getName();
    }

    public TestTable createCol(){
        TestTable tt = new TestTable("testOne");
        return testTableRepository.save(tt);
    }
}
