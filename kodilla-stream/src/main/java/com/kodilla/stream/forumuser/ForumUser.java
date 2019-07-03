package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final int usrID;
    final String fullName;
    final char sex;
    final LocalDate dateOfBirth;
    final int numberOfPostPublikatetd;

    public ForumUser(int usrID, String fullName, char sex, LocalDate dateOfBirth, int numberOfPostPublikatetd) {
        this.usrID = usrID;
        this.fullName = fullName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPostPublikatetd = numberOfPostPublikatetd;
    }

    public int getUsrID() {
        return usrID;
    }

    public String getFullName() {
        return fullName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPostPublikatetd() {
        return numberOfPostPublikatetd;
    }
}
