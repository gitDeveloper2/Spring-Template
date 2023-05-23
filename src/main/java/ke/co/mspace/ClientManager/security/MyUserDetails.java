package ke.co.mspace.ClientManager.security;

import ke.co.mspace.ClientManager.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
public class MyUserDetails implements UserDetails {
    private final User user;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> grantedAuthorities=new ArrayList<>();
        int adminType=Integer.parseInt(user.getAdmin());
        SimpleGrantedAuthority sga=null;
        switch (adminType){
            case 1:
               sga= new SimpleGrantedAuthority("SUPER_ADMIN");

                break;
            case 2:
                sga= new SimpleGrantedAuthority("NORMAL_USER");

                break;
            case 3:
                sga= new SimpleGrantedAuthority("RESELLER");
                break;
            case 4:
                sga= new SimpleGrantedAuthority("RESELLERS_USER");
                break;
            case 5:
                sga= new SimpleGrantedAuthority("DELETED_USER");
                break;

        }
        grantedAuthorities.add(sga);
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public User getUser(){
        return this.user;
    }
}
