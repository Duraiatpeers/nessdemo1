pipeline {

    agent any

    tools {
        maven "Maven 3.9.3"
    }

    stages {
        stage('clean') {
            steps {
                echo 'clean successful'
                bat 'mvn clean'
            }
        }
        stage('compile') {
            steps {
                echo 'compile done'
                bat 'mvn compile'
            }
        }
        stage('test') {
            steps {
                echo 'test done'
                bat 'mvn test'
            }
        }
    }

    post{
         always{
            echo 'Execution completed'
         }
        
         success{
            echo 'Successful execution'
         }

        
         failure{
            echo 'Failed execution '
            emailext body:'Test message for failures'  subject:'${BUILD_NUMBER}-${JOB_NAME}'  to:'duraiatpeers@gmail.com'
         }
    }       
}
