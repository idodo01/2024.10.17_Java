package Study_20241023.my_collection;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.*;


@ToString
@AllArgsConstructor
class Member{
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member = (Member)obj;
            return this.name.equals(member.name) && this.age == member.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}


public class MySet2 {


    public static void main(String[] args) {

        Member memberA = new Member("A", 10);
        Member memberB = new Member("B", 20);
        Member memberC = new Member("A", 10); // 중복

        if (memberA.equals(memberB)) {
            System.out.println("같아용");
        } else {
            System.out.println("달라용");
        }

        Set<Member> members = new HashSet<>();
        members.add(memberA);
        members.add(memberB);
        members.add(memberC); // set은 중복안됨
        System.out.println(members);

    }
}

