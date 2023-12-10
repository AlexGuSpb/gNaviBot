package io.proj3ct.gNaviBot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity(name = "userDataTable")
public class User {

    @Id
    private Long chatId;

    private String firstName;
    private String lastName;
    private String user_Name;
    private Timestamp registeredAt;

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUserName(String userName) {
        this.user_Name = user_Name;
    }

    public Timestamp getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Timestamp registeredAt) {
        this.registeredAt = registeredAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "chatId=" + chatId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + user_Name + '\'' +
                ", registeredAt=" + registeredAt +
                '}';
    }
}
