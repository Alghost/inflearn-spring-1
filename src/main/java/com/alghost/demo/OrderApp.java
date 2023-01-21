package com.alghost.demo;

import com.alghost.demo.member.Grade;
import com.alghost.demo.member.Member;
import com.alghost.demo.member.MemberService;
import com.alghost.demo.member.MemberServiceImpl;
import com.alghost.demo.order.Order;
import com.alghost.demo.order.OrderService;
import com.alghost.demo.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 100000);

        System.out.println("order = " + order);
    }
}
