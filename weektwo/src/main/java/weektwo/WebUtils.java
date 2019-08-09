package weektwo;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Gxt
 * @date: 2019年8月9日
 */
public class WebUtils {
	//方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 
	public Object getString(String defaultValue){
		String uri = "localhost:8080/list?name=zhangsan";
		String[] split = uri.split("=");
		String result = "";
		for (int i = 0; i < split.length; i++) {
			result =  split[1]; 
		}
		if(result instanceof String) {
			return true;
		}
		return defaultValue;
	}
	
	//方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
	public int getInt(String name,Integer defaultValue){
		String uri = "localhost:8080/list?age=10";
		String[] split = uri.split("=");
		String result = "";
		for (int i = 0; i < split.length; i++) {
			result =  split[1]; 
		}
		Integer resu = Integer.parseInt(result);
		if(!uri.contains(name) || !(resu instanceof Integer)) {
			return defaultValue;
		}
		return 0;
	}


}
