pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t jenkins-springboot-cicd-demo:1.0 .'
            }
        }

        stage('Docker Run') {
            steps {
                bat 'docker run -d -p 8081:8081 --name jenkins-springboot-container jenkins-springboot-cicd-demo:1.0'
            }
        }
    }
}