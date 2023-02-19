package com.gym.managementsystem.service;
import java.util.List;
import javax.transaction.Transactional;
import com.gym.managementsystem.model.Member;
import com.gym.managementsystem.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> listAll() {
        return memberRepository.findAll();
    }

    public void save(Member member){
        memberRepository.save(member);
    }

    public Member get(Integer memberId){
        return this.memberRepository.getReferenceById(memberId);
    }

    public void delete(Integer memberId){
        memberRepository.deleteById(memberId);
    }
}

