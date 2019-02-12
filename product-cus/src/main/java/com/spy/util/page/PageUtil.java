package com.spy.util.page;

public class PageUtil {
    private Long pageStart;

    private Long pageNumber;

    public PageUtil() {
    }

    @Override
    public String toString() {
        return "PageUtil{" +
                "pageStart=" + pageStart +
                ", pageNumber=" + pageNumber +
                '}';
    }

    public Long getPageStart() {
        return pageStart;
    }

    public void setPageStart(Long pageStart) {
        this.pageStart = pageStart;
    }

    public Long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }
}
