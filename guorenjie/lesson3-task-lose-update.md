git log #查看提交历史
*************************************************
修改最后一次提交
有时候我们提交完了才发现漏掉了几个文件没有加，或者提交信息写错了。想要撤消刚才的提交操作，可以使用 --amend 选项重新提交：git commit --amend
此命令将使用当前的暂存区域快照提交。如果刚才提交完没有作任何改动，直接运行此命令的话，相当于有机会重新编辑提交说明，但将要提交的文件快照和之前的一样。
如果刚才提交时忘了暂存某些修改，可以先补上暂存操作，然后再运行 --amend 提交：
$ git commit -m 'initial commit'
$ git add forgotten_file
$ git commit --amend
上面的三条命令最终只是产生一个提交，第二个提交命令修正了第一个的提交内容。



touch  .gitignore              新建一个.gitignore的文件
touch  guorenjie/.gitignore     在目录guorenjie下创建一个.gitignore的文

件
ls    显示目录下的文件
mv hello.gitignore .gitignore     该文件名
mv .gitignore guorenjie/          移动文件
(如果被git跟踪的命令前就要加git，没跟踪就不用加或手动操作)
q   退出命令

浏览器ctrl f 打开搜索



$ git clone <url> #克隆远程版本库
$ git init #初始化本地版本库
修改和提交

$ git status #查看状态
$ git diff #查看变更内容
$ git add . #跟踪所有改动过的文件
$ git add <file> #跟踪指定的文件
$ git mv <old> <new> #文件改名
$ git rm <file> #删除文件
$ git rm --cached <file> #停止跟踪文件但不删除
$ git commit -m “commit message” #提交所有更新过

的文件
$ git commit --amend #修改最后一次提交
查看提交历史,共用一次commit