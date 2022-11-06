package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 직접 자바 코드로 Bean 등록
 * 상황에 따라 구현 클래스를 변경할 경우 (DB)
 */
@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);    // 스프링 데이터 JPA
    }
}








    /*
    private final DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    */

    /*
    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }
    */

    /*
    @Bean
    public MemberRepository memberRepository() {
        // return new MemoryMemberRepository();                    // Memory에 데이터 저장 (스프링 재시작 시 데이터 삭제)
        // return new JdbcMemberRepository(dataSource);            // JDBC를 통해 데이터 저장 (엄청 긴 코드)
        // return new JdbcTemplateMemberRepository(dataSource);    // JdbcTemplate를 통해 데이터 저장 (엄청 간략해진 코드)
        return new JpaMemberRepository(em);                        // JPA를 통해 데이터 저장
    }
    */

