git ʹ��5���ߣ�
git init
git add XX
git commit -m ��XXX��
git remote add origin https://github.com/king-ru/�ļ���
git push -u ����һ��Ҫ��u���Ժ���Ҫ��origin master

git�����������£�
mkdir��		XX������һ����Ŀ¼ XX��
pwd��			��ʾ��ǰĿ¼��·��
git init��		�ѵ�ǰ��Ŀ¼��ɿ��Թ����git�ֿ⣬��������.git�ļ���
git add XX����XX�ļ���ӵ��ݴ����С�
git commit -m ��XXX��	�ύ�ļ���XXXָ����ע�͡�
git status��	�鿴�ֿ�״̬
git diff XX��	�鿴�ļ��޸�����Щ����
git log��		�鿴��ʷ��¼
git  log --pretty=one line������ʷ��¼��Ϣ��
git reset -hard HEAD^����git reset -hard HEAD~�����֣�  ���˵���һ���汾�����˵��ĸ��汾���磨git reset -har�� HEAD~100�����˵�100���汾��
cat XX			�鿴XX�ļ�����
git reflog		�鿴��ʷ��¼�İ汾��id
git checkout -XX  ��XX�ļ��ڹ��������޸�ȫ������
git rm XX		ɾ��XX�ļ�
git remote add origin https://github.com/king-ru/�ļ���	����һ��Զ�ֿ̲�
git push -u ����һ��Ҫ��u���Ժ���Ҫ��origin master	�ѵ�ǰmaster��֧���͵�Զ�ֿ̲�
git clone https://github.com/king-ru/�ļ���	��Զ�ֿ̲��¡������

�ܽᴴ����ϲ���֧�������£�
�鿴��֧��git branch
������֧��git branch name
�л���֧��git checkout name
����+�л���֧��git checkout -b name
�ϲ�ĳ��֧����ǰ��֧��git merge name
ɾ����֧��git branch -d name
�ϲ�dev��֧������fast forwardģʽ�� git merge  -no-ff -m ��ע�͡� dev


���á�Fast forward��ģʽ���裨dev�����֧name������ɾ���ķ�֧��Ϣ�����ڡ�
1.����һ��dev��֧  git checkout -b dev
2.�޸�readme.txt�е����ݡ�
3.��ӵ��ݴ����� git add readme.txt  git commit -m ��add merge��
4.�л�Ϊ����֧��master�� git checkout master
5.�ϲ�dev��֧��ʹ������  git merge -no-ff -m ��ע�͡�  dev
6.�鿴��ʷ��¼ git log --graph --pretty=oneline --abbrev-commit

stash �洢����˼
git stash��	�ѵ�ǰ�Ĺ����������������Ժ�ָ��ֳ������������
git stash list���鿴���б����ص��ļ��б�
git stash apply���ָ������ص��ļ����������ݲ�ɾ����
git stash drop��ɾ���ļ���
git stash pop���ָ��ļ���ͬʱҲɾ���ļ���

