package com.etc.controller;

import com.alibaba.fastjson.JSONArray;
import com.etc.entity.Address;
import com.etc.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: Yuzhe Li
 * @Date: 2018/8/28 16:36
 * @Description:
 */
@RestController
@RequestMapping("**.do")
public class AddressRestController {

    @Autowired
    private AddressService addressService;

    @GetMapping("address/users/{uid}")
    public String getAllAddressByUid(@PathVariable int uid){
        List<Address> addressList = addressService.getAllAddressByUid(uid);
        if(addressList.size() == 0){
            return null;
        }
        String addressListJSON = JSONArray.toJSONString(addressList);
        JSONArray jsonArray = JSONArray.parseArray(addressListJSON);
        return jsonArray.toJSONString();
    }

    @PostMapping("/address")
    public String addAddress(Address address){
        boolean isAdd = addressService.addAddress(address);
        return isAdd?"1":"0";
    }
    @DeleteMapping("/address/{aid}")
    public String deleteAddress(@PathVariable int aid){
        System.out.println(aid);
        boolean isDelete = addressService.deleteAddress(aid);
        return isDelete?"1":"0";
    }
}
