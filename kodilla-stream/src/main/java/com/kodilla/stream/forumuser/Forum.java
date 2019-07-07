package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    final private List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(
                01, "Tomasz Tomczynski", 'M',
                LocalDate.of(1975, 12, 28), 5));
        forumUsersList.add(new ForumUser(
                02, "Jan Janowski", 'M',
                LocalDate.of(1980, 12, 12), 0));
        forumUsersList.add(new ForumUser(
                03, "Adam Adamowicz", 'M',
                LocalDate.of(2002, 10, 1), 15));
        forumUsersList.add(new ForumUser(
                04, "Adam Adamowicz", 'M',
                LocalDate.of(1985, 9, 1), 15));
        forumUsersList.add(new ForumUser(
                05, "Agnieszka Aga", 'W',
                LocalDate.of(2001, 5, 13), 21));
    }

    public List<ForumUser> getForumUsersList() {
        return forumUsersList;
    }
}
