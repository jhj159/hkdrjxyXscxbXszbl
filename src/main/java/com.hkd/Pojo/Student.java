package com.hkd.Pojo;

import org.springframework.stereotype.Component;

/**
 * @author jhj
 * @data 2021/8/1 - 19:26
 */

@Component
public class Student {
    private int id;
    private String zhuanYeBanJi;
    private String xueHao;
    private String xingMing;
    private String jiaTingZhuZhi;
    private String shenFenZhengHao;
    private String shiFouBanKa;
    private String chengCheQuJian;
    private String ruXueShiJian="2021.9.5";
    private String xueZhi="4";
    private String log;

    public String getLog() {
        return log;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", zhuanYeBanJi='" + zhuanYeBanJi + '\'' +
                ", xueHao='" + xueHao + '\'' +
                ", xingMing='" + xingMing + '\'' +
                ", jiaTingZhuZhi='" + jiaTingZhuZhi + '\'' +
                ", shenFenZhengHao='" + shenFenZhengHao + '\'' +
                ", shiFouBanKa='" + shiFouBanKa + '\'' +
                ", chengCheQuJian='" + chengCheQuJian + '\'' +
                ", ruXueShiJian='" + ruXueShiJian + '\'' +
                ", xueZhi='" + xueZhi + '\'' +
                ", log='" + log + '\'' +
                '}';
    }

    public void setLog(String log) {
        this.log = log;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZhuanYeBanJi() {
        return zhuanYeBanJi;
    }

    public void setZhuanYeBanJi(String zhuanYeBanJi) {
        this.zhuanYeBanJi = zhuanYeBanJi;
    }

    public String getXueHao() {
        return xueHao;
    }

    public void setXueHao(String xueHao) {
        this.xueHao = xueHao;
    }

    public String getXingMing() {
        return xingMing;
    }

    public void setXingMing(String xingMing) {
        this.xingMing = xingMing;
    }

    public String getJiaTingZhuZhi() {
        return jiaTingZhuZhi;
    }

    public void setJiaTingZhuZhi(String jiaTingZhuZhi) {
        this.jiaTingZhuZhi = jiaTingZhuZhi;
    }

    public String getShenFenZhengHao() {
        return shenFenZhengHao;
    }

    public void setShenFenZhengHao(String shenFenZhengHao) {
        this.shenFenZhengHao = shenFenZhengHao;
    }

    public String getShiFouBanKa() {
        return shiFouBanKa;
    }

    public void setShiFouBanKa(String shiFouBanKa) {
        this.shiFouBanKa = shiFouBanKa;
    }

    public String getChengCheQuJian() {
        return chengCheQuJian;
    }

    public void setChengCheQuJian(String chengCheQuJian) {
        this.chengCheQuJian = chengCheQuJian;
    }

    public String getRuXueShiJian() {
        return ruXueShiJian;
    }

    public void setRuXueShiJian(String ruXueShiJian) {
        this.ruXueShiJian = ruXueShiJian;
    }

    public String getXueZhi() {
        return xueZhi;
    }

    public void setXueZhi(String xueZhi) {
        this.xueZhi = xueZhi;
    }
}
