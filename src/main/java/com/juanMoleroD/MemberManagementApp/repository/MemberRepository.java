package com.juanMoleroD.MemberManagementApp.repository;

import com.juanMoleroD.MemberManagementApp.model.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, String> {}
