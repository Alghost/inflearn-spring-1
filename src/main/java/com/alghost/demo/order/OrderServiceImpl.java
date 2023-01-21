package com.alghost.demo.order;

import com.alghost.demo.discount.DiscountPolicy;
import com.alghost.demo.discount.FixDiscountPolicy;
import com.alghost.demo.member.Member;
import com.alghost.demo.member.MemberRepository;
import com.alghost.demo.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
