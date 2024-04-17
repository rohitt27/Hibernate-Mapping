package com.task.ApiTask.controller;

import com.task.ApiTask.entity.Address;
import com.task.ApiTask.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/saveAddress")
    public Address saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }
    @GetMapping("/getAddress")
    public List<Address> getAddresss(){
        return addressService.getAllAddress();
    }

    @PutMapping("/update")
    public Address updateAddress(@RequestBody Address address){
        return addressService.updateAddress(address);
    }
    @DeleteMapping("/deleteAddress/{id}")
    public void deleteAddress(@PathVariable Long id){
        addressService.deleteAddress(id);
    }

}
