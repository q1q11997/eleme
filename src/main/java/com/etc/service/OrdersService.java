package com.etc.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.etc.dao.AddressMapper;
import com.etc.dao.CommentMapper;
import com.etc.dao.OrdersMapper;
import com.etc.dao.OrdersdetailMapper;
import com.etc.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Yuzhe Li
 * @Date: 2018/8/28 10:52
 * @Description:
 */
@Service
public class OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private OrdersdetailMapper ordersdetailMapper;

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private AddressService addressService;



    public List<Orders> getAllOrdersByUid(int uid){
        //获得用户的所有地址
        List<Address> addressList = addressService.getAllAddressByUid(uid);
        if(addressList.size() == 0){
            return null;
        }
        List<Orders> ordersList = new ArrayList<>();
        //查询每个地址下过的订单
        for (Address address: addressList) {
            OrdersExample oe = new OrdersExample();
            oe.createCriteria().andAidEqualTo(address.getAid());
            ordersList.addAll(ordersMapper.selectByExample(oe));
        }

        return ordersList;
    }

    /**
     * 删除订单，同时也删除其所有的订单详情与评价
     * @param oid
     * @return
     */
    public boolean deleteOrdersByOid(int oid){
        int row = 0;
        List<Ordersdetail> ordersdetailList = new ArrayList<>();

        OrdersdetailExample ode = new OrdersdetailExample();
        ode.createCriteria().andOidEqualTo(oid);
        //获取到删除订单的所有订单详情
        ordersdetailList.addAll(ordersdetailMapper.selectByExample(ode));

        for (Ordersdetail orderdetail:ordersdetailList) {
            ordersdetailMapper.deleteByPrimaryKey(orderdetail.getOdid());
        }

        if(ordersdetailMapper.selectByExample(ode).size()==0){
            //获取到删除订单的评价
            CommentExample ce = new CommentExample();
            ce.createCriteria().andOidEqualTo(oid);
            if(commentMapper.selectByExample(ce).size() == 1){
                commentMapper.deleteByPrimaryKey(commentMapper.selectByExample(ce).get(0).getCid());
            }

            //删除订单执行成功的sql条数，成功则为1条
            row = ordersMapper.deleteByPrimaryKey(oid);
        }
        return row>0;
    }

}
