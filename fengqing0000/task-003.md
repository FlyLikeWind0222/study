进入到study目录下。
1.touch hello.tmp新建一个hello.tmp文件
2.git status 查看状态 显示tmp文件处于未跟踪状态
3.touch .gitignore 创建一个.gitignore文件
4.编辑.gitignore文件 把*.tmp写到里面
5.git status 不会看到tmp处于未跟踪状态的提示了，只有.gitignore处于未跟踪状态
6.git add .gitignore
7.git commit -m"this is my third task"