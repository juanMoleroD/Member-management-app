package com.juanMoleroD.MemberManagementApp.controller;

import com.juanMoleroD.MemberManagementApp.repository.MemberRepository;
import com.juanMoleroD.MemberManagementApp.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberRepository repository;

    @GetMapping
    Iterable<Member> getMembers(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    Optional<Member> getMemberById(@PathVariable String id){
        return repository.findById(id);
    }

    @PostMapping
    void postMember(@RequestBody Member member){
        repository.save(member);
    }

    @PutMapping("/{id}")
    ResponseEntity<Member> updateMemberById(@PathVariable String id,
                                            @RequestBody Member member){
        return (repository.existsById(id)) ?
                new ResponseEntity<>(repository.save(member), HttpStatus.OK):
                new ResponseEntity<>(repository.save(member), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    void deleteMemberById(@PathVariable String id){
        repository.deleteById(id);
    }



}
