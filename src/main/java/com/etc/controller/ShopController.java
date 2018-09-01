package com.etc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.dao.CommentMapper;
import com.etc.dao.GoodsMapper;
import com.etc.dao.GoodstypeMapper;
import com.etc.dao.OrdersMapper;
import com.etc.dao.OrdersdetailMapper;
import com.etc.dao.ShopMapper;
import com.etc.dao.ShoptypeMapper;
import com.etc.dao.UserMapper;
import com.etc.entity.Comment;
import com.etc.entity.CommentExample;
import com.etc.entity.Goods;
import com.etc.entity.GoodsExample;
import com.etc.entity.Goodstype;
import com.etc.entity.GoodstypeExample;
import com.etc.entity.Orders;
import com.etc.entity.OrdersExample;
import com.etc.entity.Ordersdetail;
import com.etc.entity.OrdersdetailExample;
import com.etc.entity.Shop;
import com.etc.entity.ShopExample;
import com.etc.entity.Shoptype;
import com.etc.entity.ShoptypeExample;
import com.etc.entity.User;
import com.etc.entity.UserExample;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @Resource
    private ShopMapper shopMapper;

    @Resource
    private ShoptypeMapper shopTypeMapper;

    @Resource
    private GoodstypeMapper goodstypeMapper;

    @Resource
    private GoodsMapper goodsMapper;

    @Resource
    private OrdersMapper ordersMapper;

    @Resource
    private CommentMapper commentMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private OrdersdetailMapper ordersdetailMapper;

    @RequestMapping("/search")
    public String serach(String address,String shoptype, HttpServletRequest request){
        System.out.println("进入查询"+address);
        if(address == ""){
            System.out.println("查询不能为空");
            return "redirect:/";
        }

        System.out.println("查询成功");
        ShopExample se = new ShopExample();
        String saddress = "%"+address+"%";
        System.out.println(saddress);
        if(shoptype == null){
            se.createCriteria().andSaddressLike(saddress).andSstatusEqualTo("营业中");
        }
        else {
            ShoptypeExample ste = new ShoptypeExample();
            ste.createCriteria().andStnameEqualTo(shoptype);
            int stid = shopTypeMapper.selectByExample(ste).get(0).getStid();
            se.createCriteria().andSaddressLike(saddress).andSstatusEqualTo("营业中").andStypeEqualTo(stid);
        }
        List<Shop> shopList = shopMapper.selectByExample(se);

        List<Shoptype> shoptypelist = shopTypeMapper.selectByExample(null);

        request.setAttribute("address", address);
        request.setAttribute("shoptypelist", shoptypelist);
        request.getSession().setAttribute("shopList", shopList);
        return "shoplist";
    }

    @RequestMapping("/{sid}")
    public String shop(@PathVariable Integer sid,HttpServletRequest request){
        System.out.println("进入"+sid+"店铺");
        Shop shop = shopMapper.selectByPrimaryKey(sid);
        if(shop != null){

            GoodstypeExample gte = new GoodstypeExample();
            gte.createCriteria().andSidEqualTo(shop.getSid());
            List<Goodstype> goodsTypeList = goodstypeMapper.selectByExample(gte);
            List<Goods> goodsList = new ArrayList<>();

            List<Goodstype> emptyGoodsTypeList = new ArrayList<>();

            for (Goodstype goodstype : goodsTypeList) {
                GoodsExample ge = new GoodsExample();
                ge.createCriteria().andGtidEqualTo(goodstype.getGtid());
                if(goodsMapper.selectByExample(ge).size() == 0){
                    emptyGoodsTypeList.add(goodstype);
                }
                goodsList.addAll(goodsMapper.selectByExample(ge));
            }

            goodsTypeList.removeAll(emptyGoodsTypeList);

            request.getSession().setAttribute("shop", shop);
            request.setAttribute("goodsTypeList", goodsTypeList);
            request.getSession().setAttribute("goodsList", goodsList);
            return "shop";
        }
        return "redirect:/";

    }

    @RequestMapping("/{sid}/rate")
    public String rate(@PathVariable Integer sid,HttpServletRequest request){
        System.out.println("进入"+sid+"店铺评论");
        Shop shop = shopMapper.selectByPrimaryKey(sid);
        if(shop != null){
            //查询该店铺的所有订单
            OrdersExample oe = new OrdersExample();
            oe.createCriteria().andSidEqualTo(sid);
            List<Orders> ordersList = ordersMapper.selectByExample(oe);

            //通过订单获取到评论以及订单明细
            List<Comment> commnetsList = new ArrayList<>();
            List<Ordersdetail> ordersdetailList = new ArrayList<>();
            for (Orders orders : ordersList) {
                System.out.println("查询到一个评论");
                CommentExample ce = new CommentExample();
                ce.createCriteria().andOidEqualTo(orders.getOid());
                commnetsList.addAll(commentMapper.selectByExample(ce));

                OrdersdetailExample ode = new OrdersdetailExample();
                ode.createCriteria().andOidEqualTo(orders.getOid());
                ordersdetailList.addAll(ordersdetailMapper.selectByExample(ode));
            }
            //通过评论获取到评论用户
            List<User> userList = new ArrayList<>();
            for (Comment comment : commnetsList) {
                User user = (User)userMapper.selectByPrimaryKey(comment.getUid());
                //排除同一个用户在同一家店评论造成的重复添加
                userList.add(user);
            }

            for  ( int  i  =   0 ; i  <  userList.size()  -   1 ; i ++ )  {
                for  ( int  j  =  userList.size()  -   1 ; j  >  i; j -- )  {
                    if  (userList.get(j).getUid().equals(userList.get(i).getUid()))  {
                        userList.remove(j);
                    }
                }
            }

            System.out.println("订单列表长度"+ordersList.size());
            System.out.println("评论列表长度"+commnetsList.size());
            System.out.println("用户列表长度 包括null"+commnetsList.size());
            System.out.println("订单详情列表长度"+ordersdetailList.size());

            request.setAttribute("ordersList", ordersList);
            request.setAttribute("commnetsList", commnetsList);
            request.setAttribute("userList", userList);
            request.setAttribute("ordersdetailList", ordersdetailList);
            return "rate";
        }
        return "redirect:/";
    }
}
