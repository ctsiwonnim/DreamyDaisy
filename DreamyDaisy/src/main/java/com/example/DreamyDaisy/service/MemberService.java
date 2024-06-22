package com.example.DreamyDaisy.service;

import com.example.DreamyDaisy.dto.MemberDTO;
import com.example.DreamyDaisy.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public int save(MemberDTO memberDTO) {
        return  memberRepository.save(memberDTO);
    }
}
