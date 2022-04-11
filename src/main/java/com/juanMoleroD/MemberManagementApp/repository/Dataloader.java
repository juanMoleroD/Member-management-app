package com.juanMoleroD.MemberManagementApp.repository;

import com.juanMoleroD.MemberManagementApp.model.Member;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
class DataLoader {
    private final MemberRepository repository;

    public DataLoader(MemberRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void loadData() {
        repository.saveAll(List.of(
                new Member("1001", "Juan", "Molero"),
                new Member("1002", "Diego", "Molero"),
                new Member("1003", "Maria", "Molero")
        ));
    }
}