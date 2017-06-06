## Notes
1. This is a child project inside a parent project which includes the child as an external library

    ```       
    repositories {    
        mavenCentral()
        maven {
            url uri('./repo')
        }
    }
    
    
    dependencies {
        compile "foo.bar:commons-speaker:1.0"
    }
    ```
2. Open a command prompt, go to the project directory, and further go to the child project, and typing the following command will build the jar, doc, and sources into a maven form, and places into a `/repo`

    ```        
    cd plugin
    gradle clean jar uploadArchives        
    ```
3. Once the built, change back to the parent project, and have a build

    ```    
    cd ..
    gradle clean test build run         
    ``` 