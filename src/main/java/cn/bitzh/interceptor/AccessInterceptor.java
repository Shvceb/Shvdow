package cn.bitzh.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.bitzh.util.JWTUtil;
import io.jsonwebtoken.Claims;

public class AccessInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String httpHeader = request.getHeader("Authorization");
		Claims claims = JWTUtil.parseJWT(httpHeader);
		int access = Integer.parseInt(claims.get("access").toString());
		if (!request.getRequestURI().contains("find")) {
			if (access > 1) {
				return true;
			} else {
				response.setHeader("Content-type", "text/html;charset=UTF-8");
				response.getOutputStream().write("您无此权限".getBytes("UTF-8"));
				response.setStatus(500);
				response.getOutputStream().flush();
				response.getOutputStream().close();
				return false;
			}
		} else {
			return true;
		}
	}

}
