package com.zhao.ssm.bean;

import java.util.Date;

/**
 * Created by zhao on 2017/4/1.
 */
public class Order {
    private long oid;
    private long bid;
    private long pid;
    private Date saleDate;
    private int saleCount;

    public Order() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (oid != order.oid) return false;
        if (bid != order.bid) return false;
        if (pid != order.pid) return false;
        if (saleCount != order.saleCount) return false;
        return saleDate != null ? saleDate.equals(order.saleDate) : order.saleDate == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (oid ^ (oid >>> 32));
        result = 31 * result + (int) (bid ^ (bid >>> 32));
        result = 31 * result + (int) (pid ^ (pid >>> 32));
        result = 31 * result + (saleDate != null ? saleDate.hashCode() : 0);
        result = 31 * result + saleCount;
        return result;
    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public int getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(int saleCount) {
        this.saleCount = saleCount;
    }
}
