package com.task.ApiTask.service;

import com.task.ApiTask.entity.Address;
import com.task.ApiTask.entity.Student;

import java.util.List;

public interface AddressService {

        Address saveAddress(Address address);
        List<Address> getAllAddress();
        Address updateAddress(Address address);
        void deleteAddress(Long id);
}
