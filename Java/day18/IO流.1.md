#IO流（Input Output流）

##定义

- 用来处理设备之间的数据传输
- Java对数据的操作是通过流的方式
- Java用于操作流的对象都在IO包中
- 按流操作数据分为两种：字节流与字符流
   - 字节流是通用的，字符流只能用来处理文字，字符流对象融入了文字编码表。对流入的数据进行编码表的查找，并在另一平台中显示该平台的编码。
 - 按流向分为：输入流，输出流。

##IO流常用基类

- 字节流的抽象基类（即父类）
  - InputStream，Outputstream
- 字符流的抽象基类
  - Reader，Writer

##字符流特点 (Writer)

- 数据的最常见体现形式：文件

- 往文件中写入文字代码实现

   - 正常情况下不能抛异常，必须进行处理

  ​

  ```
  import java.io.*;
  ```

​	  ![1](F:\StudyNotes\Java\photo\1.png)

###IO异常的处理方式

- 凡是和设备上的数据发生关系的，对数据进行处理的，都会发生IO异常，无论是读还是写

  ![3](F:\StudyNotes\Java\photo\3.png)

- 一定要对fw进行判空操作，否则当fw对象创建失败时，就无法进行fw.close();会出现空指针异常

###对已有文件完成续写

- 代码实现

  ```
  //传递一个true参数，代表不覆盖已有的文件，并在已有文件的末尾处进行数据续写
  FileWriter fw=new FileWriter("demo.txt",true);
  fw.write("thank\r\nyou");//window中换行为\r\n
  fw.close();
  ```

##字符流特点（Reader）

### 文本读取方式一：存入一个读取一个

![2](F:\StudyNotes\Java\photo\2.png)

### 文本读取方式二：通过字符数组存取（全部存入之后一次性读取）

![4](F:\StudyNotes\Java\photo\4.png)

	## 将c盘的一个文件复制到D盘，Java代码实现

```
//实现法一：从c盘读一个字符，就往d盘写一个字符
public static void copy_1()throws IOException
	{
		FileWriter fw=new FileWriter("RuntimeDemo_copy.txt");

		FileReader fr=new FileReader("RuntimeDEmo.java");

		int ch=0;
		while((ch=fr.read())!=-1)
		{
			fw.write(ch);
		}
		fw.close();
		fr.close();
	}
```

```
//实现法二：用数组方式复制
public static void copy_2()
	{
		FileWriter fw=null;
		FileReader fr=null;
		try
		{
			FileWriter fw=new FileWriter("RuntimeDemo_copy.txt");

			FileReader fr=new FileReader("RuntimeDEmo.java");
			char[] buf=new char[1024];

			int len=0;
			while((len=fr.read())!=-1)
			{
				fw.write(buf,0,len);
			}
		}
		catch (IOException e )
		{
			throw new RuntimeException("读写失败");
		}
		finall
		{
			if(fr!=null)
				try
				{
					fr.close();
				}
				catch (IOException e)
				{

				}
			if(fw!=null)
				try
				{
					fw.close();
				}
				catch (IOException e)
				{

				}
		}
	}
}
```

