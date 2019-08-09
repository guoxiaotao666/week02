package weektwo;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Gxt
 * @date: 2019年8月9日
 */
public class Test {
	public static void main(String[] args) {
		StringUtils su = new StringUtils();
		String reverse = su.reverse("qwer");
		System.out.println(reverse);
		
		boolean email = su.isEmail("213@qq.com");
		System.out.println(email);
		
		WebUtils wu = new WebUtils();
		Object ob = wu.getString("hhe");
		System.out.println(ob);
		
		int int1 = wu.getInt("age", 1);
		System.out.println(int1);
	}
}
