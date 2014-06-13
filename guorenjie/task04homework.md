作业：
任务一
| 基本数据类型  | 对应的封装类型 | 
| :--------     | --------:| 
|char           |  java.lang.Char    |
|字符串         |  java.lang.String  |
|int：123       |  java.lang.Integer |
|float： 1.2    |  java.lang.Float   |
|double：1.345  |  java.lang.Double  |
|boolean ：true |  java.lang.Boolean |
|long           |  java.lang.Long    |
|short          |  java.lang.Short   |


任务二
java的hello world程序：
//用文本编辑器（notepad++ 或者txt）完成一个java的hello world程序。并正常运行
package helloworld;
// @author Jerry
public class helloworld {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println( "Hello World! \n" ); 
	}
}


任务三 
通过google搜索或者java api  http://tool.oschina.net/apidocs/apidoc?api=jdk-zh  
找到上述其中一个或多个封装类型的成员方法。找到成员方法后，在helloworld中运用他们。
/**除法运算
 * 
 */

/**
 * @author Jerry
 *
 */

public class Division {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double  a=0.0,b=0.0;
        try{
        	a=1.0/3;
        	b=3/0;
        }catch( Exception e){
        	e.printStackTrace();
        }
        System.out.print(a);
        System.out.print(",");
        System.out.println(b);
	}
}

