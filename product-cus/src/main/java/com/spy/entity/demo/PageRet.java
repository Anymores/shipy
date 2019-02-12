package com.spy.entity.demo;

public class PageRet {

    private Object data;//结果集

    private Long TotalNum;//数据总条数

    private Long pageTotal;//总页数

    private Long pageCurrent;//第几页

    public PageRet() {
    }

    @Override
    public String toString() {
        return "PageRet{" +
                "data=" + data +
                ", TotalNum=" + TotalNum +
                ", pageTotal=" + pageTotal +
                ", pageCurrent=" + pageCurrent +
                '}';
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getTotalNum() {
        return TotalNum;
    }

    public void setTotalNum(Long totalNum) {
        TotalNum = totalNum;
    }

    public Long getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Long pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Long getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(Long pageCurrent) {
        this.pageCurrent = pageCurrent;
    }
}
