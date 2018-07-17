### 自定义函数
```Python
import math
def move(x,y,step,angle=0):
    nx=x+step*math.cos(angle)
    ny=y+step*math.sin(angle)
    return nx,ny
#x,y=move(100,100,60,math.pi/6)
#print(x,y)
#python的返回值仍然是单一值，返回一个元组
r=move(100,100,60,math.pi/6)
print(r)
```
### 递归函数
```python
def fac(n):
    if n==1:
        return 1
    return n*fac(n-1)
print(fac(5))
```
### 函数参数
-  在python中定义函数，可以选用必选参数，默认参数，可变参数，关键字参数，命名关键字参数
#### 默认参数
```python
#默认参数,是一个不可变对象
def enroll(name,gender,age=20,city='beijing'):
    print('name:',name)
    print('gender:',gender)
    print('age:',age)
    print('city:',city)
enroll('chenru','femal',city='xian')
```
#### 可变参数
-  当参数个数不确定时
-  由于参数个数不确定，我们首先想到可以把a，b，c……作为一个list或tuple传进来，这样，函数可以定义如下：
```python
#普通传参
def calc(numbers):
    sum=0
    for n in numbers:
        sum=sum+n
    return sum
a=calc([1,2,3])
print(a)
#可变参数传参
def calc1(*num):
    sum=0
    for n in num:
        sum=sum+n
    return sum
b=calc1(1,2,3,4)
print(b)
#已有一个list或者tuple，调用一个可变参数
#*s表示把s这个list的所有元素作为可变参数传进去。这种写法相当有用，而且很常见。
关键字参数
s=[1,2,3,4]
c=calc1(*s)
print(c)
```
#### 关键字参数
-  可变参数允许你传入0个或任意个参数，这些可变参数在函数调用时自动组装为一个tuple。而关键字参数允许你传入0个或任意个含参数名的参数，这些关键字参数在函数内部自动组装为一个dict。
```python
def person(name,age,**kw):
    print('name:',name,'age:',age,'other:',kw)
person('chenru',20,gender='M',city='beijing')
#和可变参数类似，也可以先组装出一个dict，然后，把该dict转换为关键字参数传进去：
extra={'gender':'M','city':'beijing'}
#person('jinlu',21,city=extra['gender'],city=extra['city'])
person('jinlu',21,**extra)
```
-  **extra表示把extra这个dict的所有key-value用关键字参数传入到函数的**kw参数，kw将获得一个dict，注意kw获得的dict是extra的一份拷贝，对kw的改动不会影响到函数外的extra。
#### 命名关键字参数
-  如果要限制关键字参数的名字，就可以用命名关键字参数，例如，只接收city和job作为关键字参数(两个参数必须传入)。这种方式定义的函数如下
```python
def person(name,age,*,city,job):
    print(name,age,city,job)
```
-  和关键字参数**kw不同，命名关键字参数需要一个特殊分隔符*，*后面的参数被视为命名关键字参数。
-  如果函数定义中已经有了一个可变参数，后面跟着的命名关键字参数就不再需要一个特殊分隔符*了：
```python
def person(name,age,*arg,city,job):
    print(name,age,args,city,job)
person('chenru',12,city='bj',job='student')
```
