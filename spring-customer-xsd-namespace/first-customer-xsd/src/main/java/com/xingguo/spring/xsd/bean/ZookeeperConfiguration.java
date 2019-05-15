/*
 * Copyright (c) 2019, crayonshinchanxingguo.com Inc. All Rights Reserved
 */
package com.xingguo.spring.xsd.bean;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 自定义xsd 文件 element 对应的 实体
 *
 * @author xingguo
 * @date 5/15/2019 10:50 AM
 * @since 1.0.0
 **/
@Getter
@Setter
@RequiredArgsConstructor
public class ZookeeperConfiguration implements Serializable {
    /**
     * 连接Zookeeper服务器的列表.
     * 包括IP地址和端口号.
     * 多个地址用逗号分隔.
     * 如: host1:2181,host2:2181
     */
    private final String serverLists;

    /**
     * 命名空间.
     */
    private final String namespace;

    /**
     * 等待重试的间隔时间的初始值.
     * 单位毫秒.
     */
    private int baseSleepTimeMilliseconds = 1000;

    /**
     * 等待重试的间隔时间的最大值.
     * 单位毫秒.
     */
    private int maxSleepTimeMilliseconds = 3000;

    /**
     * 最大重试次数.
     */
    private int maxRetries = 3;

    /**
     * 会话超时时间.
     * 单位毫秒.
     */
    private int sessionTimeoutMilliseconds;

    /**
     * 连接超时时间.
     * 单位毫秒.
     */
    private int connectionTimeoutMilliseconds;

    /**
     * 连接Zookeeper的权限令牌.
     * 缺省为不需要权限验证.
     */
    private String digest;
}
