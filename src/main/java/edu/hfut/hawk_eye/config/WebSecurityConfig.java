//package edu.hfut.hawk_eye.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//@Configuration
//public class WebSecurityConfig extends WebMvcConfigurerAdapter {
//
//    /**
//     * 登录session key
//     */
//    public final static String SESSION_KEY = "user";
//
//    @Bean
//    public SecurityInterceptor getSecurityInterceptor() {
//        return new SecurityInterceptor();
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        InterceptorRegistration addInterceptor = registry.addInterceptor(getSecurityInterceptor());
//
////        // 排除配置
//////        addInterceptor.excludePathPatterns("/users/re");
//////        addInterceptor.excludePathPatterns("/login**");
////        addInterceptor.excludePathPatterns("/use*");
////        addInterceptor.excludePathPatterns("/new*");
////        addInterceptor.excludePathPatterns("/index.html");
////
////        // 拦截配置
////        //addInterceptor.addPathPatterns("/user*");
////        //addInterceptor.addPathPatterns("/news*");
////        addInterceptor.addPathPatterns("/");
//    }
//
//    private class SecurityInterceptor extends HandlerInterceptorAdapter {
//
//        @Override
//        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//                throws Exception {
//            HttpSession session = request.getSession();
//            if (session.getAttribute(SESSION_KEY) != null) {
//                return true;
//            }
//
//            // 跳转登录
//            String url = "/login.html";
//            response.sendRedirect(url);
//            return false;
//        }
//    }
//}
