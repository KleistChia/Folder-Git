# How to Use GitHub, SourceTree, Git Bash/Git CMD

## The thing that learn Today
1. Understand the common git branches flow
2. Learning how to use Postman for REST services

#### Note: SourceTree, Git are installed
1. Create GitHub Acc then create new Repository in github.com/<YOUR_ACCOUNT_NAME>?tab=repositories
2. Give new repository a name, the rest is opional and click create repository
3. Use SourceTree to clone github repository by click on File>> Clone/New>> remove account >> <REPOSITORY_NAME>
4. Click on Add if consist existing repository on the local PC/laptop (Sign-in GitHub Acc is necessary)
   * Repository created on GitHub = Remote repository while local repository refer local git Repository
5. Click Create to create new local Repository, else open up Git CMD/command prompt to create new Repository
   * CMD command: git init   (Inside the repository folder)
   * CMD command: git add echo >> README.md (Using README.md as simulation of projects)
   * CMD command: git commit -m "First Commit" (Try to Follow the [Message Format](#Message) for "First Commit"
   * CMD command: git remote add origin <REMOVE_REPOSITORY_URL>
   * CMD command: git push origin master
6. Stage use to select the files that need to commit
7. Commit is use to commit any stage file before push to the Remote Repo
8. Once is commit, use Push to push the file to Remote Repo
9. Pull use to pull any new changes from the remote repo to local repo and overwrite it
10. Fetch is to pull any new changes fro mthe remote repo to local repo .git files, so it do not overwrite the file
11. Branch use to create new branch,image Below show file(project features) changes according to the branch over Time
    
    ![Branches of a project](https://datasift.github.io/gitflow/GitFlowHotfixBranch.png)
    
12. Merge use to merge 2 branches together (After merge Branch A to master, Branch A will still there until user remove it
13. Stash use to save those files which are not yet commit.(Which might useful when u want checkout to another branch while not yet commit current files
14. Revert use to revert the selected point of commit + push.(if revert a revert point will undo that revert)


<a name="Message"><b>Git Commit Message Format </b></a>

Subject: Min-50 Max-72 Char in First Line, Truncate Begin 73's Char
<br>                                
Details Explanation text approximate **72 Char** at Each Line, **Explain the Problems** that this 
**Commit** is trying to **Resolve**, the **Reason of Change**. Is Good to use **Point Form** too.
* References: [How to Write a Git Commit Message](https://chris.beams.io/posts/git-commit/)



