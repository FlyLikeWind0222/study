1.忽略文件 先建一个.gitignore文件 touch .gitignore  然后编辑文件 比如 *.tmp
2.git status 查看状态 显示tmp文件处于未跟踪状态
3.cat hello.tmp 显示文件内容 类似命令还有less more
4.git rm 修改文件名
5.mv 未跟踪状态下可以用 git mv  修改或者移动文件
6.git log 查看提交历史记录
7.git add 添加历史记录
8.git commit -m提交记录
9.git commit --amend 提交所有记录
10.git reset --hard HEAD撤消工作目录中所有未提交文件的修改内容
