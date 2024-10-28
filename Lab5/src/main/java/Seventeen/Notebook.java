package Seventeen;

import java.util.Objects;

public class Notebook implements INotebook {
    private String name;
    private String nickname;
    private String phoneNumber;
    private String email;
    private String icqNumber;

    public Notebook(String name, String nickname, String phoneNumber, String email, String icqNumber) {
        this.name = name;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.icqNumber = icqNumber;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setICQNumber(String icqNumber) {
        this.icqNumber = icqNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNickname() {
        return nickname;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getICQNumber() {
        return icqNumber;
    }

    @Override
    public String toString() {
        return "Notebook: name=" + name + ", nickname=" + nickname + ", phone=" + phoneNumber + ", email=" + email + ", ICQ=" + icqNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Notebook notebook = (Notebook) obj;
        return name.equals(notebook.name) && nickname.equals(notebook.nickname) && phoneNumber.equals(notebook.phoneNumber) &&
                email.equals(notebook.email) && icqNumber.equals(notebook.icqNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nickname, phoneNumber, email, icqNumber);
    }
}
