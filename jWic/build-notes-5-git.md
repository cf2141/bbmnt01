# ...
on github.com create branch prune

# from cmmand line
## link
https://www.nobledesktop.com/learn/git/git-branches

tr9210 > git branch
* main
tr9210 > git branch -r
  origin/HEAD -> origin/main
  origin/main
tr9210 > git branch -a
* main
  remotes/origin/HEAD -> origin/main
  remotes/origin/main
tr9210 > git checkout prune01
error: pathspec 'prune01' did not match any file(s) known to git
tr9210 > git pull
From github.com:cf2141/bbmnt01
 * [new branch]      prune01    -> origin/prune01
Already up to date.
tr9210 > git branch
* main
tr9210 > git branch -r
  origin/HEAD -> origin/main
  origin/main
  origin/prune01
tr9210 >

