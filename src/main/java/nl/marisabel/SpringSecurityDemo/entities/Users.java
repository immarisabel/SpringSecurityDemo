package nl.marisabel.SpringSecurityDemo.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usersAutorities",
    joinColumns = @JoinColumn(name="userId"),
    inverseJoinColumns = @JoinColumn(name = "authorityId")
    )
    private Set<Authorities> authorities;
}
