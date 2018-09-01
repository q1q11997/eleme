package com.etc.controller;

import com.alibaba.fastjson.JSONArray;
import com.etc.entity.Orders;
import com.etc.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: Yuzhe Li
 * @Date: 2018/8/28 10:49
 * @Description:
 */
@RestController
@RequestMapping("orders")
public class OrdersRestController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("users/{uid}.do")
    public String getAllOrdersByUid(@PathVariable int uid){
        List<Orders> ordersList = ordersService.getAllOrdersByUid(uid);

        String ordersListJSON = JSONArray.toJSONString(ordersList);
        JSONArray jsonArray = JSONArray.parseArray(ordersListJSON);
        return jsonArray.toJSONString();
    }
    @DeleteMapping("/{oid}.do")
    public String deleteOrdersByOid(@PathVariable int oid){
        boolean isDelete = ordersService.deleteOrdersByOid(oid);
        return isDelete?"1":"0";
    }
}
