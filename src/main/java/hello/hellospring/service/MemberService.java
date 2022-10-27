package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemberRepository memberRepository;

    /* 외부에서 넣어주도록 수정 - DI 가능하게 변경 (Generate > Constructor) */
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * 회원 가입
     */
    public Long join(Member member) {
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    /**
     * 중복 회원 체크
     * @param member
     */
    private void validateDuplicateMember(Member member) {
        // 과거에는 null 체크 했지만 요새는 Optional 대체 가능
        memberRepository.findByName(member.getName())
           .ifPresent(m -> {
                throw new IllegalStateException("이미 존재하는 회원입니다.");
           });
    }

    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
