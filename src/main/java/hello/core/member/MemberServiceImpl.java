package hello.core.member;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository; // DIP를 지키게 되었다.
//    private final MemberRepository memberRepository = new MemoryMemberRepository();

    public MemberServiceImpl(MemberRepository memberRepository){ // 생성자 주입
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
