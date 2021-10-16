package com.juanMoleroD.MemberManagementApp;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Member {
    @Id
    private final Long memberId;
    private String name, surname, mobile;

    private boolean isPremium;
}
