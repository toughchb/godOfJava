package ch13.service;

import ch13.model.MemberDTO;

public abstract class MemberManagerAbstract {
    public abstract boolean addMember (MemberDTO member);
    public abstract boolean removeMember(String name, String member);
    public abstract boolean updateMember(MemberDTO member);
    public void printLog(String data) {
        System.out.println(x);
    }
}