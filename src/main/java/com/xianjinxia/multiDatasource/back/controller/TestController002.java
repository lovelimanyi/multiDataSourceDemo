package com.xianjinxia.multiDatasource.back.controller;


import com.xianjinxia.multiDatasource.back.dao.IUserinfoDao;
import com.xianjinxia.multiDatasource.back.domain.Userinfo;
import com.xianjinxia.multiDatasource.cms.dao.AlipayInfoMapper;
import com.xianjinxia.multiDatasource.cms.domain.AlipayInfo;
import com.xianjinxia.multiDatasource.cms.domain.AlipayList;
import com.xianjinxia.multiDatasource.lightningcash.dao.AssetBorrowOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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


}
