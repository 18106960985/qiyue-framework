package com.qiyue.vo;

import java.util.List;

/**
 * Created with Intellij IDEA.
 * User : Yebinghuan
 * Created on 2018/2/10.
 * Description :
 */
public class TableResult<T> extends BaseResult {

    TableData<T> data;

    public TableResult(long total, List<T> rows) {
        this.data = new TableData<T>(total, rows);
    }

    public TableResult() {
        this.data = new TableData<T>();
    }

    TableResult<T> total(int total) {
        this.data.setTotal(total);
        return this;
    }

    TableResult<T> total(List<T> rows) {
        this.data.setRows(rows);
        return this;
    }

    public TableData<T> getData() {
        return data;
    }

    public void setData(TableData<T> data) {
        this.data = data;
    }

    class TableData<T> {
        long total;
        List<T> rows;

        public TableData(long total, List<T> rows) {
            this.total = total;
            this.rows = rows;
        }

        public TableData() {
        }

        public long getTotal() {
            return total;
        }

        public void setTotal(long total) {
            this.total = total;
        }

        public List<T> getRows() {
            return rows;
        }

        public void setRows(List<T> rows) {
            this.rows = rows;
        }
    }
}
