## numpy的基本操作
### 基本函数操作
#### 转置transpose
```python
A=np.array([1,2,3,4,5])
B=np.array([[2,0],[3,4]])
print('B.transpose=',np.transpose(B))
print('A.transpose=',np.transpose(A))#一维数组没有发生转置
#bincount:最小值和最大值之间每个整数出现的次数
w = np.array([0.3, 0.5, 0.2, 0.7, 1., -0.6]) # weights
x = np.array([0, 1, 1, 2, 2, 2])
y=np.bincount(x,weights=w)
print(y)
```

#### 创建特殊数组
-  zeros：全0数组，ones：全1数组，empty：内容随机的数组

```python
a=np.zeros((3,4))#3个轴，每个轴中有4个元素
b=np.ones((2,2))
c=np.empty((3,1))
print('a=',a)
print('b=',b)
print('c=',c)
#range
d=np.arange(0,30,5)
e=range(0,30,5)
print('d=',d)
print('e=',e)
```

#### argsort,argmax,argmin
-  返回最值或者从小到大排序值的索引
-  argmax(a, axis=None, out=None)
  -  a 表示array
  -  axis 表示指定的轴，默认是None，表示把array平铺，
  -  out 默认为None，如果指定，那么返回的结果会插入其中
-  代码

```python
#二维array
A=np.array([1,2,3,4,5])
B=np.array([[2,0],[3,4]])
print('argsortd=',np.argsort(B))
print('axis=1 argsortd=',np.argsort(B,axis=1))
print('axis=0 argsortd=',np.argsort(B,axis=0))
print('axis=0 argmin=',np.argmin(B,axis=0))
```

### +,-,*操作
-  代码

```python
a=np.array([10,20,30,40])
b=np.arange(4)
c=a-b
print('c=',c)
d=c**2
print('d=',d)
#许多矩阵语言不同，产品运算符*在NumPy数组中以元素方式运行。可以使用dot函数或方法执行矩阵产品：
A=np.array([[1,1],[0,1]])
B=np.array([[2,0],[3,4]])
C=A*B
print('C=',C)
D=np.dot(A,B)
print('D=',D)
#计算数组中所有元素的和,最小值以及最大值
print('A.sum=',A.sum())
print('A.max',A.max())
print('A.min=',A.min())
#通过指定axis 参数，您可以沿数组的指定轴应用操作：
#axis=0:沿着列操作；axis=1，沿着行操作
print('column A.sum=',A.sum(axis=0))
print('row B.min=',B.min(axis=1))
```

-  重点：广播机制
-  广播原则：如果两个数组的后缘维度（trailing dimension，即从末尾开始算起的维度）的轴长度相符，或其中的一方的长度为1，则认为它们是广播兼容的。广播会在缺失和（或）长度为1的维度上进行。
-  [广播详解](https://www.cnblogs.com/jiaxin359/p/9021726.html)

### 数组打印
-  将一维数组打印为行，将二维数据打印为矩阵，将三维数据打印为矩阵列表。

```python
a=np.arange(6)
b=np.arange(12).reshape(4,3)
c=np.arange(24).reshape(2,3,4)
print('a=',a)
print('b=',b)
print('c=',c)
```

### 数组索引，切片，迭代
-  一维数组可以被索引，切片和迭代，就像 列表 和其他Python序列一样。
-  索引，切片

```python
A=np.array([1,2,3,4,5])
print('A[0:4:2]=',A[0:4:2])
#多维数组的索引(fromfunction中第二个参数为形状，也为控制参数的范围)
def f(x,y):
    return 10*x+y
b=np.fromfunction(f,(5,4),dtype=int)#x的范围为0~5，y：0~4
print(b)
#前两个控制行数，后一个参数控制列数
print(b[2][3])
print(b[0:5,1])#0~5行中的第二列
print(b[:,1])
print(b[1:3,:])
#当提供的索引少于轴的数量时，缺失的索引被认为是完整的切片:
print(b[-1])
```

-  迭代

```python
#对多维数组进行迭代是针对第一个轴完成的：
C=np.array([[1,2,3],[4,5,6]])
D = np.array( [[[  0,  1,  2],               # a 3D array (two stacked 2D arrays)
             [ 10, 12, 13]],
            [[100,101,102],
             [110,112,113]]])
for row in C:
    print(row)
for row in D:
    print(row)
#对多维数组中的每一个元素进行操作迭代flat属性
for element in C.flat:
    print(element)
```

### 数组操作
#### 改变数组形状
-  改变数组的形状,以下三个命令都返回已修改的数组，但不更改原始数组：
-  resize修改数组本身

```python
a=np.array([[ 2.,  8.,  0.,  6.],
       [ 4.,  5.,  1.,  1.],
       [ 8.,  9.,  3.,  6.]])
print(a.ravel())#flattend平铺一维
print(a.flatten())
print(a.reshape(6,2))
print('a.T=',a.T)
```
#### 堆叠不同的数组

```python
a = np.floor(10*np.random.random((2,2)))
print(a)
b = np.floor(10*np.random.random((2,2)))
print(b)
#vstack和hstack
print('vstack of a,b=',np.vstack((a,b)))#竖直拼接:按列合并，即增加行数
print('hstack of a,b=',np.hstack((a,b)))#水平拼接:按行合并，即行数不变，扩展列数
#column_stack
#函数concatenate,另一个方向上的维度不同就不能拼接
A=np.array([[1,2]])
B=np.array([[2,0],[3,4]])
print(np.concatenate((A,B),axis=0))
print(np.concatenate((A.T,B),axis=1))
```
#### 将一个数组拆分为几个小组

```python
a = np.floor(10*np.random.random((2,12)))
print(a)
print(np.hsplit(a,3))#把a水平 每一行分为3个array
print(np.hsplit(a,(3,4)))#以3,4列为基准，水平分数组
#array_split将数组拆分为多个大小基本相等的子数组
#split：沿着基准分数组
x = np.arange(8.0)
print(np.split(x, [3, 5, 6, 10]))
arr1=np.array([[1],[2],[3]])
arr2 = np.array([1, 2, 3])
print(arr1.shape)
print(arr2.shape)
```
