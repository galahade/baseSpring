package com.young.demo.repository.mybatis.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by young_mac on 16/4/27.
 */
@Getter@Setter
public class LeparInOrdersQuene {


    @Data
    public static class LeparInOrdersQueneKey implements Serializable {

        private final String outOrderId ;
        private final Integer orderSource ;

        public LeparInOrdersQueneKey(String outOrderId, Integer orderSource) {
            this.outOrderId = outOrderId;
            this.orderSource = orderSource;
        }

    }

    private static final long serialVersionUID = 6563029535577372096L;

    private String outOrderId;

    private Integer orderSource;

    private String orderId;

    private Integer status;

    private String channel;

    private Integer orderType;

    private Integer storageId;

    private Integer contractType;

    private BigDecimal paymentAmount;

    private BigDecimal orderAmount;

    private BigDecimal taxAmount;

    private BigDecimal factPayment;

    private Integer countryId;

    private Integer provinceId;

    private Integer cityId;

    private Integer districtId;

    private String countryName;

    private String provinceName;

    private String cityName;

    private String districeName;

    private String reciverName;

    private String reciverMobile;

    private String reciverPhone;

    private String reciverEmail;

    private String reciverZip;

    private String reciverAddress;

    private Integer isInvoice;

    private Integer invoiceType;

    private String invoiceTitle;

    private String intvoiceContent;

    private Date uploadTime;

    private String uploadFailReason;

    private Integer isUploaded;

    private Date createAt;

    private Date updateAt;

    private String validMobile;

    private String validName;

    private String branchBankCode;

    private Integer executeCount;

    private String backupOne;

    private String backupTwo;

    private String failReason;

    private Integer ecId;

}
