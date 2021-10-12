package com.juanMoleroD.MemberManagementApp;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Member {
    @Id
    private final Long memberId;
    private String name, surname, age, mobile;

    private String addressLineOne, addressLine2, city, postcode;

    private boolean isPremium;

    private String paymentPlan;
}
