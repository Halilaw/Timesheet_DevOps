   pipeline 
   {
         agent any
stages {
      stage("Cloning Project") {
      steps {
      git branch: 'Master', url: 'https://github.com/Halilaw/Timesheet_DevOps.git'
            }}
              stage("Build") {
       steps {
       
       bat "mvn clean install"
             }}

      stage("Unit tests") {
       steps {
       
       bat "mvn test"
             }}
    
	  stage("test statique") {
       steps{
		bat "mvn clean verify sonar:sonar -Dsonar.projectKey=timesheet -Dsonar.host.url=http://localhost:9000 -Dsonar.login=443bd1e56d5ed8471b38c0a9a5040043fc608c92"		
			}}
	  stage ("clean et packaging") {    
       steps {
         bat "mvn clean package "
			}}

      stage("DEPLOY with Nexus") {
      steps {
       bat "mvn mvn deploy"
			}}
		}
	}