package com.code.core.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "role")

public class Role {
    @Id
    @Column(name = "roleid")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "role",fetch =FetchType.LAZY)
    private List<User> usersList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
