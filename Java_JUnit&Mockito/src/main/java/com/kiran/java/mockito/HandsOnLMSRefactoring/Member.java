package com.kiran.java.mockito.HandsOnLMSRefactoring;

import java.util.StringJoiner;

public class Member {
    private String memberId;
    private String memberName;
    private String memberType;
    private int entitlement;
    private String address;
    private String emailId;

    public Member(
            String memberId,
            String memberName,
            String memberType,
            int entitlement,
            String address,
            String emailId
    ) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberType = memberType;
        this.entitlement = entitlement;
        this.address = address;
        this.emailId = emailId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public int getEntitlement() {
        return entitlement;
    }

    public void setEntitlement(int entitlement) {
        this.entitlement = entitlement;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\n");

        sj.add("Member Id:" + memberId);
        sj.add("Member Title:" + memberName);
        sj.add("Member Type:" + memberType);
        sj.add("Address:" + address);
        sj.add("Email-id:" + emailId);
        sj.add("Entitlement:" + entitlement);

        return sj.toString();
    }
}
