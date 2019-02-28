package com.xianjinxia.multiDatasource.lightningcash.dao;


import org.springframework.stereotype.Repository;

import java.util.Map;


@Repository
public interface AssetBorrowOrderMapper {

    Map<String,Object> getOrderInfo(Integer assetOrderId);
}
