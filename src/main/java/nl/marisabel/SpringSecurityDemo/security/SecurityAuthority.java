package nl.marisabel.SpringSecurityDemo.security;

import lombok.AllArgsConstructor;
import nl.marisabel.SpringSecurityDemo.entities.Authorities;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityAuthority  implements GrantedAuthority {

    private final Authorities authorities;

    @Override
    public String getAuthority() {
        return authorities.getName();
    }
}
