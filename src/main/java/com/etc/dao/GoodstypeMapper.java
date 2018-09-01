package com.etc.dao;

import com.etc.entity.Goodstype;
import com.etc.entity.GoodstypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodstypeMapper {
    int countByExample(GoodstypeExample example);

    int deleteByExample(GoodstypeExample example);

    int deleteByPrimaryKey(Integer gtid);

    int insert(Goodstype record);

    int insertSelective(Goodstype record);

    List<Goodstype> selectByExample(GoodstypeExample example);

    Goodstype selectByPrimaryKey(Integer gtid);

    int updateByExampleSelective(@Param("record") Goodstype record, @Param("example") GoodstypeExample example);

    int updateByExample(@Param("record") Goodstype record, @Param("example") GoodstypeExample example);

    int updateByPrimaryKeySelective(Goodstype record);

    int updateByPrimaryKey(Goodstype record);
}