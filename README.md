# modular-backpacks

## What is this?


### Requirements
- Java 8 JDK
- Java IDE (preferably VS Code)
- [Forge 1.15.2 MDK](https://adfoc.us/serve/?id=27122885838970)

### Installation
These steps use VS Code as the IDE. Once you have the above requirements downloaded, follow the steps below.

1. Launch VS Code and open this project
2. Run `./gradlew genVSCodeRuns`
3. You should now see a runClient and runServer run configuration
4. Ensure that the MC_VERSION environment variable of the launch configurations is set to 1.18.2
5. Launching runClient will launch Minecraft. 
6. Congrats, you have now set up this modpack!