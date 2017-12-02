---
title: git笔记
date: 2017-09-16 18:51:13
tags:
  - 笔记
---
#git基本命令如下：

mkdir：		XX（创建一个空目录 XX）

pwd：			显示当前目录的路径

git init：		把当前的目录变成可以管理的git仓库，生成隐藏.git文件。

git add XX：把XX文件添加到暂存区中。

git commit -m “XXX”	提交文件，XXX指的是注释。

git status：	查看仓库状态

git diff XX：	查看文件修改了哪些内容

git log：		查看历史记录

git  log --pretty=one line（简化历史记录信息）

git reset -hard HEAD^或者git reset -hard HEAD~（数字）  
回退到上一个版本，回退到哪个版本。如（git reset -harｄ HEAD~100，回退到100个版本）

cat XX			查看XX文件内容

git reflog		查看历史记录的版本号id

git checkout -XX  把XX文件在工作区的修改全部撤销

git rm XX		删除XX文件

git remote add origin github地址/文件夹	关联一个远程
仓库

git push -u （第一次要用u，以后不需要）origin master	把当前master分支推送到远程仓库

git clone github地址/文件夹	从远程仓库克隆到本地

#总结创建与合并分支命令如下：

查看分支：git branch

创建分支：git branch name

切换分支：git checkout name

创建+切换分支：git checkout -b name

合并某分支到当前分支：git merge name

删除分支：git branch -d name

合并dev分支，禁用fast forward模式： git merge  -no-ff -m “注释” dev


##禁用“Fast forward”模式步骤（dev代表分支name），被删除的分支信息还存在。

1.创建一个dev分支  git checkout -b dev

2.修改readme.txt中的内容。

3.添加到暂存区。 git add readme.txt  git commit -m
“add merge”

4.切换为主分支（master） git checkout master

5.合并dev分支，使用命令  git merge -no-ff -m “注释”  dev

6.查看历史记录 git log --graph --pretty=oneline --abbrev-commit

#stash 存储的意思

git stash：	把当前的工作隐藏起来，等以后恢复现场后继续工作。

git stash list：查看所有被隐藏的文件列表。

git stash apply：恢复被隐藏的文件，但是内容不删除。

git stash drop：删除文件。

git stash pop：恢复文件的同时也删除文件。

---
