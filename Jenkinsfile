pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                sh 'mvn clean' 
            }
        }
        stage('Build') {
            steps {
                sh 'mvn compile' 
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test' 
            }
        }

        stage('package') {
            steps {
                sh 'mvn package' 
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'target/*.jar', onlyIfSuccessful: true
        }
    }
}
