package SpB.Exception.MemberManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemberManager {
    private final HashMap<Integer, Member> members = new HashMap<Integer, Member>();
    public void addMember(Member member) {
        if (members.containsKey(member.getId())) {
            throw new IllegalArgumentException("이미 존재하는 ID입니다. : 등록 실패");
        }
        members.put(member.getId(), member);
        System.out.println("회원 추가 완료 : 등록 성공");
    }

    public Member getMember(int id) {
        if (members.containsKey(id)) {
            return members.get(id);
        }
        throw new IllegalArgumentException("존재하지 않는 ID입니다.");
    }

    public void removeMember(int id) {
        if (members.containsKey(id)) {
            members.remove(id);
            System.out.println("삭제가 완료되었습니다.");
        } else {
            throw new IllegalArgumentException("존재하지 않는 ID입니다.");
        }
    }

    public List<Member> getAllMembers() {
        if (members.isEmpty()) {
            throw new IllegalArgumentException("등록된 회원이 없습니다.");
        }
        return new ArrayList<>(members.values());
    }
}
