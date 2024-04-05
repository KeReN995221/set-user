package entities;

import java.time.*;
import java.util.Date;
import java.util.Objects;

public class Users {
    private String name;
    private Date dateTimeAccess;

    public Users(String name, Date dateTimeAccess) {
        this.name = name;
        this.dateTimeAccess = dateTimeAccess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateTimeAccess() {
        return dateTimeAccess;
    }

    public void setDateTimeAccess(Date dateTimeAccess) {
        this.dateTimeAccess = dateTimeAccess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users users)) return false;
        return Objects.equals(name, users.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
