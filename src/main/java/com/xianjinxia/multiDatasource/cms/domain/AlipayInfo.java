package com.xianjinxia.multiDatasource.cms.domain;


import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AlipayInfo {


    private Long id;

    private Integer repayAlipayAcount;

    private String repayAlipayAcountStr;

    private Integer loanSubject;

    @NotNull(message = "alipayName不能为空!!!")
    private String alipayName;


    @NotNull(message = "alipayOrderNo不能为空!!!")
    private String alipayOrderNo;


    @NotNull(message = "alipayPhone不能为空!!!")
    private String alipayPhone;

    private String alipayRemark;


    @NotNull(message = "moneyAmount不能为空!!!")
    private Double moneyAmount;


    private String remarkName;


    private String remarkPhone;


    @NotNull(message = "repayTimestr不能为空!!!")
    private String repayTimeStr;
    private Integer status;


    private Integer alipayStatus;



    private Integer type;


    private String loanOrderNo;

    private String merchantNum;
    private String repayAccountTime;
    private String marker;
    private String operator;
    private String createtime;
    private String loanSubjectRemark;
}