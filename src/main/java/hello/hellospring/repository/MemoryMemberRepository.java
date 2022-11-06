package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

/* 스프링 데이터 JPA (Could not autowire. There is more than one bean) 에러로 인하여 주석 처리 :  */
//@Repository
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    private Long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name)) // member.getName() == param(name)
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values()); // Map -> List return
    }

    /**
     * Test Data clear function
     */
    public void clearStore() {
        store.clear();
    }

}
