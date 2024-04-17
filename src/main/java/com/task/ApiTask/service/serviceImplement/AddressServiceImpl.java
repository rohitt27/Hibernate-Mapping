package com.task.ApiTask.service.serviceImplement;

import com.task.ApiTask.entity.Address;
import com.task.ApiTask.entity.Student;
import com.task.ApiTask.repository.AddressRepository;
import com.task.ApiTask.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Address updateAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void deleteAddress(Long id) {
        Address address = new Address();
        address.setId(id);
        addressRepository.save(address);
    }
}
