package SpB.Exception;

import java.util.HashSet;

public class Main {
    static HashSet<String> users = new HashSet<>();

    public static void register(String userId) {
        if (userId == null || userId.isEmpty()) {
            throw new IllegalArgumentException("ID가 비어 있습니다.");
        }
        if (users.add(userId)) {
            System.out.println("회원 등록이 완료되었습니다.");
        } else {
            throw new IllegalArgumentException("이미 존재하는 ID입니다.");
        }
    }

    static void main(String[] args) {
        try {
            register("Kim");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }

        try {
            register("Lee");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }

        try {
            register("Kim");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }

        try {
            register("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
