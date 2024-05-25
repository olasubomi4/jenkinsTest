pipeline {
    agent any
     tools {
            maven 'mv'  // Use the name given in Global Tool Configuration
        }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Deliver') {
            steps {
                sh './jenkins/scripts/deliver.sh'
            }
        }
    }
}