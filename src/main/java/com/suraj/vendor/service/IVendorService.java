package com.suraj.vendor.service;

import java.util.List;

import com.suraj.vendor.entities.Vendor;

public interface IVendorService {

	public Vendor saveVendor(Vendor vendor);

	public Vendor updateVendor(Vendor vendor);

	public void deleteVendor(Vendor vendor);

	public Vendor getVendorById(int id);

	public List<Vendor> getAllVendors();

}
