package com.home.twitterspring.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="usr")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @NonNull
    private String username;
    @NonNull
    private String password;
    @NonNull
    private boolean active;

    @ElementCollection(targetClass = Role.class,fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role",joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

}
