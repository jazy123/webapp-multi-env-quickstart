package ${package}.authentication;

import java.util.List;
import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;


public class UserRealm extends AuthorizingRealm{

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
				
		SimpleAuthorizationInfo authorizationInfo =  new SimpleAuthorizationInfo();
		Subject subject=SecurityUtils.getSubject();
		/*User user = (User) subject.getSession().getAttribute("user");

		List<Role> roleList = roleService.getRolesByUser(user.getId());		
		for(Role role : roleList){
			authorizationInfo.addRole(role.getSysname());
			
		}
		
		List<Permission> permsList = userService.getPermissionListByUser(user.getId());
		for(Permission perms : permsList )
			authorizationInfo.addStringPermission(perms.getSysname());*/

		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		UsernamePasswordToken upToken = (UsernamePasswordToken) token; 
		// 通过表单接收的用户名 
		String username = upToken.getUsername(); 
		if (username != null && !"".equals(username)){
			/*User user = userService.getEnabledUserByUsername(username);
			if (user != null){
				Subject subject=SecurityUtils.getSubject();
				subject.getSession().setAttribute("user", user);
				return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(),getName());
			}*/
		}
		return null;
	}

}
