package com.etc.dao;

import com.etc.entity.Ordersdetail;
import com.etc.entity.OrdersdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersdetailMapper {
    int countByExample(OrdersdetailExample example);

    int deleteByExample(OrdersdetailExample example);

    int deleteByPrimaryKey(Integer odid);

    int insert(Ordersdetail record);

    int insertSelective(Ordersdetail record);

    List<Ordersdetail> selectByExample(OrdersdetailExample example);

    Ordersdetail selectByPrimaryKey(Integer odid);

    int updateByExampleSelective(@Param("record") Ordersdetail record, @Param("example") OrdersdetailExample example);

    int updateByExample(@Param("record") Ordersdetail record, @Param("example") OrdersdetailExample example);

    int updateByPrimaryKeySelective(Ordersdetail record);

    int updateByPrimaryKey(Ordersdetail record);
}