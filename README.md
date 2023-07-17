git Clone https://github.com/AcmeLakhan/TCSrc.git		--> used to cone the central repository into local

git add --all 
	OR
git add .			--> All these are used to add files into stagging area 
	OR 
git add POM.xml


git restore --staged POM.xml	--> used to remove from stagging area to as it back

git commit -m "write your commit message here"	--> 	used to add files into local repository

git push origin master	--> 	used to add local repository files to central repository

git pull https://github.com/AcmeLakhan/TCSrc.git	--> used to pull all project to local repository

-----------------------------------------------------------------------------------------------------
git remote add origin https://github.com/AcmeLakhan/TCSrc.git	--> used to connect the connection between local git repository to github
git remote remove origin 	--> 	used to disconnect the connection

*** you can also use conection like custom name ***
git remote add PayTm https://github.com/AcmeLakhan/TCSrc.git		
git remote remove PayTm 

git remote -v 	--> used to  check the connect is established or not
