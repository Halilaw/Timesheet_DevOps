 pipeline {
    agent any
   tools {





        maven 'MAVEN_HOME'
         jdk 'JDK_HOME'
    }
    stages {

        stage('clone git repo'){
            steps {
                bat "if exist Timesheet_DevOps rmdir /s /q Timesheet_DevOps"
                bat "git clone -b salimbranch https://github.com/Halilaw/Timesheet_DevOps.git"
            }
        }
        
          stage('sonar'){
            steps {
                dir("Timesheet_DevOps"){
                    bat "mvn sonar:sonar"
                }
            }
        }
        
         stage("mvn test") {
            steps {
                dir("Timesheet_DevOps"){
                     bat "mvn test"
                }
            }
        }
       
       
        
       
     stage("mvn package") {
            steps {
                dir("Timesheet_DevOps"){
                    bat "mvn package -Dmaven.test.skip"
                }
            }
        }
        stage("Deployment stage") {
            steps {
                dir('Timesheet_DevOps') {
                    bat "mvn deploy"
                }
            }
        }    
         
         
         
        stage('Building docker image') {
          steps{
                dir("Timesheet_DevOps") {
                    
			bat "docker build -t devops ."
			
			bat "docker tag devops  salimbrahim/devops:1"
			bat"docker login -u salimbrahim -p SalimBrahim1998"
			bat "docker push  salimbrahim/devops:1"			
                }
            }    
        }
            
            
          
        
       
      
          
       
    }
    
    
     post { 
        

    
        always { 
            echo 'I will always say Hello again!'
            emailext (to: 'salimbrahim44@gmail.com',
            replyTo: 'salimbrahim44@gmail.com',
            subject: "Email Report from - '${env.JOB_NAME}' ",
            attachLog:true,
            body: readFile("C:/Program Files (x86)/Jenkins/workspace/timesheet_mission/Timesheet_DevOps/Mission.txt"));
        }
    }
    
    
    
    
    
}
