    package com.sem2.sem2_project.model;

    import com.sem2.sem2_project.model.enums.Roles;
    import jakarta.persistence.*;
    import lombok.Getter;
    import lombok.Setter;
    import org.springframework.security.core.GrantedAuthority;
    import org.springframework.security.core.authority.SimpleGrantedAuthority;
    import org.springframework.security.core.userdetails.UserDetails;

    import java.util.Collection;
    import java.util.List;

    @Entity
    @Getter
    @Setter
    @Table(name = "users")
    public class User implements UserDetails {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String username;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String address;
        private String phone;

        @Enumerated(EnumType.STRING)
        private Roles role;

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return List.of(new SimpleGrantedAuthority("ROLE_" + role.name()));
        }

        @Override
        public String getUsername() {
            return this.username;
        }

    }
