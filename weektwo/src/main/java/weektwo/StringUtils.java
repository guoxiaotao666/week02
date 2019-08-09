package weektwo;

/**
 * @author: Gxt
 * @date: 2019年8月9日
 */
public class StringUtils {
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 
	public boolean hasLength(String src){
		if(!src.equals("") && src != null) {
			return true;
		}
		return false;
	}
	
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 
	public boolean hasText(String src){
		if(!src.equals("") && src != null && src.equals(" ")) {
			return true;
		}
		return false;
	}
	//方法3：判断是否为手机号码 (5分)
	public boolean isMobile(String src){
		String reg = "^1([38]\\d|5[0-35-9]|7[3678])\\d{8}$";
		return src.matches(reg);
	}
	//方法4：判断是否为邮箱 (5分)
	public boolean isEmail(String src){
		String reg = "^\\w+@\\w+.(com|con)$";
		return src.matches(src);
	}
	//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	public String reverse(String src){
		return new StringBuffer(src).reverse().toString();
	}


}
