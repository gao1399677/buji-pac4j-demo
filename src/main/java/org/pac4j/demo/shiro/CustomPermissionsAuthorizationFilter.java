package org.pac4j.demo.shiro;

import org.apache.shiro.web.filter.authz.PermissionsAuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * <p>Title: CustomPermissionsAuthorizationFilter </p>
 * <p>Description: CustomPermissionsAuthorizationFilter </p>
 * Date: 2018年02月09日 下午11:03 AM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2018年02月09日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
public class CustomPermissionsAuthorizationFilter extends PermissionsAuthorizationFilter {

    @Override
    public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws IOException {
        // use your services to load permissions
        String[] perms = (String[]) mappedValue;

        return super.isAccessAllowed(request, response, perms);
    }
}
