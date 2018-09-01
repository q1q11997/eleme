package com.etc.service;

import com.etc.dao.AddressMapper;
import com.etc.dao.OrdersMapper;
import com.etc.entity.Address;
import com.etc.entity.AddressExample;
import com.etc.entity.Orders;
import com.etc.entity.OrdersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Yuzhe Li
 * @Date: 2018/8/28 10:57
 * @Description:
 */
@Service
public class AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private OrdersService ordersService;

    public List<Address> getAllAddressByUid(int uid){
        AddressExample ae = new AddressExample();
        ae.createCriteria().andUidEqualTo(uid);

        List<Address> addressList = addressMapper.selectByExample(ae);

        return addressList;
    }


    public Boolean addAddress(Address address){
        int row = addressMapper.insert(address);
        return row>0;
    }

    public Boolean deleteAddress(int aid){
        //删除地址所有的订单
        OrdersExample oe = new OrdersExample();
        oe.createCriteria().andAidEqualTo(aid);
        List<Orders> ordersList = ordersMapper.selectByExample(oe);
        for (Orders orders: ordersList) {
            ordersService.deleteOrdersByOid(orders.getOid());
        }
        int row = addressMapper.deleteByPrimaryKey(aid);
        return row>0;

    }
}
