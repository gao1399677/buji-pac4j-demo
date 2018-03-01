package org.pac4j.demo.shiro;

import org.apache.shiro.web.filter.authz.RolesAuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * <p>Title: My </p>
 * <p>Description: My </p>
 * Date: 2018年02月09日 下午11:10 AM
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
public class CustomRolesAuthorizationFilter extends RolesAuthorizationFilter {

    @Override
    public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws IOException {

        //use your services to load roles from database dynamically
        String[] rolesArray = (String[]) mappedValue;

        return super.isAccessAllowed(request, response, rolesArray);
    }
}
