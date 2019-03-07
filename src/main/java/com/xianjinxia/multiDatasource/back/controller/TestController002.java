package com.xianjinxia.multiDatasource.back.controller;


import com.xianjinxia.multiDatasource.back.dao.IUserinfoDao;
import com.xianjinxia.multiDatasource.back.domain.OrderInfo;
import com.xianjinxia.multiDatasource.back.domain.Userinfo;
import com.xianjinxia.multiDatasource.cms.dao.AlipayInfoMapper;
import com.xianjinxia.multiDatasource.cms.domain.AlipayInfo;
import com.xianjinxia.multiDatasource.cms.domain.AlipayList;
import com.xianjinxia.multiDatasource.lightningcash.dao.AssetBorrowOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RequestMapping("test/")
@Controller
public class TestController002 {

    @Autowired
    private IUserinfoDao IUserinfoDao;

    @Autowired
    private AlipayInfoMapper alipayInfoMapper;

    @Autowired
    private AssetBorrowOrderMapper assetBorrowOrderMapper;

    @RequestMapping("test1")
    @ResponseBody
    public void test1() {
        System.out.println("111111");
        Userinfo userinfo = IUserinfoDao.selectByPrimaryKey(71L);

        System.out.println("2222222");
        System.out.println("333333");

    }

    @RequestMapping("test2")
    @ResponseBody
    public void test2() {
        System.out.println("111111");
        AlipayList alipayList = new AlipayList();
        List<AlipayInfo> list = alipayInfoMapper.selectAlipayList(alipayList);

        System.out.println("2222222");
        System.out.println("333333");

    }


    @RequestMapping("test3")
    @ResponseBody
    public void test3() {
        System.out.println("111111");
        Map<String, Object> orderInfoMap = assetBorrowOrderMapper.getOrderInfo(120660);

        System.out.println("2222222");
        System.out.println("333333");

    }


//    @RequestMapping("test4")
//    @ResponseBody
//    public List<OrderInfo> test4(String str) {
//        System.out.println("111111");
//        List<Long> list = new ArrayList<>();
//        list.add(100L);
//        list.add(101L);
//        list.add(102L);
//        List<OrderInfo> orderInfoList = new ArrayList<>();
//        OrderInfo orderInfo = new OrderInfo();
//        orderInfo.setMerchantNo("猪有钱");
//        orderInfo.setMobile("15022223333");
//        orderInfo.setOrderStatus("放款中");
//        orderInfo.setUserId(1001L);
//        orderInfoList.add(orderInfo);
//        OrderInfo orderInfo2 = new OrderInfo();
//        orderInfo2.setMerchantNo("金小侠");
//        orderInfo2.setMobile("15066669999");
//        orderInfo2.setOrderStatus("待还款");
//        orderInfo2.setUserId(1002L);
//        orderInfoList.add(orderInfo2);
//        return orderInfoList;
//    }

    @RequestMapping("test5")
    @ResponseBody
    public Map<Long,Object> test5(@RequestBody List<Long> str) {
        System.out.println("111111");
        Map<Long,Object> map = new HashMap<>();
        List<OrderInfo> orderInfoList = new ArrayList<>();
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setMerchantNo("猪有钱");
        orderInfo.setMobile("15022223333");
        orderInfo.setCurrentStatus("当前状态*****");
        orderInfo.setUserId(101L);
        map.put(101L,orderInfo);
        OrderInfo orderInfo2 = new OrderInfo();
        orderInfo2.setMerchantNo("金小侠");
        orderInfo2.setMobile("15066669999");
        orderInfo2.setCurrentStatus("当前状态*****");
        orderInfo2.setUserId(102L);
        map.put(102L,orderInfo2);
        return map;
    }


}
