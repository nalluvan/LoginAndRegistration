package Spring.project.Login.Service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {
	private String userName;
	private String password;
	private Collection<? extends GrantedAuthority> authorities;
	private String fullName;
	
	
	

	public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities,
			String fullname) {
		
		this.userName = username;
		this.password = password;
		this.authorities = authorities;
		this.fullName = fullname;
		
		
	}
	 
	public String getFullname() {
		return fullName;
	}
	
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return authorities;
	}

	@Override
	public String getPassword() {
		
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
