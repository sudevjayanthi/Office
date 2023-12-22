package com.oasys.Office.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oasys.Office.Entity.Office;


public interface OfficeRepository extends JpaRepository<Office, Integer> {

}
