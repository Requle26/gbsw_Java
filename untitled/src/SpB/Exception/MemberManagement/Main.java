package SpB.Exception.MemberManagement;

public class Main {
    static void main(String[] args) {
        MemberManager manager = new MemberManager();

        try {
            manager.addMember(new Member(1, "김성일", 17));
            manager.addMember(new Member(2, "우성윤", 17));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(manager.getMember(1));
            System.out.println(manager.getMember(2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(manager.getAllMembers());

        try {
            manager.removeMember(1);
            manager.removeMember(2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(manager.getAllMembers());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            manager.addMember(new Member(1, "김성일", 17));
            manager.addMember(new Member(1, "김성일", 17));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(manager.getMember(4));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
