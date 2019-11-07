package edu.hfut.hawk_eye.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 登录拦截器（判断用户是否登录）
 * @author lenovo
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    /**
     * 登录session key
     */
    public final static String SESSION_KEY = "user";

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        // 从session中获取用户对象（该对象在用户登录的时候存于session中）
        Object object = request.getSession().getAttribute(SESSION_KEY);
        // 用户未登录，则返回false, 拦截该请求
        if (object == null) {
            PrintWriter printWriter = response.getWriter();
            printWriter.write("请登录");
            return false;
        }
        // 用户已登录，则返回true, 放行该请求
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub
        super.afterCompletion(request, response, handler, ex);
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request,
                                               HttpServletResponse response, Object handler) throws Exception {
        // TODO Auto-generated method stub
        super.afterConcurrentHandlingStarted(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub
        super.postHandle(request, response, handler, modelAndView);
    }

}

