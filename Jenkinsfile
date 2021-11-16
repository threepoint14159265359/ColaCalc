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
            junit 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/*.jar', onlyIfSuccessful: true
            publishHTML (target: [
                allowMissing: false,
                alwaysLinkToLastBuild: false,
                keepAll: true,
                reportDir: 'target/surefire-reports',
                reportFiles: 'index.html',
                reportName: "Test Report"
            ])
        }
    }
}
