package com.etc.dao;

import com.etc.entity.Shopuser;
import com.etc.entity.ShopuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopuserMapper {
    int countByExample(ShopuserExample example);

    int deleteByExample(ShopuserExample example);

    int deleteByPrimaryKey(Integer suid);

    int insert(Shopuser record);

    int insertSelective(Shopuser record);

    List<Shopuser> selectByExample(ShopuserExample example);

    Shopuser selectByPrimaryKey(Integer suid);

    int updateByExampleSelective(@Param("record") Shopuser record, @Param("example") ShopuserExample example);

    int updateByExample(@Param("record") Shopuser record, @Param("example") ShopuserExample example);

    int updateByPrimaryKeySelective(Shopuser record);

    int updateByPrimaryKey(Shopuser record);
}