package com.baidu.springvuethymeleaf.config;

import org.springframework.web.context.request.async.DeferredResult;

public class AsyncVo<I,O> {
    /**
     * 请求参数
     */
    private I params;

    /**
     * 响应结果
     */
    private DeferredResult<O> result;

    public I getParams() {
        return params;
    }

    public void setParams(I params) {
        this.params = params;
    }

    public DeferredResult<O> getResult() {
        return result;
    }

    public void setResult(DeferredResult<O> result) {
        this.result = result;
    }
}
