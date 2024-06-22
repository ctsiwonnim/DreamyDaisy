package com.example.DreamyDaisy.repository;

import com.example.DreamyDaisy.dto.MemberDTO;
import org.springframework.stereotype.Repository;

@Repository //db와 연결하는 역할
public class MemberRepository {
    public int save(MemberDTO memberDTO) {
        System.out.println("memberDTO = "+memberDTO);
        return 0;
    }
}
