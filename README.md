# callBack
git 远程仓库创建后

先在github上面创建项目

然后本地执行：

git init

git remote add origin git@github.com:along1013/callBack.git

新建 .gitignore

加入一些忽略文件

# Created by .ignore support plugin (hsz.mobi)
.idea
.gitignore
callBack.iml
/target


git add src/

git add .gitignore

git commit -m "first commit"


git commit  -m "提交的描述信息"
如果我们这里不用-m参数的话，git将调到一个文本编译器（通常是vim）来让你输入提交的描述信息
可能一天下来，你对工作树中的许多文档都进行了更新（文档添加、修改、删除），但是我忘记了它们的名字，此时若将所做的全部更新添加到索引中，比较轻省的做法就是：

git commit -a -m "提交的描述信息"
git commit 命令的-a 选项可只将所有被修改或者已删除的且已经被git管理的文档提交倒仓库中。如果只是修改或者删除了已被Git 管理的文档，是没必要使用git add 命令的。
