# links
https://www.markdownguide.org/
https://www.markdownguide.org/getting-started/
https://www.markdownguide.org/basic-syntax/

# 

- MacTwo
- VERIFY BRANCH
- work on MacTwo
- git checkout a branch
- make changes on MacTwo
- git add, commit, push

- crtp1
- VERIFY BRANCH
- pull on crtp1
- build 
    - mvn package
- copy 

#



link followed
https://www.geeksforgeeks.org/how-to-fix-master-branch-and-origin-master-have-diverged/

tr9210 > git status
On branch prune01
Your branch and 'origin/prune01' have diverged,
and have 3 and 1 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)

nothing to commit, working tree clean
tr9210 > git add .
tr9210 > git rebase --continue
fatal: No rebase in progress?
tr9210 > git commit -m "resolved confilicts"
On branch prune01
Your branch and 'origin/prune01' have diverged,
and have 3 and 1 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)

nothing to commit, working tree clean
tr9210 > git push
To github.com:cf2141/bbmnt01.git
 ! [rejected]        prune01 -> prune01 (non-fast-forward)
error: failed to push some refs to 'github.com:cf2141/bbmnt01.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
tr9210 > git pull origin main --rebase
From github.com:cf2141/bbmnt01
 * branch            main       -> FETCH_HEAD
Current branch prune01 is up to date.
tr9210 > git log --oneline --graph --decorate --all
* b8312d5 (HEAD -> prune01) added notes
* 0f26f0c (origin/main, origin/HEAD, main) git branch notes added
* ff2783c added new notes file, build-notes-5-git.md
| * 74eab57 (origin/prune01) audio-test
|/
* 8b3935e commit saved file
* 195720c update html file and add mp3
* 211885d move audio test to web-root
* 2388e28 index file for audio test
* b926db2 index.html for audio test
Merge remote-tracking branch 'origin/prune01' into prune01
* d992bf6 add build note # 4, a simple audio test
* 79a0abb file type changes
* b7a5160 file type change
* 5d06a68 AC2 working
* 16bea63 Added AC2, Audio Control number 2
* f299883 first working MobileAudioRND
* 6893853 removed ~ files
tr9210 > git log --oneline origin/master ^master
fatal: ambiguous argument 'origin/master': unknown revision or path not in the working tree.
Use '--' to separate paths from revisions, like this:
'git <command> [<revision>...] -- [<file>...]'
tr9210 > git log --oneline origin/prune01 ^prune01
74eab57 (origin/prune01) audio-test
tr9210 > git fetch origin
tr9210 > git merge origin/prune01
Merge made by the 'ort' strategy.
 jWic/.target-mvn/jwic-samples/classes/de/jwic/audio-test/index.html                   |   8 ++++++++
 .../jwic-samples/jwic-samples-5.3.42-SNAPSHOT/audio-test/file_example_MP3_700KB.mp3   | Bin 0 -> 764176 bytes
 jWic/.target-mvn/jwic-samples/jwic-samples-5.3.42-SNAPSHOT/audio-test/index.html      |  14 ++++++++++++++
 3 files changed, 22 insertions(+)
 create mode 100644 jWic/.target-mvn/jwic-samples/classes/de/jwic/audio-test/index.html
 create mode 100644 jWic/.target-mvn/jwic-samples/jwic-samples-5.3.42-SNAPSHOT/audio-test/file_example_MP3_700KB.mp3
 create mode 100644 jWic/.target-mvn/jwic-samples/jwic-samples-5.3.42-SNAPSHOT/audio-test/index.html
tr9210 > git log --oneline --graph --decorate --all
*   ac2543a (HEAD -> prune01) Merge remote-tracking branch 'origin/prune01' into prune01 learning git, this is anoying
|\
| * 74eab57 (origin/prune01) audio-test
* | b8312d5 added notes
* | 0f26f0c (origin/main, origin/HEAD, main) git branch notes added
* | ff2783c added new notes file, build-notes-5-git.md
|/
* 8b3935e commit saved file
* 195720c update html file and add mp3
* 211885d move audio test to web-root
* 2388e28 index file for audio test
* b926db2 index.html for audio test
* d992bf6 add build note # 4, a simple audio test
* 79a0abb file type changes
tr9210 > git pull
Already up to date.
