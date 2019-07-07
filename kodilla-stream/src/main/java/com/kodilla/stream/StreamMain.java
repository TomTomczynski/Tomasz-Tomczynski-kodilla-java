package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theForum = new Forum();
        LocalDate currentDateMinusTwentyYears = LocalDate.now().minusYears(20);

        Map<Integer, ForumUser> theResultForum = theForum.getForumUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(currentDateMinusTwentyYears))
                .filter(forumUser -> forumUser.getNumberOfPostPublikatetd() > 1)
                .collect(Collectors.toMap(ForumUser::getUsrID, forumUser -> forumUser));

        theResultForum.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);
    }
}

