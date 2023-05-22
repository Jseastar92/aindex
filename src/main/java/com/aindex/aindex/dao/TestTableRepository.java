package com.aindex.aindex.dao;

import com.aindex.aindex.domains.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestTableRepository extends JpaRepository<TestTable, Long> {
}
