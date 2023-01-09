package com.alghost.demo.member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
