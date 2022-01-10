package com.dhy.designpatterns.bridgePattern.demo1.case1;

import com.dhy.designpatterns.bridgePattern.demo1.disk.IDisk;

/**
 * @Project fighting-core
 * @Description 主要用途描述
 * @Author lvaolin
 * @Date 2022/1/10 下午7:17
 */
public class ComputerI31G2T extends ComputerI31G implements IDisk {

    @Override
    public String disk() {
        return "2T硬盘";
    }
}
