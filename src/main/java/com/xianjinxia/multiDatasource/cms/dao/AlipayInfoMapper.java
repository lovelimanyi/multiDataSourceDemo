package com.xianjinxia.multiDatasource.cms.dao;




import com.xianjinxia.multiDatasource.cms.domain.AlipayInfo;
import com.xianjinxia.multiDatasource.cms.domain.AlipayList;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AlipayInfoMapper {


    /**
     * 查询所有订单
     * @return
     */
    List<AlipayInfo> selectAlipayList(AlipayList alipayList);

}