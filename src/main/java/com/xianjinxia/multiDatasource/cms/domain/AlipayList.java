package com.xianjinxia.multiDatasource.cms.domain;

import lombok.Data;

import java.util.List;

@Data
public class AlipayList {
    private Long id;
    private String alipayOrderNo;  //支付宝订单号
    private String alipayPhone;
    private String remarkName;
    private String remarkPhone;
    private Integer alipayStatus;
    private String loanOrderNo;
    private String merchantNum;
    private String startTime;
    private String endTime;

    private String userName;
    private Integer pageNum;
    private Integer pageSize;
    private String loanSubject;//前端传过来字符串，后台处理为List<Integer>
    private List<String> loanSubjectList;
    private Integer repayAlipayAcount;
    private Integer repayChannel;
}
