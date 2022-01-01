package com.dhy.designpatterns.chainOfResponsibility.linkedChain;

/**
 * @Title Node1
 * @Description
 * @Author lvaolin
 * @Date 2022/1/1 16:27
 **/
public class Node3 extends BaseNode {
    @Override
    public void check(GlCertificate glCertificate) {
        System.out.println("凭证合法性检查规则3");
        if (getNext()!=null) {
            getNext().check(glCertificate);
        }
    }
}
