pipeline {
    agent any
       triggers {
            githubPush()
        }
     tools {
            maven 'mv'  // Use the name given in Global Tool Configuration
        }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
            stage('hello') {
                    steps {
                        echo 'hello test 3'
                    }
                }
    }
}