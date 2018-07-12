package com.suraj.vendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suraj.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
