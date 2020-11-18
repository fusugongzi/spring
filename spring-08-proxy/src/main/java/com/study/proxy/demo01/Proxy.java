package com.study.proxy.demo01;

/**
 * 代理角色，代理房东出租房子，除了出租房子外会有一些附属操作。
 * @author wzz
 * @create 2020-11-16 21:02
 **/

public class Proxy implements Rent {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    public void seeHouse() {
        System.out.println("中介带你看房子");
    }

    public void hetong() {
        System.out.println("中介签订合同");
    }

    public void fare() {
        System.out.println("中介收房租");
    }
}