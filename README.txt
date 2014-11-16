-------------------------------------------
Source installation information for modders
-------------------------------------------
If so, open up a command prompt and go to wherever you checked out the code.  
Lets call it C:\Users\You\Desktop\Standard  
cd to C:\Users\You\Desktop\Standard  
run "gradlew setupDevWorkspace eclipse" and wait for it to finish  
Open eclipse  
Go File->Import->Existing Projects into Workspace  
Click "Browse..." beside "select root directory"  
Open up C:\Users\You\Desktop\Standard  
click Ok and Finish and the project should get imported  
Click Run->Run Configurations  
under "Java Application" right click and click "New"  
For Project enter "Standard" and for Main class enter "GradleStart"  
Now you should be able to run your code from eclipse and it'll fire up Minecraft with your mod loaded.  
  
(If you're on linux, I think the only difference is that you use "gradle" instead of gradlew,  
and you might need to install gradle)  

-------------------------------------------
For players
-------------------------------------------
Use git to checkout the source to some/directory/Standard
run gradlew (or gradle on linux) with the following command:  
*gradlew build*  
This will create a .jar file inside some/directory/Standard/build  
Copy this .jar file to your .minecraft/mods folder  
Enjoy
